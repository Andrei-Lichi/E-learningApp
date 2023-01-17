// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_teacher.proto

package via.dk.elearn.protobuf;

public final class RpcTeacher {
  private RpcTeacher() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeacherModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeacherModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeacherUsername_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TeacherUsername_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021rpc_teacher.proto\"\241\001\n\014TeacherModel\022\n\n\002" +
      "id\030\001 \001(\003\022\020\n\010username\030\002 \001(\t\022\r\n\005email\030\003 \001(" +
      "\t\022\014\n\004name\030\004 \001(\t\022\020\n\010password\030\005 \001(\t\022\r\n\005ima" +
      "ge\030\006 \001(\t\022\014\n\004role\030\007 \001(\t\022\025\n\rsecurityLevel\030" +
      "\010 \001(\005\022\020\n\010approved\030\t \001(\010\"#\n\017TeacherUserna" +
      "me\022\020\n\010username\030\001 \001(\t2I\n\016TeacherService\0227" +
      "\n\024getTeacherByUsername\022\020.TeacherUsername" +
      "\032\r.TeacherModelB\032\n\026via.dk.elearn.protobu" +
      "fP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TeacherModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeacherModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeacherModel_descriptor,
        new java.lang.String[] { "Id", "Username", "Email", "Name", "Password", "Image", "Role", "SecurityLevel", "Approved", });
    internal_static_TeacherUsername_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TeacherUsername_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TeacherUsername_descriptor,
        new java.lang.String[] { "Username", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
