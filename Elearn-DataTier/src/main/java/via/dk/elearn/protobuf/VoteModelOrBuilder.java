// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_lecture_vote.proto

package via.dk.elearn.protobuf;

public interface VoteModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:VoteModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.UserModel user = 1;</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>.UserModel user = 1;</code>
   * @return The user.
   */
  via.dk.elearn.protobuf.UserModel getUser();
  /**
   * <code>.UserModel user = 1;</code>
   */
  via.dk.elearn.protobuf.UserModelOrBuilder getUserOrBuilder();

  /**
   * <code>.LectureModel post = 2;</code>
   * @return Whether the post field is set.
   */
  boolean hasPost();
  /**
   * <code>.LectureModel post = 2;</code>
   * @return The post.
   */
  via.dk.elearn.protobuf.LectureModel getPost();
  /**
   * <code>.LectureModel post = 2;</code>
   */
  via.dk.elearn.protobuf.LectureModelOrBuilder getPostOrBuilder();

  /**
   * <code>bool upvote = 3;</code>
   * @return The upvote.
   */
  boolean getUpvote();
}
