// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc_lecture_vote.proto

package via.dk.elearn.protobuf;

/**
 * Protobuf type {@code VoteCounter}
 */
public final class VoteCounter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VoteCounter)
    VoteCounterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoteCounter.newBuilder() to construct.
  private VoteCounter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoteCounter() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VoteCounter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VoteCounter(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            via.dk.elearn.protobuf.LectureModel.Builder subBuilder = null;
            if (post_ != null) {
              subBuilder = post_.toBuilder();
            }
            post_ = input.readMessage(via.dk.elearn.protobuf.LectureModel.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(post_);
              post_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            upvoteCount_ = input.readInt64();
            break;
          }
          case 24: {

            downvoteCount_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.dk.elearn.protobuf.RpcLectureVote.internal_static_VoteCounter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.dk.elearn.protobuf.RpcLectureVote.internal_static_VoteCounter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.dk.elearn.protobuf.VoteCounter.class, via.dk.elearn.protobuf.VoteCounter.Builder.class);
  }

  public static final int POST_FIELD_NUMBER = 1;
  private via.dk.elearn.protobuf.LectureModel post_;
  /**
   * <code>.LectureModel post = 1;</code>
   * @return Whether the post field is set.
   */
  @java.lang.Override
  public boolean hasPost() {
    return post_ != null;
  }
  /**
   * <code>.LectureModel post = 1;</code>
   * @return The post.
   */
  @java.lang.Override
  public via.dk.elearn.protobuf.LectureModel getPost() {
    return post_ == null ? via.dk.elearn.protobuf.LectureModel.getDefaultInstance() : post_;
  }
  /**
   * <code>.LectureModel post = 1;</code>
   */
  @java.lang.Override
  public via.dk.elearn.protobuf.LectureModelOrBuilder getPostOrBuilder() {
    return getPost();
  }

  public static final int UPVOTECOUNT_FIELD_NUMBER = 2;
  private long upvoteCount_;
  /**
   * <code>int64 upvoteCount = 2;</code>
   * @return The upvoteCount.
   */
  @java.lang.Override
  public long getUpvoteCount() {
    return upvoteCount_;
  }

  public static final int DOWNVOTECOUNT_FIELD_NUMBER = 3;
  private long downvoteCount_;
  /**
   * <code>int64 downvoteCount = 3;</code>
   * @return The downvoteCount.
   */
  @java.lang.Override
  public long getDownvoteCount() {
    return downvoteCount_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (post_ != null) {
      output.writeMessage(1, getPost());
    }
    if (upvoteCount_ != 0L) {
      output.writeInt64(2, upvoteCount_);
    }
    if (downvoteCount_ != 0L) {
      output.writeInt64(3, downvoteCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (post_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPost());
    }
    if (upvoteCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, upvoteCount_);
    }
    if (downvoteCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, downvoteCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.dk.elearn.protobuf.VoteCounter)) {
      return super.equals(obj);
    }
    via.dk.elearn.protobuf.VoteCounter other = (via.dk.elearn.protobuf.VoteCounter) obj;

    if (hasPost() != other.hasPost()) return false;
    if (hasPost()) {
      if (!getPost()
          .equals(other.getPost())) return false;
    }
    if (getUpvoteCount()
        != other.getUpvoteCount()) return false;
    if (getDownvoteCount()
        != other.getDownvoteCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPost()) {
      hash = (37 * hash) + POST_FIELD_NUMBER;
      hash = (53 * hash) + getPost().hashCode();
    }
    hash = (37 * hash) + UPVOTECOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getUpvoteCount());
    hash = (37 * hash) + DOWNVOTECOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDownvoteCount());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.dk.elearn.protobuf.VoteCounter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.dk.elearn.protobuf.VoteCounter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.dk.elearn.protobuf.VoteCounter prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code VoteCounter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VoteCounter)
      via.dk.elearn.protobuf.VoteCounterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.dk.elearn.protobuf.RpcLectureVote.internal_static_VoteCounter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.dk.elearn.protobuf.RpcLectureVote.internal_static_VoteCounter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.dk.elearn.protobuf.VoteCounter.class, via.dk.elearn.protobuf.VoteCounter.Builder.class);
    }

    // Construct using via.dk.elearn.protobuf.VoteCounter.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (postBuilder_ == null) {
        post_ = null;
      } else {
        post_ = null;
        postBuilder_ = null;
      }
      upvoteCount_ = 0L;

      downvoteCount_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.dk.elearn.protobuf.RpcLectureVote.internal_static_VoteCounter_descriptor;
    }

    @java.lang.Override
    public via.dk.elearn.protobuf.VoteCounter getDefaultInstanceForType() {
      return via.dk.elearn.protobuf.VoteCounter.getDefaultInstance();
    }

    @java.lang.Override
    public via.dk.elearn.protobuf.VoteCounter build() {
      via.dk.elearn.protobuf.VoteCounter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.dk.elearn.protobuf.VoteCounter buildPartial() {
      via.dk.elearn.protobuf.VoteCounter result = new via.dk.elearn.protobuf.VoteCounter(this);
      if (postBuilder_ == null) {
        result.post_ = post_;
      } else {
        result.post_ = postBuilder_.build();
      }
      result.upvoteCount_ = upvoteCount_;
      result.downvoteCount_ = downvoteCount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.dk.elearn.protobuf.VoteCounter) {
        return mergeFrom((via.dk.elearn.protobuf.VoteCounter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.dk.elearn.protobuf.VoteCounter other) {
      if (other == via.dk.elearn.protobuf.VoteCounter.getDefaultInstance()) return this;
      if (other.hasPost()) {
        mergePost(other.getPost());
      }
      if (other.getUpvoteCount() != 0L) {
        setUpvoteCount(other.getUpvoteCount());
      }
      if (other.getDownvoteCount() != 0L) {
        setDownvoteCount(other.getDownvoteCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.dk.elearn.protobuf.VoteCounter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.dk.elearn.protobuf.VoteCounter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private via.dk.elearn.protobuf.LectureModel post_;
    private com.google.protobuf.SingleFieldBuilderV3<
        via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.LectureModel.Builder, via.dk.elearn.protobuf.LectureModelOrBuilder> postBuilder_;
    /**
     * <code>.LectureModel post = 1;</code>
     * @return Whether the post field is set.
     */
    public boolean hasPost() {
      return postBuilder_ != null || post_ != null;
    }
    /**
     * <code>.LectureModel post = 1;</code>
     * @return The post.
     */
    public via.dk.elearn.protobuf.LectureModel getPost() {
      if (postBuilder_ == null) {
        return post_ == null ? via.dk.elearn.protobuf.LectureModel.getDefaultInstance() : post_;
      } else {
        return postBuilder_.getMessage();
      }
    }
    /**
     * <code>.LectureModel post = 1;</code>
     */
    public Builder setPost(via.dk.elearn.protobuf.LectureModel value) {
      if (postBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        post_ = value;
        onChanged();
      } else {
        postBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.LectureModel post = 1;</code>
     */
    public Builder setPost(
        via.dk.elearn.protobuf.LectureModel.Builder builderForValue) {
      if (postBuilder_ == null) {
        post_ = builderForValue.build();
        onChanged();
      } else {
        postBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.LectureModel post = 1;</code>
     */
    public Builder mergePost(via.dk.elearn.protobuf.LectureModel value) {
      if (postBuilder_ == null) {
        if (post_ != null) {
          post_ =
            via.dk.elearn.protobuf.LectureModel.newBuilder(post_).mergeFrom(value).buildPartial();
        } else {
          post_ = value;
        }
        onChanged();
      } else {
        postBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.LectureModel post = 1;</code>
     */
    public Builder clearPost() {
      if (postBuilder_ == null) {
        post_ = null;
        onChanged();
      } else {
        post_ = null;
        postBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.LectureModel post = 1;</code>
     */
    public via.dk.elearn.protobuf.LectureModel.Builder getPostBuilder() {
      
      onChanged();
      return getPostFieldBuilder().getBuilder();
    }
    /**
     * <code>.LectureModel post = 1;</code>
     */
    public via.dk.elearn.protobuf.LectureModelOrBuilder getPostOrBuilder() {
      if (postBuilder_ != null) {
        return postBuilder_.getMessageOrBuilder();
      } else {
        return post_ == null ?
            via.dk.elearn.protobuf.LectureModel.getDefaultInstance() : post_;
      }
    }
    /**
     * <code>.LectureModel post = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.LectureModel.Builder, via.dk.elearn.protobuf.LectureModelOrBuilder> 
        getPostFieldBuilder() {
      if (postBuilder_ == null) {
        postBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.LectureModel.Builder, via.dk.elearn.protobuf.LectureModelOrBuilder>(
                getPost(),
                getParentForChildren(),
                isClean());
        post_ = null;
      }
      return postBuilder_;
    }

    private long upvoteCount_ ;
    /**
     * <code>int64 upvoteCount = 2;</code>
     * @return The upvoteCount.
     */
    @java.lang.Override
    public long getUpvoteCount() {
      return upvoteCount_;
    }
    /**
     * <code>int64 upvoteCount = 2;</code>
     * @param value The upvoteCount to set.
     * @return This builder for chaining.
     */
    public Builder setUpvoteCount(long value) {
      
      upvoteCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 upvoteCount = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUpvoteCount() {
      
      upvoteCount_ = 0L;
      onChanged();
      return this;
    }

    private long downvoteCount_ ;
    /**
     * <code>int64 downvoteCount = 3;</code>
     * @return The downvoteCount.
     */
    @java.lang.Override
    public long getDownvoteCount() {
      return downvoteCount_;
    }
    /**
     * <code>int64 downvoteCount = 3;</code>
     * @param value The downvoteCount to set.
     * @return This builder for chaining.
     */
    public Builder setDownvoteCount(long value) {
      
      downvoteCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 downvoteCount = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDownvoteCount() {
      
      downvoteCount_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:VoteCounter)
  }

  // @@protoc_insertion_point(class_scope:VoteCounter)
  private static final via.dk.elearn.protobuf.VoteCounter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.dk.elearn.protobuf.VoteCounter();
  }

  public static via.dk.elearn.protobuf.VoteCounter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoteCounter>
      PARSER = new com.google.protobuf.AbstractParser<VoteCounter>() {
    @java.lang.Override
    public VoteCounter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VoteCounter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VoteCounter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoteCounter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.dk.elearn.protobuf.VoteCounter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
