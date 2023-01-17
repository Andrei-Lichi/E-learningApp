package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_question.proto")
public final class QuestionServiceGrpc {

  private QuestionServiceGrpc() {}

  public static final String SERVICE_NAME = "QuestionService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionUrl,
      via.dk.elearn.protobuf.QuestionModel> getGetQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuestion",
      requestType = via.dk.elearn.protobuf.QuestionUrl.class,
      responseType = via.dk.elearn.protobuf.QuestionModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionUrl,
      via.dk.elearn.protobuf.QuestionModel> getGetQuestionMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionUrl, via.dk.elearn.protobuf.QuestionModel> getGetQuestionMethod;
    if ((getGetQuestionMethod = QuestionServiceGrpc.getGetQuestionMethod) == null) {
      synchronized (QuestionServiceGrpc.class) {
        if ((getGetQuestionMethod = QuestionServiceGrpc.getGetQuestionMethod) == null) {
          QuestionServiceGrpc.getGetQuestionMethod = getGetQuestionMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.QuestionUrl, via.dk.elearn.protobuf.QuestionModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionUrl.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionModel.getDefaultInstance()))
              .setSchemaDescriptor(new QuestionServiceMethodDescriptorSupplier("GetQuestion"))
              .build();
        }
      }
    }
    return getGetQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.PaginationModel,
      via.dk.elearn.protobuf.QuestionModel> getGetAllQuestionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllQuestions",
      requestType = via.dk.elearn.protobuf.PaginationModel.class,
      responseType = via.dk.elearn.protobuf.QuestionModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.PaginationModel,
      via.dk.elearn.protobuf.QuestionModel> getGetAllQuestionsMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.PaginationModel, via.dk.elearn.protobuf.QuestionModel> getGetAllQuestionsMethod;
    if ((getGetAllQuestionsMethod = QuestionServiceGrpc.getGetAllQuestionsMethod) == null) {
      synchronized (QuestionServiceGrpc.class) {
        if ((getGetAllQuestionsMethod = QuestionServiceGrpc.getGetAllQuestionsMethod) == null) {
          QuestionServiceGrpc.getGetAllQuestionsMethod = getGetAllQuestionsMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.PaginationModel, via.dk.elearn.protobuf.QuestionModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllQuestions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.PaginationModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionModel.getDefaultInstance()))
              .setSchemaDescriptor(new QuestionServiceMethodDescriptorSupplier("GetAllQuestions"))
              .build();
        }
      }
    }
    return getGetAllQuestionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionModel,
      via.dk.elearn.protobuf.QuestionModel> getCreateNewQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNewQuestion",
      requestType = via.dk.elearn.protobuf.QuestionModel.class,
      responseType = via.dk.elearn.protobuf.QuestionModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionModel,
      via.dk.elearn.protobuf.QuestionModel> getCreateNewQuestionMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionModel, via.dk.elearn.protobuf.QuestionModel> getCreateNewQuestionMethod;
    if ((getCreateNewQuestionMethod = QuestionServiceGrpc.getCreateNewQuestionMethod) == null) {
      synchronized (QuestionServiceGrpc.class) {
        if ((getCreateNewQuestionMethod = QuestionServiceGrpc.getCreateNewQuestionMethod) == null) {
          QuestionServiceGrpc.getCreateNewQuestionMethod = getCreateNewQuestionMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.QuestionModel, via.dk.elearn.protobuf.QuestionModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNewQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionModel.getDefaultInstance()))
              .setSchemaDescriptor(new QuestionServiceMethodDescriptorSupplier("CreateNewQuestion"))
              .build();
        }
      }
    }
    return getCreateNewQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionUserId,
      via.dk.elearn.protobuf.QuestionModel> getGetQuestionsByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuestionsByUserId",
      requestType = via.dk.elearn.protobuf.QuestionUserId.class,
      responseType = via.dk.elearn.protobuf.QuestionModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionUserId,
      via.dk.elearn.protobuf.QuestionModel> getGetQuestionsByUserIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionUserId, via.dk.elearn.protobuf.QuestionModel> getGetQuestionsByUserIdMethod;
    if ((getGetQuestionsByUserIdMethod = QuestionServiceGrpc.getGetQuestionsByUserIdMethod) == null) {
      synchronized (QuestionServiceGrpc.class) {
        if ((getGetQuestionsByUserIdMethod = QuestionServiceGrpc.getGetQuestionsByUserIdMethod) == null) {
          QuestionServiceGrpc.getGetQuestionsByUserIdMethod = getGetQuestionsByUserIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.QuestionUserId, via.dk.elearn.protobuf.QuestionModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQuestionsByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionUserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionModel.getDefaultInstance()))
              .setSchemaDescriptor(new QuestionServiceMethodDescriptorSupplier("GetQuestionsByUserId"))
              .build();
        }
      }
    }
    return getGetQuestionsByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionModel,
      via.dk.elearn.protobuf.QuestionResponse> getDeleteLectureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLecture",
      requestType = via.dk.elearn.protobuf.QuestionModel.class,
      responseType = via.dk.elearn.protobuf.QuestionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionModel,
      via.dk.elearn.protobuf.QuestionResponse> getDeleteLectureMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionModel, via.dk.elearn.protobuf.QuestionResponse> getDeleteLectureMethod;
    if ((getDeleteLectureMethod = QuestionServiceGrpc.getDeleteLectureMethod) == null) {
      synchronized (QuestionServiceGrpc.class) {
        if ((getDeleteLectureMethod = QuestionServiceGrpc.getDeleteLectureMethod) == null) {
          QuestionServiceGrpc.getDeleteLectureMethod = getDeleteLectureMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.QuestionModel, via.dk.elearn.protobuf.QuestionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLecture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QuestionServiceMethodDescriptorSupplier("DeleteLecture"))
              .build();
        }
      }
    }
    return getDeleteLectureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionModel,
      via.dk.elearn.protobuf.QuestionModel> getEditQuestionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditQuestion",
      requestType = via.dk.elearn.protobuf.QuestionModel.class,
      responseType = via.dk.elearn.protobuf.QuestionModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionModel,
      via.dk.elearn.protobuf.QuestionModel> getEditQuestionMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionModel, via.dk.elearn.protobuf.QuestionModel> getEditQuestionMethod;
    if ((getEditQuestionMethod = QuestionServiceGrpc.getEditQuestionMethod) == null) {
      synchronized (QuestionServiceGrpc.class) {
        if ((getEditQuestionMethod = QuestionServiceGrpc.getEditQuestionMethod) == null) {
          QuestionServiceGrpc.getEditQuestionMethod = getEditQuestionMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.QuestionModel, via.dk.elearn.protobuf.QuestionModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditQuestion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionModel.getDefaultInstance()))
              .setSchemaDescriptor(new QuestionServiceMethodDescriptorSupplier("EditQuestion"))
              .build();
        }
      }
    }
    return getEditQuestionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionId,
      via.dk.elearn.protobuf.QuestionModel> getGetQuestionByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetQuestionById",
      requestType = via.dk.elearn.protobuf.QuestionId.class,
      responseType = via.dk.elearn.protobuf.QuestionModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionId,
      via.dk.elearn.protobuf.QuestionModel> getGetQuestionByIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.QuestionId, via.dk.elearn.protobuf.QuestionModel> getGetQuestionByIdMethod;
    if ((getGetQuestionByIdMethod = QuestionServiceGrpc.getGetQuestionByIdMethod) == null) {
      synchronized (QuestionServiceGrpc.class) {
        if ((getGetQuestionByIdMethod = QuestionServiceGrpc.getGetQuestionByIdMethod) == null) {
          QuestionServiceGrpc.getGetQuestionByIdMethod = getGetQuestionByIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.QuestionId, via.dk.elearn.protobuf.QuestionModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetQuestionById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionModel.getDefaultInstance()))
              .setSchemaDescriptor(new QuestionServiceMethodDescriptorSupplier("GetQuestionById"))
              .build();
        }
      }
    }
    return getGetQuestionByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QuestionServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuestionServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuestionServiceStub>() {
        @java.lang.Override
        public QuestionServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuestionServiceStub(channel, callOptions);
        }
      };
    return QuestionServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QuestionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuestionServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuestionServiceBlockingStub>() {
        @java.lang.Override
        public QuestionServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuestionServiceBlockingStub(channel, callOptions);
        }
      };
    return QuestionServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QuestionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuestionServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuestionServiceFutureStub>() {
        @java.lang.Override
        public QuestionServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuestionServiceFutureStub(channel, callOptions);
        }
      };
    return QuestionServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class QuestionServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getQuestion(via.dk.elearn.protobuf.QuestionUrl request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuestionMethod(), responseObserver);
    }

    /**
     */
    public void getAllQuestions(via.dk.elearn.protobuf.PaginationModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllQuestionsMethod(), responseObserver);
    }

    /**
     */
    public void createNewQuestion(via.dk.elearn.protobuf.QuestionModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNewQuestionMethod(), responseObserver);
    }

    /**
     */
    public void getQuestionsByUserId(via.dk.elearn.protobuf.QuestionUserId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuestionsByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteLecture(via.dk.elearn.protobuf.QuestionModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLectureMethod(), responseObserver);
    }

    /**
     */
    public void editQuestion(via.dk.elearn.protobuf.QuestionModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditQuestionMethod(), responseObserver);
    }

    /**
     */
    public void getQuestionById(via.dk.elearn.protobuf.QuestionId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetQuestionByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetQuestionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.QuestionUrl,
                via.dk.elearn.protobuf.QuestionModel>(
                  this, METHODID_GET_QUESTION)))
          .addMethod(
            getGetAllQuestionsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.PaginationModel,
                via.dk.elearn.protobuf.QuestionModel>(
                  this, METHODID_GET_ALL_QUESTIONS)))
          .addMethod(
            getCreateNewQuestionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.QuestionModel,
                via.dk.elearn.protobuf.QuestionModel>(
                  this, METHODID_CREATE_NEW_QUESTION)))
          .addMethod(
            getGetQuestionsByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.QuestionUserId,
                via.dk.elearn.protobuf.QuestionModel>(
                  this, METHODID_GET_QUESTIONS_BY_USER_ID)))
          .addMethod(
            getDeleteLectureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.QuestionModel,
                via.dk.elearn.protobuf.QuestionResponse>(
                  this, METHODID_DELETE_LECTURE)))
          .addMethod(
            getEditQuestionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.QuestionModel,
                via.dk.elearn.protobuf.QuestionModel>(
                  this, METHODID_EDIT_QUESTION)))
          .addMethod(
            getGetQuestionByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.QuestionId,
                via.dk.elearn.protobuf.QuestionModel>(
                  this, METHODID_GET_QUESTION_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class QuestionServiceStub extends io.grpc.stub.AbstractAsyncStub<QuestionServiceStub> {
    private QuestionServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuestionServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuestionServiceStub(channel, callOptions);
    }

    /**
     */
    public void getQuestion(via.dk.elearn.protobuf.QuestionUrl request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllQuestions(via.dk.elearn.protobuf.PaginationModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllQuestionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNewQuestion(via.dk.elearn.protobuf.QuestionModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNewQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuestionsByUserId(via.dk.elearn.protobuf.QuestionUserId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetQuestionsByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLecture(via.dk.elearn.protobuf.QuestionModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLectureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editQuestion(via.dk.elearn.protobuf.QuestionModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditQuestionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getQuestionById(via.dk.elearn.protobuf.QuestionId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetQuestionByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QuestionServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<QuestionServiceBlockingStub> {
    private QuestionServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuestionServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuestionServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.dk.elearn.protobuf.QuestionModel getQuestion(via.dk.elearn.protobuf.QuestionUrl request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.QuestionModel> getAllQuestions(
        via.dk.elearn.protobuf.PaginationModel request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllQuestionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.QuestionModel createNewQuestion(via.dk.elearn.protobuf.QuestionModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNewQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.QuestionModel> getQuestionsByUserId(
        via.dk.elearn.protobuf.QuestionUserId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetQuestionsByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.QuestionResponse deleteLecture(via.dk.elearn.protobuf.QuestionModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLectureMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.QuestionModel editQuestion(via.dk.elearn.protobuf.QuestionModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditQuestionMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.QuestionModel getQuestionById(via.dk.elearn.protobuf.QuestionId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetQuestionByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QuestionServiceFutureStub extends io.grpc.stub.AbstractFutureStub<QuestionServiceFutureStub> {
    private QuestionServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuestionServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuestionServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.QuestionModel> getQuestion(
        via.dk.elearn.protobuf.QuestionUrl request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.QuestionModel> createNewQuestion(
        via.dk.elearn.protobuf.QuestionModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNewQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.QuestionResponse> deleteLecture(
        via.dk.elearn.protobuf.QuestionModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLectureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.QuestionModel> editQuestion(
        via.dk.elearn.protobuf.QuestionModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditQuestionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.QuestionModel> getQuestionById(
        via.dk.elearn.protobuf.QuestionId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetQuestionByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_QUESTION = 0;
  private static final int METHODID_GET_ALL_QUESTIONS = 1;
  private static final int METHODID_CREATE_NEW_QUESTION = 2;
  private static final int METHODID_GET_QUESTIONS_BY_USER_ID = 3;
  private static final int METHODID_DELETE_LECTURE = 4;
  private static final int METHODID_EDIT_QUESTION = 5;
  private static final int METHODID_GET_QUESTION_BY_ID = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QuestionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QuestionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_QUESTION:
          serviceImpl.getQuestion((via.dk.elearn.protobuf.QuestionUrl) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel>) responseObserver);
          break;
        case METHODID_GET_ALL_QUESTIONS:
          serviceImpl.getAllQuestions((via.dk.elearn.protobuf.PaginationModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel>) responseObserver);
          break;
        case METHODID_CREATE_NEW_QUESTION:
          serviceImpl.createNewQuestion((via.dk.elearn.protobuf.QuestionModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel>) responseObserver);
          break;
        case METHODID_GET_QUESTIONS_BY_USER_ID:
          serviceImpl.getQuestionsByUserId((via.dk.elearn.protobuf.QuestionUserId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel>) responseObserver);
          break;
        case METHODID_DELETE_LECTURE:
          serviceImpl.deleteLecture((via.dk.elearn.protobuf.QuestionModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionResponse>) responseObserver);
          break;
        case METHODID_EDIT_QUESTION:
          serviceImpl.editQuestion((via.dk.elearn.protobuf.QuestionModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel>) responseObserver);
          break;
        case METHODID_GET_QUESTION_BY_ID:
          serviceImpl.getQuestionById((via.dk.elearn.protobuf.QuestionId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel>) responseObserver);
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

  private static abstract class QuestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QuestionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcQuestion.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QuestionService");
    }
  }

  private static final class QuestionServiceFileDescriptorSupplier
      extends QuestionServiceBaseDescriptorSupplier {
    QuestionServiceFileDescriptorSupplier() {}
  }

  private static final class QuestionServiceMethodDescriptorSupplier
      extends QuestionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QuestionServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (QuestionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QuestionServiceFileDescriptorSupplier())
              .addMethod(getGetQuestionMethod())
              .addMethod(getGetAllQuestionsMethod())
              .addMethod(getCreateNewQuestionMethod())
              .addMethod(getGetQuestionsByUserIdMethod())
              .addMethod(getDeleteLectureMethod())
              .addMethod(getEditQuestionMethod())
              .addMethod(getGetQuestionByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
