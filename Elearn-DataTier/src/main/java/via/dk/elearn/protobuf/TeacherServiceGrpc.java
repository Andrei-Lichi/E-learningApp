package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_teacher.proto")
public final class TeacherServiceGrpc {

  private TeacherServiceGrpc() {}

  public static final String SERVICE_NAME = "TeacherService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.TeacherUsername,
      via.dk.elearn.protobuf.TeacherModel> getGetTeacherByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTeacherByUsername",
      requestType = via.dk.elearn.protobuf.TeacherUsername.class,
      responseType = via.dk.elearn.protobuf.TeacherModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.TeacherUsername,
      via.dk.elearn.protobuf.TeacherModel> getGetTeacherByUsernameMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.TeacherUsername, via.dk.elearn.protobuf.TeacherModel> getGetTeacherByUsernameMethod;
    if ((getGetTeacherByUsernameMethod = TeacherServiceGrpc.getGetTeacherByUsernameMethod) == null) {
      synchronized (TeacherServiceGrpc.class) {
        if ((getGetTeacherByUsernameMethod = TeacherServiceGrpc.getGetTeacherByUsernameMethod) == null) {
          TeacherServiceGrpc.getGetTeacherByUsernameMethod = getGetTeacherByUsernameMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.TeacherUsername, via.dk.elearn.protobuf.TeacherModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTeacherByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.TeacherUsername.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.TeacherModel.getDefaultInstance()))
              .setSchemaDescriptor(new TeacherServiceMethodDescriptorSupplier("getTeacherByUsername"))
              .build();
        }
      }
    }
    return getGetTeacherByUsernameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TeacherServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeacherServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeacherServiceStub>() {
        @java.lang.Override
        public TeacherServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeacherServiceStub(channel, callOptions);
        }
      };
    return TeacherServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TeacherServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeacherServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeacherServiceBlockingStub>() {
        @java.lang.Override
        public TeacherServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeacherServiceBlockingStub(channel, callOptions);
        }
      };
    return TeacherServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TeacherServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TeacherServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TeacherServiceFutureStub>() {
        @java.lang.Override
        public TeacherServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TeacherServiceFutureStub(channel, callOptions);
        }
      };
    return TeacherServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TeacherServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getTeacherByUsername(via.dk.elearn.protobuf.TeacherUsername request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.TeacherModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeacherByUsernameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetTeacherByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.TeacherUsername,
                via.dk.elearn.protobuf.TeacherModel>(
                  this, METHODID_GET_TEACHER_BY_USERNAME)))
          .build();
    }
  }

  /**
   */
  public static final class TeacherServiceStub extends io.grpc.stub.AbstractAsyncStub<TeacherServiceStub> {
    private TeacherServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeacherServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTeacherByUsername(via.dk.elearn.protobuf.TeacherUsername request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.TeacherModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeacherByUsernameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TeacherServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TeacherServiceBlockingStub> {
    private TeacherServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeacherServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.dk.elearn.protobuf.TeacherModel getTeacherByUsername(via.dk.elearn.protobuf.TeacherUsername request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeacherByUsernameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TeacherServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TeacherServiceFutureStub> {
    private TeacherServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TeacherServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TeacherServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.TeacherModel> getTeacherByUsername(
        via.dk.elearn.protobuf.TeacherUsername request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeacherByUsernameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TEACHER_BY_USERNAME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TeacherServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TeacherServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TEACHER_BY_USERNAME:
          serviceImpl.getTeacherByUsername((via.dk.elearn.protobuf.TeacherUsername) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.TeacherModel>) responseObserver);
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

  private static abstract class TeacherServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TeacherServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcTeacher.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TeacherService");
    }
  }

  private static final class TeacherServiceFileDescriptorSupplier
      extends TeacherServiceBaseDescriptorSupplier {
    TeacherServiceFileDescriptorSupplier() {}
  }

  private static final class TeacherServiceMethodDescriptorSupplier
      extends TeacherServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TeacherServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TeacherServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TeacherServiceFileDescriptorSupplier())
              .addMethod(getGetTeacherByUsernameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
