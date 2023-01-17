package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_moderator.proto")
public final class ModeratorServiceGrpc {

  private ModeratorServiceGrpc() {}

  public static final String SERVICE_NAME = "ModeratorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.ModeratorUsername,
      via.dk.elearn.protobuf.ModeratorModel> getGetModeratorByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getModeratorByUsername",
      requestType = via.dk.elearn.protobuf.ModeratorUsername.class,
      responseType = via.dk.elearn.protobuf.ModeratorModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.ModeratorUsername,
      via.dk.elearn.protobuf.ModeratorModel> getGetModeratorByUsernameMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.ModeratorUsername, via.dk.elearn.protobuf.ModeratorModel> getGetModeratorByUsernameMethod;
    if ((getGetModeratorByUsernameMethod = ModeratorServiceGrpc.getGetModeratorByUsernameMethod) == null) {
      synchronized (ModeratorServiceGrpc.class) {
        if ((getGetModeratorByUsernameMethod = ModeratorServiceGrpc.getGetModeratorByUsernameMethod) == null) {
          ModeratorServiceGrpc.getGetModeratorByUsernameMethod = getGetModeratorByUsernameMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.ModeratorUsername, via.dk.elearn.protobuf.ModeratorModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getModeratorByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.ModeratorUsername.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.ModeratorModel.getDefaultInstance()))
              .setSchemaDescriptor(new ModeratorServiceMethodDescriptorSupplier("getModeratorByUsername"))
              .build();
        }
      }
    }
    return getGetModeratorByUsernameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ModeratorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModeratorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModeratorServiceStub>() {
        @java.lang.Override
        public ModeratorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModeratorServiceStub(channel, callOptions);
        }
      };
    return ModeratorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ModeratorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModeratorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModeratorServiceBlockingStub>() {
        @java.lang.Override
        public ModeratorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModeratorServiceBlockingStub(channel, callOptions);
        }
      };
    return ModeratorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ModeratorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ModeratorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ModeratorServiceFutureStub>() {
        @java.lang.Override
        public ModeratorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ModeratorServiceFutureStub(channel, callOptions);
        }
      };
    return ModeratorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ModeratorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getModeratorByUsername(via.dk.elearn.protobuf.ModeratorUsername request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.ModeratorModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetModeratorByUsernameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetModeratorByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.ModeratorUsername,
                via.dk.elearn.protobuf.ModeratorModel>(
                  this, METHODID_GET_MODERATOR_BY_USERNAME)))
          .build();
    }
  }

  /**
   */
  public static final class ModeratorServiceStub extends io.grpc.stub.AbstractAsyncStub<ModeratorServiceStub> {
    private ModeratorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModeratorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModeratorServiceStub(channel, callOptions);
    }

    /**
     */
    public void getModeratorByUsername(via.dk.elearn.protobuf.ModeratorUsername request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.ModeratorModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetModeratorByUsernameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ModeratorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ModeratorServiceBlockingStub> {
    private ModeratorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModeratorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModeratorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.dk.elearn.protobuf.ModeratorModel getModeratorByUsername(via.dk.elearn.protobuf.ModeratorUsername request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetModeratorByUsernameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ModeratorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ModeratorServiceFutureStub> {
    private ModeratorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ModeratorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ModeratorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.ModeratorModel> getModeratorByUsername(
        via.dk.elearn.protobuf.ModeratorUsername request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetModeratorByUsernameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MODERATOR_BY_USERNAME = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ModeratorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ModeratorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MODERATOR_BY_USERNAME:
          serviceImpl.getModeratorByUsername((via.dk.elearn.protobuf.ModeratorUsername) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.ModeratorModel>) responseObserver);
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

  private static abstract class ModeratorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ModeratorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcModerator.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ModeratorService");
    }
  }

  private static final class ModeratorServiceFileDescriptorSupplier
      extends ModeratorServiceBaseDescriptorSupplier {
    ModeratorServiceFileDescriptorSupplier() {}
  }

  private static final class ModeratorServiceMethodDescriptorSupplier
      extends ModeratorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ModeratorServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ModeratorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ModeratorServiceFileDescriptorSupplier())
              .addMethod(getGetModeratorByUsernameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
