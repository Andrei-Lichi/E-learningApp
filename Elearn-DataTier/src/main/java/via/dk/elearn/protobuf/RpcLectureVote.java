// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_lecture_vote.proto

package via.dk.elearn.protobuf;

public final class RpcLectureVote {
  private RpcLectureVote() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VoteModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VoteModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VoteCounter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VoteCounter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VoteId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VoteId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026rpc_lecture_vote.proto\032\021rpc_lecture.pr" +
      "oto\032\016rpc_user.proto\"R\n\tVoteModel\022\030\n\004user" +
      "\030\001 \001(\0132\n.UserModel\022\033\n\004post\030\002 \001(\0132\r.Lectu" +
      "reModel\022\016\n\006upvote\030\003 \001(\010\"V\n\013VoteCounter\022\033" +
      "\n\004post\030\001 \001(\0132\r.LectureModel\022\023\n\013upvoteCou" +
      "nt\030\002 \001(\003\022\025\n\rdownvoteCount\030\003 \001(\003\"?\n\006VoteI" +
      "d\022\030\n\004user\030\001 \001(\0132\n.UserModel\022\033\n\004post\030\002 \001(" +
      "\0132\r.LectureModel2\224\001\n\022LectureVoteService\022" +
      "%\n\013VoteLecture\022\n.VoteModel\032\n.VoteModel\0223" +
      "\n\024GetLectureVotesCount\022\r.LectureModel\032\014." +
      "VoteCounter\022\"\n\013GetVoteById\022\007.VoteId\032\n.Vo" +
      "teModelB\'\n\026via.dk.elearn.protobufP\001\252\002\nEl" +
      "earnGrpcb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          via.dk.elearn.protobuf.RpcLecture.getDescriptor(),
          via.dk.elearn.protobuf.RpcUser.getDescriptor(),
        });
    internal_static_VoteModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VoteModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VoteModel_descriptor,
        new java.lang.String[] { "User", "Post", "Upvote", });
    internal_static_VoteCounter_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_VoteCounter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VoteCounter_descriptor,
        new java.lang.String[] { "Post", "UpvoteCount", "DownvoteCount", });
    internal_static_VoteId_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_VoteId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VoteId_descriptor,
        new java.lang.String[] { "User", "Post", });
    via.dk.elearn.protobuf.RpcLecture.getDescriptor();
    via.dk.elearn.protobuf.RpcUser.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
