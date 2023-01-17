package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_country.proto")
public final class CountryServiceGrpc {

  private CountryServiceGrpc() {}

  public static final String SERVICE_NAME = "CountryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CountryRequest,
      via.dk.elearn.protobuf.CountryModel> getGetCountriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCountries",
      requestType = via.dk.elearn.protobuf.CountryRequest.class,
      responseType = via.dk.elearn.protobuf.CountryModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CountryRequest,
      via.dk.elearn.protobuf.CountryModel> getGetCountriesMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CountryRequest, via.dk.elearn.protobuf.CountryModel> getGetCountriesMethod;
    if ((getGetCountriesMethod = CountryServiceGrpc.getGetCountriesMethod) == null) {
      synchronized (CountryServiceGrpc.class) {
        if ((getGetCountriesMethod = CountryServiceGrpc.getGetCountriesMethod) == null) {
          CountryServiceGrpc.getGetCountriesMethod = getGetCountriesMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.CountryRequest, via.dk.elearn.protobuf.CountryModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCountries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CountryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CountryModel.getDefaultInstance()))
              .setSchemaDescriptor(new CountryServiceMethodDescriptorSupplier("GetCountries"))
              .build();
        }
      }
    }
    return getGetCountriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CountryId,
      via.dk.elearn.protobuf.CountryModel> getGetCountryByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCountryById",
      requestType = via.dk.elearn.protobuf.CountryId.class,
      responseType = via.dk.elearn.protobuf.CountryModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CountryId,
      via.dk.elearn.protobuf.CountryModel> getGetCountryByIdMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.CountryId, via.dk.elearn.protobuf.CountryModel> getGetCountryByIdMethod;
    if ((getGetCountryByIdMethod = CountryServiceGrpc.getGetCountryByIdMethod) == null) {
      synchronized (CountryServiceGrpc.class) {
        if ((getGetCountryByIdMethod = CountryServiceGrpc.getGetCountryByIdMethod) == null) {
          CountryServiceGrpc.getGetCountryByIdMethod = getGetCountryByIdMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.CountryId, via.dk.elearn.protobuf.CountryModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCountryById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CountryId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.CountryModel.getDefaultInstance()))
              .setSchemaDescriptor(new CountryServiceMethodDescriptorSupplier("GetCountryById"))
              .build();
        }
      }
    }
    return getGetCountryByIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CountryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountryServiceStub>() {
        @java.lang.Override
        public CountryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountryServiceStub(channel, callOptions);
        }
      };
    return CountryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CountryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountryServiceBlockingStub>() {
        @java.lang.Override
        public CountryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountryServiceBlockingStub(channel, callOptions);
        }
      };
    return CountryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CountryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CountryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CountryServiceFutureStub>() {
        @java.lang.Override
        public CountryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CountryServiceFutureStub(channel, callOptions);
        }
      };
    return CountryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CountryServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCountries(via.dk.elearn.protobuf.CountryRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CountryModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCountriesMethod(), responseObserver);
    }

    /**
     */
    public void getCountryById(via.dk.elearn.protobuf.CountryId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CountryModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCountryByIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCountriesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.CountryRequest,
                via.dk.elearn.protobuf.CountryModel>(
                  this, METHODID_GET_COUNTRIES)))
          .addMethod(
            getGetCountryByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.CountryId,
                via.dk.elearn.protobuf.CountryModel>(
                  this, METHODID_GET_COUNTRY_BY_ID)))
          .build();
    }
  }

  /**
   */
  public static final class CountryServiceStub extends io.grpc.stub.AbstractAsyncStub<CountryServiceStub> {
    private CountryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountryServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCountries(via.dk.elearn.protobuf.CountryRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CountryModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetCountriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCountryById(via.dk.elearn.protobuf.CountryId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CountryModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCountryByIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CountryServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CountryServiceBlockingStub> {
    private CountryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.CountryModel> getCountries(
        via.dk.elearn.protobuf.CountryRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetCountriesMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.CountryModel getCountryById(via.dk.elearn.protobuf.CountryId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCountryByIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CountryServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CountryServiceFutureStub> {
    private CountryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CountryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CountryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.CountryModel> getCountryById(
        via.dk.elearn.protobuf.CountryId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCountryByIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COUNTRIES = 0;
  private static final int METHODID_GET_COUNTRY_BY_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CountryServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CountryServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COUNTRIES:
          serviceImpl.getCountries((via.dk.elearn.protobuf.CountryRequest) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CountryModel>) responseObserver);
          break;
        case METHODID_GET_COUNTRY_BY_ID:
          serviceImpl.getCountryById((via.dk.elearn.protobuf.CountryId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.CountryModel>) responseObserver);
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

  private static abstract class CountryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CountryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcCountry.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CountryService");
    }
  }

  private static final class CountryServiceFileDescriptorSupplier
      extends CountryServiceBaseDescriptorSupplier {
    CountryServiceFileDescriptorSupplier() {}
  }

  private static final class CountryServiceMethodDescriptorSupplier
      extends CountryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CountryServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CountryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CountryServiceFileDescriptorSupplier())
              .addMethod(getGetCountriesMethod())
              .addMethod(getGetCountryByIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
