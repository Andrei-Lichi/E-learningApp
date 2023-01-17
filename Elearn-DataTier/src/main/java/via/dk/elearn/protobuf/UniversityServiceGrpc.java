package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_university.proto")
public final class UniversityServiceGrpc {

  private UniversityServiceGrpc() {}

  public static final String SERVICE_NAME = "UniversityService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UniversityModel,
      via.dk.elearn.protobuf.LectureModel> getGetLecturesByUniversityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLecturesByUniversity",
      requestType = via.dk.elearn.protobuf.UniversityModel.class,
      responseType = via.dk.elearn.protobuf.LectureModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UniversityModel,
      via.dk.elearn.protobuf.LectureModel> getGetLecturesByUniversityMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UniversityModel, via.dk.elearn.protobuf.LectureModel> getGetLecturesByUniversityMethod;
    if ((getGetLecturesByUniversityMethod = UniversityServiceGrpc.getGetLecturesByUniversityMethod) == null) {
      synchronized (UniversityServiceGrpc.class) {
        if ((getGetLecturesByUniversityMethod = UniversityServiceGrpc.getGetLecturesByUniversityMethod) == null) {
          UniversityServiceGrpc.getGetLecturesByUniversityMethod = getGetLecturesByUniversityMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.UniversityModel, via.dk.elearn.protobuf.LectureModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLecturesByUniversity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UniversityModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setSchemaDescriptor(new UniversityServiceMethodDescriptorSupplier("GetLecturesByUniversity"))
              .build();
        }
      }
    }
    return getGetLecturesByUniversityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UniversityRequest,
      via.dk.elearn.protobuf.UniversityModel> getGetUniversitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUniversities",
      requestType = via.dk.elearn.protobuf.UniversityRequest.class,
      responseType = via.dk.elearn.protobuf.UniversityModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UniversityRequest,
      via.dk.elearn.protobuf.UniversityModel> getGetUniversitiesMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UniversityRequest, via.dk.elearn.protobuf.UniversityModel> getGetUniversitiesMethod;
    if ((getGetUniversitiesMethod = UniversityServiceGrpc.getGetUniversitiesMethod) == null) {
      synchronized (UniversityServiceGrpc.class) {
        if ((getGetUniversitiesMethod = UniversityServiceGrpc.getGetUniversitiesMethod) == null) {
          UniversityServiceGrpc.getGetUniversitiesMethod = getGetUniversitiesMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.UniversityRequest, via.dk.elearn.protobuf.UniversityModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUniversities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UniversityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UniversityModel.getDefaultInstance()))
              .setSchemaDescriptor(new UniversityServiceMethodDescriptorSupplier("GetUniversities"))
              .build();
        }
      }
    }
    return getGetUniversitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UniversityId,
      via.dk.elearn.protobuf.UniversityModel> getGetUniversityByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUniversityById",
      requestType = via.dk.elearn.protobuf.UniversityId.class,
      responseType = via.dk.elearn.protobuf.UniversityModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UniversityId,
      via.dk.elearn.protobuf.UniversityModel> getGetUniversityByIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UniversityId, via.dk.elearn.protobuf.UniversityModel> getGetUniversityByIdMethod;
    if ((getGetUniversityByIdMethod = UniversityServiceGrpc.getGetUniversityByIdMethod) == null) {
      synchronized (UniversityServiceGrpc.class) {
        if ((getGetUniversityByIdMethod = UniversityServiceGrpc.getGetUniversityByIdMethod) == null) {
          UniversityServiceGrpc.getGetUniversityByIdMethod = getGetUniversityByIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.UniversityId, via.dk.elearn.protobuf.UniversityModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUniversityById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UniversityId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UniversityModel.getDefaultInstance()))
              .setSchemaDescriptor(new UniversityServiceMethodDescriptorSupplier("GetUniversityById"))
              .build();
        }
      }
    }
    return getGetUniversityByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UniversityServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UniversityServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UniversityServiceStub>() {
        @java.lang.Override
        public UniversityServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UniversityServiceStub(channel, callOptions);
        }
      };
    return UniversityServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UniversityServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UniversityServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UniversityServiceBlockingStub>() {
        @java.lang.Override
        public UniversityServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UniversityServiceBlockingStub(channel, callOptions);
        }
      };
    return UniversityServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UniversityServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UniversityServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UniversityServiceFutureStub>() {
        @java.lang.Override
        public UniversityServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UniversityServiceFutureStub(channel, callOptions);
        }
      };
    return UniversityServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UniversityServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getLecturesByUniversity(via.dk.elearn.protobuf.UniversityModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLecturesByUniversityMethod(), responseObserver);
    }

    /**
     */
    public void getUniversities(via.dk.elearn.protobuf.UniversityRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UniversityModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUniversitiesMethod(), responseObserver);
    }

    /**
     */
    public void getUniversityById(via.dk.elearn.protobuf.UniversityId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UniversityModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUniversityByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLecturesByUniversityMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.UniversityModel,
                via.dk.elearn.protobuf.LectureModel>(
                  this, METHODID_GET_LECTURES_BY_UNIVERSITY)))
          .addMethod(
            getGetUniversitiesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.UniversityRequest,
                via.dk.elearn.protobuf.UniversityModel>(
                  this, METHODID_GET_UNIVERSITIES)))
          .addMethod(
            getGetUniversityByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.UniversityId,
                via.dk.elearn.protobuf.UniversityModel>(
                  this, METHODID_GET_UNIVERSITY_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class UniversityServiceStub extends io.grpc.stub.AbstractAsyncStub<UniversityServiceStub> {
    private UniversityServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniversityServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UniversityServiceStub(channel, callOptions);
    }

    /**
     */
    public void getLecturesByUniversity(via.dk.elearn.protobuf.UniversityModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetLecturesByUniversityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUniversities(via.dk.elearn.protobuf.UniversityRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UniversityModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetUniversitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUniversityById(via.dk.elearn.protobuf.UniversityId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UniversityModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUniversityByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UniversityServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UniversityServiceBlockingStub> {
    private UniversityServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniversityServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UniversityServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.LectureModel> getLecturesByUniversity(
        via.dk.elearn.protobuf.UniversityModel request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetLecturesByUniversityMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.UniversityModel> getUniversities(
        via.dk.elearn.protobuf.UniversityRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetUniversitiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.UniversityModel getUniversityById(via.dk.elearn.protobuf.UniversityId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUniversityByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UniversityServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UniversityServiceFutureStub> {
    private UniversityServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UniversityServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UniversityServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.UniversityModel> getUniversityById(
        via.dk.elearn.protobuf.UniversityId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUniversityByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LECTURES_BY_UNIVERSITY = 0;
  private static final int METHODID_GET_UNIVERSITIES = 1;
  private static final int METHODID_GET_UNIVERSITY_BY_ID = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UniversityServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UniversityServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LECTURES_BY_UNIVERSITY:
          serviceImpl.getLecturesByUniversity((via.dk.elearn.protobuf.UniversityModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel>) responseObserver);
          break;
        case METHODID_GET_UNIVERSITIES:
          serviceImpl.getUniversities((via.dk.elearn.protobuf.UniversityRequest) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UniversityModel>) responseObserver);
          break;
        case METHODID_GET_UNIVERSITY_BY_ID:
          serviceImpl.getUniversityById((via.dk.elearn.protobuf.UniversityId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UniversityModel>) responseObserver);
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

  private static abstract class UniversityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UniversityServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcUniversity.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UniversityService");
    }
  }

  private static final class UniversityServiceFileDescriptorSupplier
      extends UniversityServiceBaseDescriptorSupplier {
    UniversityServiceFileDescriptorSupplier() {}
  }

  private static final class UniversityServiceMethodDescriptorSupplier
      extends UniversityServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UniversityServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UniversityServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UniversityServiceFileDescriptorSupplier())
              .addMethod(getGetLecturesByUniversityMethod())
              .addMethod(getGetUniversitiesMethod())
              .addMethod(getGetUniversityByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
