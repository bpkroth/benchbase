// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor.proto

package com.oltpbenchmark.api.collectors.monitoring.proto;

public interface PerfEventLogOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.oltpbenchmark.api.collectors.monitoring.proto.PerfEventLog)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.oltpbenchmark.api.collectors.monitoring.proto.PerfEvent event = 1;</code>
   */
  java.util.List<com.oltpbenchmark.api.collectors.monitoring.proto.PerfEvent> 
      getEventList();
  /**
   * <code>repeated .com.oltpbenchmark.api.collectors.monitoring.proto.PerfEvent event = 1;</code>
   */
  com.oltpbenchmark.api.collectors.monitoring.proto.PerfEvent getEvent(int index);
  /**
   * <code>repeated .com.oltpbenchmark.api.collectors.monitoring.proto.PerfEvent event = 1;</code>
   */
  int getEventCount();
  /**
   * <code>repeated .com.oltpbenchmark.api.collectors.monitoring.proto.PerfEvent event = 1;</code>
   */
  java.util.List<? extends com.oltpbenchmark.api.collectors.monitoring.proto.PerfEventOrBuilder> 
      getEventOrBuilderList();
  /**
   * <code>repeated .com.oltpbenchmark.api.collectors.monitoring.proto.PerfEvent event = 1;</code>
   */
  com.oltpbenchmark.api.collectors.monitoring.proto.PerfEventOrBuilder getEventOrBuilder(
      int index);
}
