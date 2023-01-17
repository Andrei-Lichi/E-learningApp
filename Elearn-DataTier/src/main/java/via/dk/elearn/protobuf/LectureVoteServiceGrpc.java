package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_lecture_vote.proto")
public final class LectureVoteServiceGrpc {

  private LectureVoteServiceGrpc() {}

  public static final String SERVICE_NAME = "LectureVoteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.VoteModel,
      via.dk.elearn.protobuf.VoteModel> getVoteLectureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VoteLecture",
      requestType = via.dk.elearn.protobuf.VoteModel.class,
      responseType = via.dk.elearn.protobuf.VoteModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.VoteModel,
      via.dk.elearn.protobuf.VoteModel> getVoteLectureMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.VoteModel, via.dk.elearn.protobuf.VoteModel> getVoteLectureMethod;
    if ((getVoteLectureMethod = LectureVoteServiceGrpc.getVoteLectureMethod) == null) {
      synchronized (LectureVoteServiceGrpc.class) {
        if ((getVoteLectureMethod = LectureVoteServiceGrpc.getVoteLectureMethod) == null) {
          LectureVoteServiceGrpc.getVoteLectureMethod = getVoteLectureMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.VoteModel, via.dk.elearn.protobuf.VoteModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "VoteLecture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.VoteModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.VoteModel.getDefaultInstance()))
              .setSchemaDescriptor(new LectureVoteServiceMethodDescriptorSupplier("VoteLecture"))
              .build();
        }
      }
    }
    return getVoteLectureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel,
      via.dk.elearn.protobuf.VoteCounter> getGetLectureVotesCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLectureVotesCount",
      requestType = via.dk.elearn.protobuf.LectureModel.class,
      responseType = via.dk.elearn.protobuf.VoteCounter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel,
      via.dk.elearn.protobuf.VoteCounter> getGetLectureVotesCountMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.VoteCounter> getGetLectureVotesCountMethod;
    if ((getGetLectureVotesCountMethod = LectureVoteServiceGrpc.getGetLectureVotesCountMethod) == null) {
      synchronized (LectureVoteServiceGrpc.class) {
        if ((getGetLectureVotesCountMethod = LectureVoteServiceGrpc.getGetLectureVotesCountMethod) == null) {
          LectureVoteServiceGrpc.getGetLectureVotesCountMethod = getGetLectureVotesCountMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.VoteCounter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLectureVotesCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.VoteCounter.getDefaultInstance()))
              .setSchemaDescriptor(new LectureVoteServiceMethodDescriptorSupplier("GetLectureVotesCount"))
              .build();
        }
      }
    }
    return getGetLectureVotesCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.VoteId,
      via.dk.elearn.protobuf.VoteModel> getGetVoteByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVoteById",
      requestType = via.dk.elearn.protobuf.VoteId.class,
      responseType = via.dk.elearn.protobuf.VoteModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.VoteId,
      via.dk.elearn.protobuf.VoteModel> getGetVoteByIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.VoteId, via.dk.elearn.protobuf.VoteModel> getGetVoteByIdMethod;
    if ((getGetVoteByIdMethod = LectureVoteServiceGrpc.getGetVoteByIdMethod) == null) {
      synchronized (LectureVoteServiceGrpc.class) {
        if ((getGetVoteByIdMethod = LectureVoteServiceGrpc.getGetVoteByIdMethod) == null) {
          LectureVoteServiceGrpc.getGetVoteByIdMethod = getGetVoteByIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.VoteId, via.dk.elearn.protobuf.VoteModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVoteById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.VoteId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.VoteModel.getDefaultInstance()))
              .setSchemaDescriptor(new LectureVoteServiceMethodDescriptorSupplier("GetVoteById"))
              .build();
        }
      }
    }
    return getGetVoteByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LectureVoteServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LectureVoteServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LectureVoteServiceStub>() {
        @java.lang.Override
        public LectureVoteServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LectureVoteServiceStub(channel, callOptions);
        }
      };
    return LectureVoteServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LectureVoteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LectureVoteServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LectureVoteServiceBlockingStub>() {
        @java.lang.Override
        public LectureVoteServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LectureVoteServiceBlockingStub(channel, callOptions);
        }
      };
    return LectureVoteServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LectureVoteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LectureVoteServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LectureVoteServiceFutureStub>() {
        @java.lang.Override
        public LectureVoteServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LectureVoteServiceFutureStub(channel, callOptions);
        }
      };
    return LectureVoteServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LectureVoteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void voteLecture(via.dk.elearn.protobuf.VoteModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.VoteModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVoteLectureMethod(), responseObserver);
    }

    /**
     */
    public void getLectureVotesCount(via.dk.elearn.protobuf.LectureModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.VoteCounter> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLectureVotesCountMethod(), responseObserver);
    }

    /**
     */
    public void getVoteById(via.dk.elearn.protobuf.VoteId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.VoteModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVoteByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getVoteLectureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.VoteModel,
                via.dk.elearn.protobuf.VoteModel>(
                  this, METHODID_VOTE_LECTURE)))
          .addMethod(
            getGetLectureVotesCountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.LectureModel,
                via.dk.elearn.protobuf.VoteCounter>(
                  this, METHODID_GET_LECTURE_VOTES_COUNT)))
          .addMethod(
            getGetVoteByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.VoteId,
                via.dk.elearn.protobuf.VoteModel>(
                  this, METHODID_GET_VOTE_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class LectureVoteServiceStub extends io.grpc.stub.AbstractAsyncStub<LectureVoteServiceStub> {
    private LectureVoteServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LectureVoteServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LectureVoteServiceStub(channel, callOptions);
    }

    /**
     */
    public void voteLecture(via.dk.elearn.protobuf.VoteModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.VoteModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVoteLectureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLectureVotesCount(via.dk.elearn.protobuf.LectureModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.VoteCounter> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLectureVotesCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVoteById(via.dk.elearn.protobuf.VoteId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.VoteModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVoteByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LectureVoteServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LectureVoteServiceBlockingStub> {
    private LectureVoteServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LectureVoteServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LectureVoteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.dk.elearn.protobuf.VoteModel voteLecture(via.dk.elearn.protobuf.VoteModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVoteLectureMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.VoteCounter getLectureVotesCount(via.dk.elearn.protobuf.LectureModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLectureVotesCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.VoteModel getVoteById(via.dk.elearn.protobuf.VoteId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVoteByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LectureVoteServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LectureVoteServiceFutureStub> {
    private LectureVoteServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LectureVoteServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LectureVoteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.VoteModel> voteLecture(
        via.dk.elearn.protobuf.VoteModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVoteLectureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.VoteCounter> getLectureVotesCount(
        via.dk.elearn.protobuf.LectureModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLectureVotesCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.VoteModel> getVoteById(
        via.dk.elearn.protobuf.VoteId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVoteByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VOTE_LECTURE = 0;
  private static final int METHODID_GET_LECTURE_VOTES_COUNT = 1;
  private static final int METHODID_GET_VOTE_BY_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LectureVoteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LectureVoteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VOTE_LECTURE:
          serviceImpl.voteLecture((via.dk.elearn.protobuf.VoteModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.VoteModel>) responseObserver);
          break;
        case METHODID_GET_LECTURE_VOTES_COUNT:
          serviceImpl.getLectureVotesCount((via.dk.elearn.protobuf.LectureModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.VoteCounter>) responseObserver);
          break;
        case METHODID_GET_VOTE_BY_ID:
          serviceImpl.getVoteById((via.dk.elearn.protobuf.VoteId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.VoteModel>) responseObserver);
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

  private static abstract class LectureVoteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LectureVoteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcLectureVote.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LectureVoteService");
    }
  }

  private static final class LectureVoteServiceFileDescriptorSupplier
      extends LectureVoteServiceBaseDescriptorSupplier {
    LectureVoteServiceFileDescriptorSupplier() {}
  }

  private static final class LectureVoteServiceMethodDescriptorSupplier
      extends LectureVoteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LectureVoteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LectureVoteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LectureVoteServiceFileDescriptorSupplier())
              .addMethod(getVoteLectureMethod())
              .addMethod(getGetLectureVotesCountMethod())
              .addMethod(getGetVoteByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
