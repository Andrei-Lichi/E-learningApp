package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_lecture.proto")
public final class LectureServiceGrpc {

  private LectureServiceGrpc() {}

  public static final String SERVICE_NAME = "LectureService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureUrl,
      via.dk.elearn.protobuf.LectureModel> getGetLectureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLecture",
      requestType = via.dk.elearn.protobuf.LectureUrl.class,
      responseType = via.dk.elearn.protobuf.LectureModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureUrl,
      via.dk.elearn.protobuf.LectureModel> getGetLectureMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureUrl, via.dk.elearn.protobuf.LectureModel> getGetLectureMethod;
    if ((getGetLectureMethod = LectureServiceGrpc.getGetLectureMethod) == null) {
      synchronized (LectureServiceGrpc.class) {
        if ((getGetLectureMethod = LectureServiceGrpc.getGetLectureMethod) == null) {
          LectureServiceGrpc.getGetLectureMethod = getGetLectureMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.LectureUrl, via.dk.elearn.protobuf.LectureModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLecture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureUrl.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setSchemaDescriptor(new LectureServiceMethodDescriptorSupplier("GetLecture"))
              .build();
        }
      }
    }
    return getGetLectureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.PaginationModel,
      via.dk.elearn.protobuf.LectureModel> getGetAllLecturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllLectures",
      requestType = via.dk.elearn.protobuf.PaginationModel.class,
      responseType = via.dk.elearn.protobuf.LectureModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.PaginationModel,
      via.dk.elearn.protobuf.LectureModel> getGetAllLecturesMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.PaginationModel, via.dk.elearn.protobuf.LectureModel> getGetAllLecturesMethod;
    if ((getGetAllLecturesMethod = LectureServiceGrpc.getGetAllLecturesMethod) == null) {
      synchronized (LectureServiceGrpc.class) {
        if ((getGetAllLecturesMethod = LectureServiceGrpc.getGetAllLecturesMethod) == null) {
          LectureServiceGrpc.getGetAllLecturesMethod = getGetAllLecturesMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.PaginationModel, via.dk.elearn.protobuf.LectureModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllLectures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.PaginationModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setSchemaDescriptor(new LectureServiceMethodDescriptorSupplier("GetAllLectures"))
              .build();
        }
      }
    }
    return getGetAllLecturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel,
      via.dk.elearn.protobuf.LectureModel> getCreateNewLectureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNewLecture",
      requestType = via.dk.elearn.protobuf.LectureModel.class,
      responseType = via.dk.elearn.protobuf.LectureModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel,
      via.dk.elearn.protobuf.LectureModel> getCreateNewLectureMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.LectureModel> getCreateNewLectureMethod;
    if ((getCreateNewLectureMethod = LectureServiceGrpc.getCreateNewLectureMethod) == null) {
      synchronized (LectureServiceGrpc.class) {
        if ((getCreateNewLectureMethod = LectureServiceGrpc.getCreateNewLectureMethod) == null) {
          LectureServiceGrpc.getCreateNewLectureMethod = getCreateNewLectureMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.LectureModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNewLecture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setSchemaDescriptor(new LectureServiceMethodDescriptorSupplier("CreateNewLecture"))
              .build();
        }
      }
    }
    return getCreateNewLectureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureId,
      via.dk.elearn.protobuf.LectureModel> getGetLectureByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLectureById",
      requestType = via.dk.elearn.protobuf.LectureId.class,
      responseType = via.dk.elearn.protobuf.LectureModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureId,
      via.dk.elearn.protobuf.LectureModel> getGetLectureByIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureId, via.dk.elearn.protobuf.LectureModel> getGetLectureByIdMethod;
    if ((getGetLectureByIdMethod = LectureServiceGrpc.getGetLectureByIdMethod) == null) {
      synchronized (LectureServiceGrpc.class) {
        if ((getGetLectureByIdMethod = LectureServiceGrpc.getGetLectureByIdMethod) == null) {
          LectureServiceGrpc.getGetLectureByIdMethod = getGetLectureByIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.LectureId, via.dk.elearn.protobuf.LectureModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLectureById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setSchemaDescriptor(new LectureServiceMethodDescriptorSupplier("GetLectureById"))
              .build();
        }
      }
    }
    return getGetLectureByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureUserId,
      via.dk.elearn.protobuf.LectureModel> getGetLectureByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLectureByUserId",
      requestType = via.dk.elearn.protobuf.LectureUserId.class,
      responseType = via.dk.elearn.protobuf.LectureModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureUserId,
      via.dk.elearn.protobuf.LectureModel> getGetLectureByUserIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureUserId, via.dk.elearn.protobuf.LectureModel> getGetLectureByUserIdMethod;
    if ((getGetLectureByUserIdMethod = LectureServiceGrpc.getGetLectureByUserIdMethod) == null) {
      synchronized (LectureServiceGrpc.class) {
        if ((getGetLectureByUserIdMethod = LectureServiceGrpc.getGetLectureByUserIdMethod) == null) {
          LectureServiceGrpc.getGetLectureByUserIdMethod = getGetLectureByUserIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.LectureUserId, via.dk.elearn.protobuf.LectureModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLectureByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureUserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setSchemaDescriptor(new LectureServiceMethodDescriptorSupplier("GetLectureByUserId"))
              .build();
        }
      }
    }
    return getGetLectureByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureUserId,
      via.dk.elearn.protobuf.LectureModel> getGetUpvotedLectureByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUpvotedLectureByUserId",
      requestType = via.dk.elearn.protobuf.LectureUserId.class,
      responseType = via.dk.elearn.protobuf.LectureModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureUserId,
      via.dk.elearn.protobuf.LectureModel> getGetUpvotedLectureByUserIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureUserId, via.dk.elearn.protobuf.LectureModel> getGetUpvotedLectureByUserIdMethod;
    if ((getGetUpvotedLectureByUserIdMethod = LectureServiceGrpc.getGetUpvotedLectureByUserIdMethod) == null) {
      synchronized (LectureServiceGrpc.class) {
        if ((getGetUpvotedLectureByUserIdMethod = LectureServiceGrpc.getGetUpvotedLectureByUserIdMethod) == null) {
          LectureServiceGrpc.getGetUpvotedLectureByUserIdMethod = getGetUpvotedLectureByUserIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.LectureUserId, via.dk.elearn.protobuf.LectureModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUpvotedLectureByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureUserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setSchemaDescriptor(new LectureServiceMethodDescriptorSupplier("GetUpvotedLectureByUserId"))
              .build();
        }
      }
    }
    return getGetUpvotedLectureByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel,
      via.dk.elearn.protobuf.LectureModel> getEditLectureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EditLecture",
      requestType = via.dk.elearn.protobuf.LectureModel.class,
      responseType = via.dk.elearn.protobuf.LectureModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel,
      via.dk.elearn.protobuf.LectureModel> getEditLectureMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.LectureModel> getEditLectureMethod;
    if ((getEditLectureMethod = LectureServiceGrpc.getEditLectureMethod) == null) {
      synchronized (LectureServiceGrpc.class) {
        if ((getEditLectureMethod = LectureServiceGrpc.getEditLectureMethod) == null) {
          LectureServiceGrpc.getEditLectureMethod = getEditLectureMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.LectureModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EditLecture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setSchemaDescriptor(new LectureServiceMethodDescriptorSupplier("EditLecture"))
              .build();
        }
      }
    }
    return getEditLectureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel,
      via.dk.elearn.protobuf.LectureResponse> getDeleteLectureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteLecture",
      requestType = via.dk.elearn.protobuf.LectureModel.class,
      responseType = via.dk.elearn.protobuf.LectureResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel,
      via.dk.elearn.protobuf.LectureResponse> getDeleteLectureMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.LectureResponse> getDeleteLectureMethod;
    if ((getDeleteLectureMethod = LectureServiceGrpc.getDeleteLectureMethod) == null) {
      synchronized (LectureServiceGrpc.class) {
        if ((getDeleteLectureMethod = LectureServiceGrpc.getDeleteLectureMethod) == null) {
          LectureServiceGrpc.getDeleteLectureMethod = getDeleteLectureMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.LectureModel, via.dk.elearn.protobuf.LectureResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteLecture"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LectureServiceMethodDescriptorSupplier("DeleteLecture"))
              .build();
        }
      }
    }
    return getDeleteLectureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LectureServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LectureServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LectureServiceStub>() {
        @java.lang.Override
        public LectureServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LectureServiceStub(channel, callOptions);
        }
      };
    return LectureServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LectureServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LectureServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LectureServiceBlockingStub>() {
        @java.lang.Override
        public LectureServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LectureServiceBlockingStub(channel, callOptions);
        }
      };
    return LectureServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LectureServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LectureServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LectureServiceFutureStub>() {
        @java.lang.Override
        public LectureServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LectureServiceFutureStub(channel, callOptions);
        }
      };
    return LectureServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LectureServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLecture(via.dk.elearn.protobuf.LectureUrl request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLectureMethod(), responseObserver);
    }

    /**
     */
    public void getAllLectures(via.dk.elearn.protobuf.PaginationModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllLecturesMethod(), responseObserver);
    }

    /**
     */
    public void createNewLecture(via.dk.elearn.protobuf.LectureModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNewLectureMethod(), responseObserver);
    }

    /**
     */
    public void getLectureById(via.dk.elearn.protobuf.LectureId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLectureByIdMethod(), responseObserver);
    }

    /**
     */
    public void getLectureByUserId(via.dk.elearn.protobuf.LectureUserId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLectureByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void getUpvotedLectureByUserId(via.dk.elearn.protobuf.LectureUserId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUpvotedLectureByUserIdMethod(), responseObserver);
    }

    /**
     */
    public void editLecture(via.dk.elearn.protobuf.LectureModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEditLectureMethod(), responseObserver);
    }

    /**
     */
    public void deleteLecture(via.dk.elearn.protobuf.LectureModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLectureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLectureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.LectureUrl,
                via.dk.elearn.protobuf.LectureModel>(
                  this, METHODID_GET_LECTURE)))
          .addMethod(
            getGetAllLecturesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.PaginationModel,
                via.dk.elearn.protobuf.LectureModel>(
                  this, METHODID_GET_ALL_LECTURES)))
          .addMethod(
            getCreateNewLectureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.LectureModel,
                via.dk.elearn.protobuf.LectureModel>(
                  this, METHODID_CREATE_NEW_LECTURE)))
          .addMethod(
            getGetLectureByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.LectureId,
                via.dk.elearn.protobuf.LectureModel>(
                  this, METHODID_GET_LECTURE_BY_ID)))
          .addMethod(
            getGetLectureByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.LectureUserId,
                via.dk.elearn.protobuf.LectureModel>(
                  this, METHODID_GET_LECTURE_BY_USER_ID)))
          .addMethod(
            getGetUpvotedLectureByUserIdMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.LectureUserId,
                via.dk.elearn.protobuf.LectureModel>(
                  this, METHODID_GET_UPVOTED_LECTURE_BY_USER_ID)))
          .addMethod(
            getEditLectureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.LectureModel,
                via.dk.elearn.protobuf.LectureModel>(
                  this, METHODID_EDIT_LECTURE)))
          .addMethod(
            getDeleteLectureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.LectureModel,
                via.dk.elearn.protobuf.LectureResponse>(
                  this, METHODID_DELETE_LECTURE)))
          .build();
    }
  }

  /**
   */
  public static final class LectureServiceStub extends io.grpc.stub.AbstractAsyncStub<LectureServiceStub> {
    private LectureServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LectureServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LectureServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLecture(via.dk.elearn.protobuf.LectureUrl request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLectureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllLectures(via.dk.elearn.protobuf.PaginationModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllLecturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNewLecture(via.dk.elearn.protobuf.LectureModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNewLectureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLectureById(via.dk.elearn.protobuf.LectureId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLectureByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLectureByUserId(via.dk.elearn.protobuf.LectureUserId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetLectureByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUpvotedLectureByUserId(via.dk.elearn.protobuf.LectureUserId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetUpvotedLectureByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editLecture(via.dk.elearn.protobuf.LectureModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEditLectureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLecture(via.dk.elearn.protobuf.LectureModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLectureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LectureServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LectureServiceBlockingStub> {
    private LectureServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LectureServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LectureServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.dk.elearn.protobuf.LectureModel getLecture(via.dk.elearn.protobuf.LectureUrl request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLectureMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.LectureModel> getAllLectures(
        via.dk.elearn.protobuf.PaginationModel request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllLecturesMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.LectureModel createNewLecture(via.dk.elearn.protobuf.LectureModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNewLectureMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.LectureModel getLectureById(via.dk.elearn.protobuf.LectureId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLectureByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.LectureModel> getLectureByUserId(
        via.dk.elearn.protobuf.LectureUserId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetLectureByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.LectureModel> getUpvotedLectureByUserId(
        via.dk.elearn.protobuf.LectureUserId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetUpvotedLectureByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.LectureModel editLecture(via.dk.elearn.protobuf.LectureModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEditLectureMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.LectureResponse deleteLecture(via.dk.elearn.protobuf.LectureModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLectureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LectureServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LectureServiceFutureStub> {
    private LectureServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LectureServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LectureServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.LectureModel> getLecture(
        via.dk.elearn.protobuf.LectureUrl request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLectureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.LectureModel> createNewLecture(
        via.dk.elearn.protobuf.LectureModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNewLectureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.LectureModel> getLectureById(
        via.dk.elearn.protobuf.LectureId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLectureByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.LectureModel> editLecture(
        via.dk.elearn.protobuf.LectureModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEditLectureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.LectureResponse> deleteLecture(
        via.dk.elearn.protobuf.LectureModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLectureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LECTURE = 0;
  private static final int METHODID_GET_ALL_LECTURES = 1;
  private static final int METHODID_CREATE_NEW_LECTURE = 2;
  private static final int METHODID_GET_LECTURE_BY_ID = 3;
  private static final int METHODID_GET_LECTURE_BY_USER_ID = 4;
  private static final int METHODID_GET_UPVOTED_LECTURE_BY_USER_ID = 5;
  private static final int METHODID_EDIT_LECTURE = 6;
  private static final int METHODID_DELETE_LECTURE = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LectureServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LectureServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LECTURE:
          serviceImpl.getLecture((via.dk.elearn.protobuf.LectureUrl) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel>) responseObserver);
          break;
        case METHODID_GET_ALL_LECTURES:
          serviceImpl.getAllLectures((via.dk.elearn.protobuf.PaginationModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel>) responseObserver);
          break;
        case METHODID_CREATE_NEW_LECTURE:
          serviceImpl.createNewLecture((via.dk.elearn.protobuf.LectureModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel>) responseObserver);
          break;
        case METHODID_GET_LECTURE_BY_ID:
          serviceImpl.getLectureById((via.dk.elearn.protobuf.LectureId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel>) responseObserver);
          break;
        case METHODID_GET_LECTURE_BY_USER_ID:
          serviceImpl.getLectureByUserId((via.dk.elearn.protobuf.LectureUserId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel>) responseObserver);
          break;
        case METHODID_GET_UPVOTED_LECTURE_BY_USER_ID:
          serviceImpl.getUpvotedLectureByUserId((via.dk.elearn.protobuf.LectureUserId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel>) responseObserver);
          break;
        case METHODID_EDIT_LECTURE:
          serviceImpl.editLecture((via.dk.elearn.protobuf.LectureModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel>) responseObserver);
          break;
        case METHODID_DELETE_LECTURE:
          serviceImpl.deleteLecture((via.dk.elearn.protobuf.LectureModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureResponse>) responseObserver);
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

  private static abstract class LectureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LectureServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcLecture.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LectureService");
    }
  }

  private static final class LectureServiceFileDescriptorSupplier
      extends LectureServiceBaseDescriptorSupplier {
    LectureServiceFileDescriptorSupplier() {}
  }

  private static final class LectureServiceMethodDescriptorSupplier
      extends LectureServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LectureServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LectureServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LectureServiceFileDescriptorSupplier())
              .addMethod(getGetLectureMethod())
              .addMethod(getGetAllLecturesMethod())
              .addMethod(getCreateNewLectureMethod())
              .addMethod(getGetLectureByIdMethod())
              .addMethod(getGetLectureByUserIdMethod())
              .addMethod(getGetUpvotedLectureByUserIdMethod())
              .addMethod(getEditLectureMethod())
              .addMethod(getDeleteLectureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
