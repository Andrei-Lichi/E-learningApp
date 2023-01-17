package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_answer.proto")
public final class AnswerServiceGrpc {

  private AnswerServiceGrpc() {}

  public static final String SERVICE_NAME = "AnswerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.AnswerModel,
      via.dk.elearn.protobuf.AnswerModel> getCreateNewAnswerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNewAnswer",
      requestType = via.dk.elearn.protobuf.AnswerModel.class,
      responseType = via.dk.elearn.protobuf.AnswerModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.AnswerModel,
      via.dk.elearn.protobuf.AnswerModel> getCreateNewAnswerMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.AnswerModel, via.dk.elearn.protobuf.AnswerModel> getCreateNewAnswerMethod;
    if ((getCreateNewAnswerMethod = AnswerServiceGrpc.getCreateNewAnswerMethod) == null) {
      synchronized (AnswerServiceGrpc.class) {
        if ((getCreateNewAnswerMethod = AnswerServiceGrpc.getCreateNewAnswerMethod) == null) {
          AnswerServiceGrpc.getCreateNewAnswerMethod = getCreateNewAnswerMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.AnswerModel, via.dk.elearn.protobuf.AnswerModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNewAnswer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.AnswerModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.AnswerModel.getDefaultInstance()))
              .setSchemaDescriptor(new AnswerServiceMethodDescriptorSupplier("CreateNewAnswer"))
              .build();
        }
      }
    }
    return getCreateNewAnswerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionId,
      via.dk.elearn.protobuf.AnswerModel> getGetAnswerByQuestionIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnswerByQuestionId",
      requestType = via.dk.elearn.protobuf.QuestionId.class,
      responseType = via.dk.elearn.protobuf.AnswerModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionId,
      via.dk.elearn.protobuf.AnswerModel> getGetAnswerByQuestionIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionId, via.dk.elearn.protobuf.AnswerModel> getGetAnswerByQuestionIdMethod;
    if ((getGetAnswerByQuestionIdMethod = AnswerServiceGrpc.getGetAnswerByQuestionIdMethod) == null) {
      synchronized (AnswerServiceGrpc.class) {
        if ((getGetAnswerByQuestionIdMethod = AnswerServiceGrpc.getGetAnswerByQuestionIdMethod) == null) {
          AnswerServiceGrpc.getGetAnswerByQuestionIdMethod = getGetAnswerByQuestionIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.QuestionId, via.dk.elearn.protobuf.AnswerModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnswerByQuestionId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.AnswerModel.getDefaultInstance()))
              .setSchemaDescriptor(new AnswerServiceMethodDescriptorSupplier("GetAnswerByQuestionId"))
              .build();
        }
      }
    }
    return getGetAnswerByQuestionIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.AnswerId,
      via.dk.elearn.protobuf.AnswerModel> getGetAnswerByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAnswerById",
      requestType = via.dk.elearn.protobuf.AnswerId.class,
      responseType = via.dk.elearn.protobuf.AnswerModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.AnswerId,
      via.dk.elearn.protobuf.AnswerModel> getGetAnswerByIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.AnswerId, via.dk.elearn.protobuf.AnswerModel> getGetAnswerByIdMethod;
    if ((getGetAnswerByIdMethod = AnswerServiceGrpc.getGetAnswerByIdMethod) == null) {
      synchronized (AnswerServiceGrpc.class) {
        if ((getGetAnswerByIdMethod = AnswerServiceGrpc.getGetAnswerByIdMethod) == null) {
          AnswerServiceGrpc.getGetAnswerByIdMethod = getGetAnswerByIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.AnswerId, via.dk.elearn.protobuf.AnswerModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAnswerById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.AnswerId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.AnswerModel.getDefaultInstance()))
              .setSchemaDescriptor(new AnswerServiceMethodDescriptorSupplier("GetAnswerById"))
              .build();
        }
      }
    }
    return getGetAnswerByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.AnswerModel,
      via.dk.elearn.protobuf.Nothing> getDeleteAnswerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAnswer",
      requestType = via.dk.elearn.protobuf.AnswerModel.class,
      responseType = via.dk.elearn.protobuf.Nothing.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.AnswerModel,
      via.dk.elearn.protobuf.Nothing> getDeleteAnswerMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.AnswerModel, via.dk.elearn.protobuf.Nothing> getDeleteAnswerMethod;
    if ((getDeleteAnswerMethod = AnswerServiceGrpc.getDeleteAnswerMethod) == null) {
      synchronized (AnswerServiceGrpc.class) {
        if ((getDeleteAnswerMethod = AnswerServiceGrpc.getDeleteAnswerMethod) == null) {
          AnswerServiceGrpc.getDeleteAnswerMethod = getDeleteAnswerMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.AnswerModel, via.dk.elearn.protobuf.Nothing>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAnswer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.AnswerModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.Nothing.getDefaultInstance()))
              .setSchemaDescriptor(new AnswerServiceMethodDescriptorSupplier("DeleteAnswer"))
              .build();
        }
      }
    }
    return getDeleteAnswerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnswerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnswerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnswerServiceStub>() {
        @java.lang.Override
        public AnswerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnswerServiceStub(channel, callOptions);
        }
      };
    return AnswerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnswerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnswerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnswerServiceBlockingStub>() {
        @java.lang.Override
        public AnswerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnswerServiceBlockingStub(channel, callOptions);
        }
      };
    return AnswerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnswerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnswerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnswerServiceFutureStub>() {
        @java.lang.Override
        public AnswerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnswerServiceFutureStub(channel, callOptions);
        }
      };
    return AnswerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnswerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createNewAnswer(via.dk.elearn.protobuf.AnswerModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.AnswerModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNewAnswerMethod(), responseObserver);
    }

    /**
     */
    public void getAnswerByQuestionId(via.dk.elearn.protobuf.QuestionId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.AnswerModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnswerByQuestionIdMethod(), responseObserver);
    }

    /**
     */
    public void getAnswerById(via.dk.elearn.protobuf.AnswerId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.AnswerModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnswerByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteAnswer(via.dk.elearn.protobuf.AnswerModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.Nothing> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAnswerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNewAnswerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.AnswerModel,
                via.dk.elearn.protobuf.AnswerModel>(
                  this, METHODID_CREATE_NEW_ANSWER)))
          .addMethod(
            getGetAnswerByQuestionIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.QuestionId,
                via.dk.elearn.protobuf.AnswerModel>(
                  this, METHODID_GET_ANSWER_BY_QUESTION_ID)))
          .addMethod(
            getGetAnswerByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.AnswerId,
                via.dk.elearn.protobuf.AnswerModel>(
                  this, METHODID_GET_ANSWER_BY_ID)))
          .addMethod(
            getDeleteAnswerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.AnswerModel,
                via.dk.elearn.protobuf.Nothing>(
                  this, METHODID_DELETE_ANSWER)))
          .build();
    }
  }

  /**
   */
  public static final class AnswerServiceStub extends io.grpc.stub.AbstractAsyncStub<AnswerServiceStub> {
    private AnswerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnswerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnswerServiceStub(channel, callOptions);
    }

    /**
     */
    public void createNewAnswer(via.dk.elearn.protobuf.AnswerModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.AnswerModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNewAnswerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnswerByQuestionId(via.dk.elearn.protobuf.QuestionId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.AnswerModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAnswerByQuestionIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnswerById(via.dk.elearn.protobuf.AnswerId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.AnswerModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnswerByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAnswer(via.dk.elearn.protobuf.AnswerModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.Nothing> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAnswerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnswerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnswerServiceBlockingStub> {
    private AnswerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnswerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnswerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.dk.elearn.protobuf.AnswerModel createNewAnswer(via.dk.elearn.protobuf.AnswerModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNewAnswerMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.AnswerModel> getAnswerByQuestionId(
        via.dk.elearn.protobuf.QuestionId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAnswerByQuestionIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.AnswerModel getAnswerById(via.dk.elearn.protobuf.AnswerId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnswerByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.Nothing deleteAnswer(via.dk.elearn.protobuf.AnswerModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAnswerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnswerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnswerServiceFutureStub> {
    private AnswerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnswerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnswerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.AnswerModel> createNewAnswer(
        via.dk.elearn.protobuf.AnswerModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNewAnswerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.AnswerModel> getAnswerById(
        via.dk.elearn.protobuf.AnswerId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnswerByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.Nothing> deleteAnswer(
        via.dk.elearn.protobuf.AnswerModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAnswerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NEW_ANSWER = 0;
  private static final int METHODID_GET_ANSWER_BY_QUESTION_ID = 1;
  private static final int METHODID_GET_ANSWER_BY_ID = 2;
  private static final int METHODID_DELETE_ANSWER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnswerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnswerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NEW_ANSWER:
          serviceImpl.createNewAnswer((via.dk.elearn.protobuf.AnswerModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.AnswerModel>) responseObserver);
          break;
        case METHODID_GET_ANSWER_BY_QUESTION_ID:
          serviceImpl.getAnswerByQuestionId((via.dk.elearn.protobuf.QuestionId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.AnswerModel>) responseObserver);
          break;
        case METHODID_GET_ANSWER_BY_ID:
          serviceImpl.getAnswerById((via.dk.elearn.protobuf.AnswerId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.AnswerModel>) responseObserver);
          break;
        case METHODID_DELETE_ANSWER:
          serviceImpl.deleteAnswer((via.dk.elearn.protobuf.AnswerModel) request,
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

  private static abstract class AnswerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnswerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcAnswer.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnswerService");
    }
  }

  private static final class AnswerServiceFileDescriptorSupplier
      extends AnswerServiceBaseDescriptorSupplier {
    AnswerServiceFileDescriptorSupplier() {}
  }

  private static final class AnswerServiceMethodDescriptorSupplier
      extends AnswerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnswerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnswerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnswerServiceFileDescriptorSupplier())
              .addMethod(getCreateNewAnswerMethod())
              .addMethod(getGetAnswerByQuestionIdMethod())
              .addMethod(getGetAnswerByIdMethod())
              .addMethod(getDeleteAnswerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
