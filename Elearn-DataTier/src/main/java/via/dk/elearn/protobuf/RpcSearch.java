// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_search.proto

package via.dk.elearn.protobuf;

public final class RpcSearch {
  private RpcSearch() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SearchLecturesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SearchLecturesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SearchUsersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SearchUsersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SearchQuestionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SearchQuestionsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020rpc_search.proto\032\021rpc_lecture.proto\032\016r" +
      "pc_user.proto\032\022rpc_question.proto\"&\n\025Sea" +
      "rchLecturesRequest\022\r\n\005title\030\001 \001(\t\"&\n\022Sea" +
      "rchUsersRequest\022\020\n\010userName\030\001 \001(\t\"\'\n\026Sea" +
      "rchQuestionsRequest\022\r\n\005title\030\001 \001(\t2\272\001\n\rS" +
      "earchService\0229\n\016SearchLectures\022\026.SearchL" +
      "ecturesRequest\032\r.LectureModel0\001\0220\n\013Searc" +
      "hUsers\022\023.SearchUsersRequest\032\n.UserModel0" +
      "\001\022<\n\017SearchQuestions\022\027.SearchQuestionsRe" +
      "quest\032\016.QuestionModel0\001B\032\n\026via.dk.elearn" +
      ".protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          via.dk.elearn.protobuf.RpcLecture.getDescriptor(),
          via.dk.elearn.protobuf.RpcUser.getDescriptor(),
          via.dk.elearn.protobuf.RpcQuestion.getDescriptor(),
        });
    internal_static_SearchLecturesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SearchLecturesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SearchLecturesRequest_descriptor,
        new java.lang.String[] { "Title", });
    internal_static_SearchUsersRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_SearchUsersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SearchUsersRequest_descriptor,
        new java.lang.String[] { "UserName", });
    internal_static_SearchQuestionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_SearchQuestionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SearchQuestionsRequest_descriptor,
        new java.lang.String[] { "Title", });
    via.dk.elearn.protobuf.RpcLecture.getDescriptor();
    via.dk.elearn.protobuf.RpcUser.getDescriptor();
    via.dk.elearn.protobuf.RpcQuestion.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
