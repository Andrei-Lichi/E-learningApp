// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_pagination.proto

package via.dk.elearn.protobuf;

public final class RpcPagination {
  private RpcPagination() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PaginationModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PaginationModel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024rpc_pagination.proto\"7\n\017PaginationMode" +
      "l\022\022\n\npageNumber\030\001 \001(\005\022\020\n\010pageSize\030\002 \001(\005B" +
      "\032\n\026via.dk.elearn.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PaginationModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PaginationModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PaginationModel_descriptor,
        new java.lang.String[] { "PageNumber", "PageSize", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}