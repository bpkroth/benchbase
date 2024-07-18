package com.oltpbenchmark.api.collectors.monitoring;

import com.oltpbenchmark.BenchmarkState;
import com.oltpbenchmark.WorkloadConfiguration;
import com.oltpbenchmark.api.BenchmarkModule;
import com.oltpbenchmark.api.Worker;
import com.oltpbenchmark.util.MonitorInfo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySQLMonitor extends DatabaseMonitor {

  // TODO: add support for per-query metrics using performance_schema

  // TODO: Expand to SHOW ENGINE INNODB STATUS as well?
  private final String MYSQL_SYSTEM_METRICS = "SHOW GLOBAL STATUS;";

  private final List<String> repeatedSystemProperties;

  public MySQLMonitor(
      MonitorInfo monitorInfo,
      BenchmarkState testState,
      List<? extends Worker<? extends BenchmarkModule>> workers,
      WorkloadConfiguration conf) {
    super(monitorInfo, testState, workers, conf);

    this.repeatedSystemProperties =
        new ArrayList<String>() {
          {
            add("Connections");
            add("Threads_running");
            add("Threads_connected");
            add("Handler_write");
            add("Handler_commit");
            add("Handler_update");
            add("Handler_delete");
            add("Handler_read_next");
            add("Com_select");
            add("Com_insert");
            add("Com_insert_select");
            add("Com_update");
            add("Com_delete");
            add("Select_full_join");
            add("Select_full_range_join");
            add("Select_range");
            add("Select_range_check");
            add("Select_scan");
            add("Innodb_data_reads");
            add("Innodb_data_writes");
            add("Innodb_data_read");
            add("Innodb_data_written");
            add("Innodb_rows_deleted");
            add("Innodb_rows_inserted");
            add("Innodb_rows_read");
            add("Innodb_rows_updated");
            add("Innodb_buffer_pool_read_requests");
            add("Sort_merge_passes");
            add("Sort_range");
            add("Sort_rows");
            add("Sort_scan");
            add("Bytes_received");
            add("Bytes_sent");
          }
        };
  }

  @Override
  protected String getCleanupStmt() {
    // FIXME: Currently a no-op.
    return "SELECT 1";
  }

  /**
   * Extract system events using the extraction query and properties defined above, will fail
   * gracefully to not interrupt benchmarking.
   */
  private void extractPerformanceMetrics(Instant instant) {
    ImmutableRepeatedSystemEvent.Builder repeatedSystemEventBuilder =
        ImmutableRepeatedSystemEvent.builder();
    repeatedSystemEventBuilder.instant(instant);

    // Extract OS performance events.
    Map<String, String> propertyValues = new HashMap<String, String>();
    try (PreparedStatement stmt = conn.prepareStatement(MYSQL_SYSTEM_METRICS)) {
      ResultSet rs = stmt.executeQuery();
      while (rs.next()) {
        // Add property values.
        String metric_name = rs.getString(1).trim();
        if (this.repeatedSystemProperties.contains(metric_name)) {
          propertyValues.put(metric_name, rs.getString(2));
        }
      }
    } catch (SQLException sqlError) {
      LOG.error("Error when extracting system metrics from MySQL.");
      LOG.error(sqlError.getMessage());
    }
    repeatedSystemEventBuilder.propertyValues(propertyValues);
    this.repeatedSystemEvents.add(repeatedSystemEventBuilder.build());
  }

  @Override
  protected void runExtraction() {
    Instant time = Instant.now();

    // TODO: extractQueryMetrics(time);
    extractPerformanceMetrics(time);
  }

  @Override
  protected void writeSystemMetrics() {
    this.writeRepeatedSystemEventsToCSV();
  }
}
