// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor.proto

package com.oltpbenchmark.api.collectors.monitoring.proto;

public final class Monitor {
  private Monitor() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_InfoPair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_InfoPair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfoLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfoLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_EventPair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_EventPair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEventLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEventLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_EventPair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_EventPair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEventLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEventLog_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmonitor.proto\0221com.oltpbenchmark.api.c" +
      "ollectors.monitoring.proto\032\037google/proto" +
      "buf/timestamp.proto\"\201\003\n\tQueryInfo\022\027\n\nide" +
      "ntifier\030\001 \001(\tH\000\210\001\001\022X\n\tinfo_pair\030\003 \003(\0132E." +
      "com.oltpbenchmark.api.collectors.monitor" +
      "ing.proto.QueryInfo.InfoPair\032\361\001\n\010InfoPai" +
      "r\022T\n\013string_type\030\001 \001(\0162=.com.oltpbenchma" +
      "rk.api.collectors.monitoring.proto.Strin" +
      "gTypeH\000\022P\n\tlong_type\030\002 \001(\0162;.com.oltpben" +
      "chmark.api.collectors.monitoring.proto.L" +
      "ongTypeH\000\022\026\n\014string_value\030\003 \001(\tH\001\022\024\n\nlon" +
      "g_value\030\004 \001(\003H\001B\006\n\004typeB\007\n\005valueB\r\n\013_ide" +
      "ntifier\"Z\n\014QueryInfoLog\022J\n\004info\030\001 \003(\0132<." +
      "com.oltpbenchmark.api.collectors.monitor" +
      "ing.proto.QueryInfo\"\310\003\n\nQueryEvent\022\027\n\nid" +
      "entifier\030\001 \001(\tH\000\210\001\001\0222\n\ttimestamp\030\002 \001(\0132\032" +
      ".google.protobuf.TimestampH\001\210\001\001\022[\n\nevent" +
      "_pair\030\003 \003(\0132G.com.oltpbenchmark.api.coll" +
      "ectors.monitoring.proto.QueryEvent.Event" +
      "Pair\032\362\001\n\tEventPair\022T\n\013string_type\030\001 \001(\0162" +
      "=.com.oltpbenchmark.api.collectors.monit" +
      "oring.proto.StringTypeH\000\022P\n\tlong_type\030\002 " +
      "\001(\0162;.com.oltpbenchmark.api.collectors.m" +
      "onitoring.proto.LongTypeH\000\022\026\n\014string_val" +
      "ue\030\003 \001(\tH\001\022\024\n\nlong_value\030\004 \001(\003H\001B\006\n\004type" +
      "B\007\n\005valueB\r\n\013_identifierB\014\n\n_timestamp\"]" +
      "\n\rQueryEventLog\022L\n\005event\030\001 \003(\0132=.com.olt" +
      "pbenchmark.api.collectors.monitoring.pro" +
      "to.QueryEvent\"\232\002\n\tPerfEvent\0222\n\ttimestamp" +
      "\030\001 \001(\0132\032.google.protobuf.TimestampH\000\210\001\001\022" +
      "Z\n\nevent_pair\030\002 \003(\0132F.com.oltpbenchmark." +
      "api.collectors.monitoring.proto.PerfEven" +
      "t.EventPair\032o\n\tEventPair\022N\n\tlong_type\030\001 " +
      "\001(\0162;.com.oltpbenchmark.api.collectors.m" +
      "onitoring.proto.LongType\022\022\n\nlong_value\030\002" +
      " \001(\003B\014\n\n_timestamp\"[\n\014PerfEventLog\022K\n\005ev" +
      "ent\030\001 \003(\0132<.com.oltpbenchmark.api.collec" +
      "tors.monitoring.proto.PerfEvent*M\n\nStrin" +
      "gType\022\016\n\nQUERY_TEXT\020\000\022\016\n\nQUERY_PLAN\020\001\022\016\n" +
      "\nIDENTIFIER\020\002\022\017\n\013PLAN_HANDLE\020\003*\241\007\n\010LongT" +
      "ype\022\023\n\017EXECUTION_COUNT\020\000\022\023\n\017MIN_WORKER_T" +
      "IME\020\001\022\023\n\017MAX_WORKER_TIME\020\002\022\025\n\021TOTAL_WORK" +
      "ER_TIME\020\003\022\026\n\022MIN_PHYSICAL_READS\020\004\022\026\n\022MAX" +
      "_PHYSICAL_READS\020\005\022\030\n\024TOTAL_PHYSICAL_READ" +
      "S\020\006\022\024\n\020MIN_ELAPSED_TIME\020\007\022\024\n\020MAX_ELAPSED" +
      "_TIME\020\010\022\026\n\022TOTAL_ELAPSED_TIME\020\t\022\014\n\010MIN_R" +
      "OWS\020\n\022\014\n\010MAX_ROWS\020\013\022\016\n\nTOTAL_ROWS\020\014\022\016\n\nM" +
      "IN_SPILLS\020\r\022\016\n\nMAX_SPILLS\020\016\022\020\n\014TOTAL_SPI" +
      "LLS\020\017\022\017\n\013USED_MEMORY\020\020\022\021\n\rTARGET_MEMORY\020" +
      "\021\022\022\n\016CPU_USAGE_PERC\020\022\022\026\n\022CPU_EFFECTIVE_P" +
      "ERC\020\023\022\025\n\021CPU_VIOLATED_PERC\020\024\022\030\n\024TOTAL_LO" +
      "GICAL_WRITES\020\025\022\026\n\022MIN_LOGICAL_WRITES\020\026\022\026" +
      "\n\022MAX_LOGICAL_WRITES\020\027\022\027\n\023TOTAL_LOGICAL_" +
      "READS\020\030\022\025\n\021MIN_LOGICAL_READS\020\031\022\025\n\021MAX_LO" +
      "GICAL_READS\020\032\022\027\n\023TOTAL_USED_GRANT_KB\020\033\022\025" +
      "\n\021MIN_USED_GRANT_KB\020\034\022\025\n\021MAX_USED_GRANT_" +
      "KB\020\035\022\026\n\022TOTAL_USED_THREADS\020\036\022\024\n\020MIN_USED" +
      "_THREADS\020\037\022\024\n\020MAX_USED_THREADS\020 \022\027\n\023CPU_" +
      "USAGE_PERC_BASE\020!\022\033\n\027CPU_EFFECTIVE_PERC_" +
      "BASE\020\"\022\031\n\025CPU_USAGE_TARGET_PERC\020#\022\022\n\016DIS" +
      "K_READ_IOPS\020$\022\023\n\017DISK_WRITE_IOPS\020%\022\027\n\023LO" +
      "CKS_AVG_WAIT_TIME\020&\022\034\n\030LOCKS_AVG_WAIT_TI" +
      "ME_BASE\020\'\022\021\n\rLOCK_REQUESTS\020(\022\014\n\010MS_TICKS" +
      "\020)B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_descriptor,
        new java.lang.String[] { "Identifier", "InfoPair", "Identifier", });
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_InfoPair_descriptor =
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_descriptor.getNestedTypes().get(0);
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_InfoPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfo_InfoPair_descriptor,
        new java.lang.String[] { "StringType", "LongType", "StringValue", "LongValue", "Type", "Value", });
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfoLog_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfoLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryInfoLog_descriptor,
        new java.lang.String[] { "Info", });
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_descriptor,
        new java.lang.String[] { "Identifier", "Timestamp", "EventPair", "Identifier", "Timestamp", });
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_EventPair_descriptor =
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_descriptor.getNestedTypes().get(0);
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_EventPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEvent_EventPair_descriptor,
        new java.lang.String[] { "StringType", "LongType", "StringValue", "LongValue", "Type", "Value", });
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEventLog_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEventLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_QueryEventLog_descriptor,
        new java.lang.String[] { "Event", });
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_descriptor,
        new java.lang.String[] { "Timestamp", "EventPair", "Timestamp", });
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_EventPair_descriptor =
      internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_descriptor.getNestedTypes().get(0);
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_EventPair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEvent_EventPair_descriptor,
        new java.lang.String[] { "LongType", "LongValue", });
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEventLog_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEventLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_oltpbenchmark_api_collectors_monitoring_proto_PerfEventLog_descriptor,
        new java.lang.String[] { "Event", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}