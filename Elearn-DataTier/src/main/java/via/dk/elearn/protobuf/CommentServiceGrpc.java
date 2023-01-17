package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_comment.proto")
public final class CommentServiceGrpc {

  private CommentServiceGrpc() {}

  public static final String SERVICE_NAME = "CommentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.NewCommentRequest,
      via.dk.elearn.protobuf.CommentModel> getGetAllCommentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllComments",
      requestType = via.dk.elearn.protobuf.NewCommentRequest.class,
      responseType = via.dk.elearn.protobuf.CommentModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.NewCommentRequest,
      via.dk.elearn.protobuf.CommentModel> getGetAllCommentsMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.NewCommentRequest, via.dk.elearn.protobuf.CommentModel> getGetAllCommentsMethod;
    if ((getGetAllCommentsMethod = CommentServiceGrpc.getGetAllCommentsMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getGetAllCommentsMethod = CommentServiceGrpc.getGetAllCommentsMethod) == null) {
          CommentServiceGrpc.getGetAllCommentsMethod = getGetAllCommentsMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.NewCommentRequest, via.dk.elearn.protobuf.CommentModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllComments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.NewCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CommentModel.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("GetAllComments"))
              .build();
        }
      }
    }
    return getGetAllCommentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CommentModel,
      via.dk.elearn.protobuf.CommentModel> getCreateNewCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNewComment",
      requestType = via.dk.elearn.protobuf.CommentModel.class,
      responseType = via.dk.elearn.protobuf.CommentModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CommentModel,
      via.dk.elearn.protobuf.CommentModel> getCreateNewCommentMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CommentModel, via.dk.elearn.protobuf.CommentModel> getCreateNewCommentMethod;
    if ((getCreateNewCommentMethod = CommentServiceGrpc.getCreateNewCommentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getCreateNewCommentMethod = CommentServiceGrpc.getCreateNewCommentMethod) == null) {
          CommentServiceGrpc.getCreateNewCommentMethod = getCreateNewCommentMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.CommentModel, via.dk.elearn.protobuf.CommentModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNewComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CommentModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CommentModel.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("CreateNewComment"))
              .build();
        }
      }
    }
    return getCreateNewCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureId,
      via.dk.elearn.protobuf.CommentModel> getGetCommentByLectureIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCommentByLectureId",
      requestType = via.dk.elearn.protobuf.LectureId.class,
      responseType = via.dk.elearn.protobuf.CommentModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureId,
      via.dk.elearn.protobuf.CommentModel> getGetCommentByLectureIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureId, via.dk.elearn.protobuf.CommentModel> getGetCommentByLectureIdMethod;
    if ((getGetCommentByLectureIdMethod = CommentServiceGrpc.getGetCommentByLectureIdMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getGetCommentByLectureIdMethod = CommentServiceGrpc.getGetCommentByLectureIdMethod) == null) {
          CommentServiceGrpc.getGetCommentByLectureIdMethod = getGetCommentByLectureIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.LectureId, via.dk.elearn.protobuf.CommentModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCommentByLectureId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CommentModel.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("GetCommentByLectureId"))
              .build();
        }
      }
    }
    return getGetCommentByLectureIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CommentId,
      via.dk.elearn.protobuf.CommentModel> getGetCommentByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCommentById",
      requestType = via.dk.elearn.protobuf.CommentId.class,
      responseType = via.dk.elearn.protobuf.CommentModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CommentId,
      via.dk.elearn.protobuf.CommentModel> getGetCommentByIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CommentId, via.dk.elearn.protobuf.CommentModel> getGetCommentByIdMethod;
    if ((getGetCommentByIdMethod = CommentServiceGrpc.getGetCommentByIdMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getGetCommentByIdMethod = CommentServiceGrpc.getGetCommentByIdMethod) == null) {
          CommentServiceGrpc.getGetCommentByIdMethod = getGetCommentByIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.CommentId, via.dk.elearn.protobuf.CommentModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCommentById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CommentId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CommentModel.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("GetCommentById"))
              .build();
        }
      }
    }
    return getGetCommentByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CommentModel,
      via.dk.elearn.protobuf.Nothing> getDeleteCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteComment",
      requestType = via.dk.elearn.protobuf.CommentModel.class,
      responseType = via.dk.elearn.protobuf.Nothing.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CommentModel,
      via.dk.elearn.protobuf.Nothing> getDeleteCommentMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CommentModel, via.dk.elearn.protobuf.Nothing> getDeleteCommentMethod;
    if ((getDeleteCommentMethod = CommentServiceGrpc.getDeleteCommentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getDeleteCommentMethod = CommentServiceGrpc.getDeleteCommentMethod) == null) {
          CommentServiceGrpc.getDeleteCommentMethod = getDeleteCommentMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.CommentModel, via.dk.elearn.protobuf.Nothing>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CommentModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.Nothing.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("DeleteComment"))
              .build();
        }
      }
    }
    return getDeleteCommentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceStub>() {
        @java.lang.Override
        public CommentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceStub(channel, callOptions);
        }
      };
    return CommentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceBlockingStub>() {
        @java.lang.Override
        public CommentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceBlockingStub(channel, callOptions);
        }
      };
    return CommentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceFutureStub>() {
        @java.lang.Override
        public CommentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceFutureStub(channel, callOptions);
        }
      };
    return CommentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CommentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllComments(via.dk.elearn.protobuf.NewCommentRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCommentsMethod(), responseObserver);
    }

    /**
     */
    public void createNewComment(via.dk.elearn.protobuf.CommentModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNewCommentMethod(), responseObserver);
    }

    /**
     */
    public void getCommentByLectureId(via.dk.elearn.protobuf.LectureId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCommentByLectureIdMethod(), responseObserver);
    }

    /**
     */
    public void getCommentById(via.dk.elearn.protobuf.CommentId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCommentByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteComment(via.dk.elearn.protobuf.CommentModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.Nothing> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCommentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllCommentsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.NewCommentRequest,
                via.dk.elearn.protobuf.CommentModel>(
                  this, METHODID_GET_ALL_COMMENTS)))
          .addMethod(
            getCreateNewCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.CommentModel,
                via.dk.elearn.protobuf.CommentModel>(
                  this, METHODID_CREATE_NEW_COMMENT)))
          .addMethod(
            getGetCommentByLectureIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.LectureId,
                via.dk.elearn.protobuf.CommentModel>(
                  this, METHODID_GET_COMMENT_BY_LECTURE_ID)))
          .addMethod(
            getGetCommentByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.CommentId,
                via.dk.elearn.protobuf.CommentModel>(
                  this, METHODID_GET_COMMENT_BY_ID)))
          .addMethod(
            getDeleteCommentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.CommentModel,
                via.dk.elearn.protobuf.Nothing>(
                  this, METHODID_DELETE_COMMENT)))
          .build();
    }
  }

  /**
   */
  public static final class CommentServiceStub extends io.grpc.stub.AbstractAsyncStub<CommentServiceStub> {
    private CommentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllComments(via.dk.elearn.protobuf.NewCommentRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllCommentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNewComment(via.dk.elearn.protobuf.CommentModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNewCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCommentByLectureId(via.dk.elearn.protobuf.LectureId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetCommentByLectureIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCommentById(via.dk.elearn.protobuf.CommentId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCommentByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteComment(via.dk.elearn.protobuf.CommentModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.Nothing> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CommentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CommentServiceBlockingStub> {
    private CommentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.CommentModel> getAllComments(
        via.dk.elearn.protobuf.NewCommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllCommentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.CommentModel createNewComment(via.dk.elearn.protobuf.CommentModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNewCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.CommentModel> getCommentByLectureId(
        via.dk.elearn.protobuf.LectureId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetCommentByLectureIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.CommentModel getCommentById(via.dk.elearn.protobuf.CommentId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCommentByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.Nothing deleteComment(via.dk.elearn.protobuf.CommentModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCommentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CommentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CommentServiceFutureStub> {
    private CommentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.CommentModel> createNewComment(
        via.dk.elearn.protobuf.CommentModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNewCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.CommentModel> getCommentById(
        via.dk.elearn.protobuf.CommentId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCommentByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.Nothing> deleteComment(
        via.dk.elearn.protobuf.CommentModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_COMMENTS = 0;
  private static final int METHODID_CREATE_NEW_COMMENT = 1;
  private static final int METHODID_GET_COMMENT_BY_LECTURE_ID = 2;
  private static final int METHODID_GET_COMMENT_BY_ID = 3;
  private static final int METHODID_DELETE_COMMENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_COMMENTS:
          serviceImpl.getAllComments((via.dk.elearn.protobuf.NewCommentRequest) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel>) responseObserver);
          break;
        case METHODID_CREATE_NEW_COMMENT:
          serviceImpl.createNewComment((via.dk.elearn.protobuf.CommentModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel>) responseObserver);
          break;
        case METHODID_GET_COMMENT_BY_LECTURE_ID:
          serviceImpl.getCommentByLectureId((via.dk.elearn.protobuf.LectureId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel>) responseObserver);
          break;
        case METHODID_GET_COMMENT_BY_ID:
          serviceImpl.getCommentById((via.dk.elearn.protobuf.CommentId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CommentModel>) responseObserver);
          break;
        case METHODID_DELETE_COMMENT:
          serviceImpl.deleteComment((via.dk.elearn.protobuf.CommentModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.Nothing>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CommentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcComment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommentService");
    }
  }

  private static final class CommentServiceFileDescriptorSupplier
      extends CommentServiceBaseDescriptorSupplier {
    CommentServiceFileDescriptorSupplier() {}
  }

  private static final class CommentServiceMethodDescriptorSupplier
      extends CommentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CommentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommentServiceFileDescriptorSupplier())
              .addMethod(getGetAllCommentsMethod())
              .addMethod(getCreateNewCommentMethod())
              .addMethod(getGetCommentByLectureIdMethod())
              .addMethod(getGetCommentByIdMethod())
              .addMethod(getDeleteCommentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
