// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_lecture_vote.proto

package via.dk.elearn.protobuf;

public interface VoteCounterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:VoteCounter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.LectureModel post = 1;</code>
   * @return Whether the post field is set.
   */
  boolean hasPost();
  /**
   * <code>.LectureModel post = 1;</code>
   * @return The post.
   */
  via.dk.elearn.protobuf.LectureModel getPost();
  /**
   * <code>.LectureModel post = 1;</code>
   */
  via.dk.elearn.protobuf.LectureModelOrBuilder getPostOrBuilder();

  /**
   * <code>int64 upvoteCount = 2;</code>
   * @return The upvoteCount.
   */
  long getUpvoteCount();

  /**
   * <code>int64 downvoteCount = 3;</code>
   * @return The downvoteCount.
   */
  long getDownvoteCount();
}
