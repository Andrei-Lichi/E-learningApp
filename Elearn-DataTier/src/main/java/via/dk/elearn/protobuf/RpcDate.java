// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_date.proto

package via.dk.elearn.protobuf;

public final class RpcDate {
  private RpcDate() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DateModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DateModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016rpc_date.proto\"c\n\tDateModel\022\014\n\004year\030\001 " +
      "\001(\005\022\r\n\005month\030\002 \001(\005\022\013\n\003day\030\003 \001(\005\022\014\n\004hour\030" +
      "\004 \001(\005\022\016\n\006minute\030\005 \001(\005\022\016\n\006second\030\006 \001(\005B\032\n" +
      "\026via.dk.elearn.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DateModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DateModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DateModel_descriptor,
        new java.lang.String[] { "Year", "Month", "Day", "Hour", "Minute", "Second", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
