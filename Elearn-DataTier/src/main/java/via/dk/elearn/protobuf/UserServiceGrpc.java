package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.Name,
      via.dk.elearn.protobuf.UserModel> getGetUserByNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByName",
      requestType = via.dk.elearn.protobuf.Name.class,
      responseType = via.dk.elearn.protobuf.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.Name,
      via.dk.elearn.protobuf.UserModel> getGetUserByNameMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.Name, via.dk.elearn.protobuf.UserModel> getGetUserByNameMethod;
    if ((getGetUserByNameMethod = UserServiceGrpc.getGetUserByNameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserByNameMethod = UserServiceGrpc.getGetUserByNameMethod) == null) {
          UserServiceGrpc.getGetUserByNameMethod = getGetUserByNameMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.Name, via.dk.elearn.protobuf.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserByName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.Name.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserByName"))
              .build();
        }
      }
    }
    return getGetUserByNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserName,
      via.dk.elearn.protobuf.UserModel> getGetUserByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByUsername",
      requestType = via.dk.elearn.protobuf.UserName.class,
      responseType = via.dk.elearn.protobuf.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserName,
      via.dk.elearn.protobuf.UserModel> getGetUserByUsernameMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserName, via.dk.elearn.protobuf.UserModel> getGetUserByUsernameMethod;
    if ((getGetUserByUsernameMethod = UserServiceGrpc.getGetUserByUsernameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserByUsernameMethod = UserServiceGrpc.getGetUserByUsernameMethod) == null) {
          UserServiceGrpc.getGetUserByUsernameMethod = getGetUserByUsernameMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.UserName, via.dk.elearn.protobuf.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserByUsername"))
              .build();
        }
      }
    }
    return getGetUserByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserModel,
      via.dk.elearn.protobuf.UserModel> getCreateNewUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNewUser",
      requestType = via.dk.elearn.protobuf.UserModel.class,
      responseType = via.dk.elearn.protobuf.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserModel,
      via.dk.elearn.protobuf.UserModel> getCreateNewUserMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserModel, via.dk.elearn.protobuf.UserModel> getCreateNewUserMethod;
    if ((getCreateNewUserMethod = UserServiceGrpc.getCreateNewUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateNewUserMethod = UserServiceGrpc.getCreateNewUserMethod) == null) {
          UserServiceGrpc.getCreateNewUserMethod = getCreateNewUserMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.UserModel, via.dk.elearn.protobuf.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNewUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateNewUser"))
              .build();
        }
      }
    }
    return getCreateNewUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserId,
      via.dk.elearn.protobuf.UserModel> getGetUserByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserByID",
      requestType = via.dk.elearn.protobuf.UserId.class,
      responseType = via.dk.elearn.protobuf.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserId,
      via.dk.elearn.protobuf.UserModel> getGetUserByIDMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserId, via.dk.elearn.protobuf.UserModel> getGetUserByIDMethod;
    if ((getGetUserByIDMethod = UserServiceGrpc.getGetUserByIDMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserByIDMethod = UserServiceGrpc.getGetUserByIDMethod) == null) {
          UserServiceGrpc.getGetUserByIDMethod = getGetUserByIDMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.UserId, via.dk.elearn.protobuf.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUserByID"))
              .build();
        }
      }
    }
    return getGetUserByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserModel,
      via.dk.elearn.protobuf.UserModel> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = via.dk.elearn.protobuf.UserModel.class,
      responseType = via.dk.elearn.protobuf.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserModel,
      via.dk.elearn.protobuf.UserModel> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserModel, via.dk.elearn.protobuf.UserModel> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.UserModel, via.dk.elearn.protobuf.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserModel,
      via.dk.elearn.protobuf.Nothing> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = via.dk.elearn.protobuf.UserModel.class,
      responseType = via.dk.elearn.protobuf.Nothing.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserModel,
      via.dk.elearn.protobuf.Nothing> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserModel, via.dk.elearn.protobuf.Nothing> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.UserModel, via.dk.elearn.protobuf.Nothing>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.Nothing.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserId,
      via.dk.elearn.protobuf.UserModel> getGetAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUsers",
      requestType = via.dk.elearn.protobuf.UserId.class,
      responseType = via.dk.elearn.protobuf.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserId,
      via.dk.elearn.protobuf.UserModel> getGetAllUsersMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.UserId, via.dk.elearn.protobuf.UserModel> getGetAllUsersMethod;
    if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUsersMethod = UserServiceGrpc.getGetAllUsersMethod) == null) {
          UserServiceGrpc.getGetAllUsersMethod = getGetAllUsersMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.UserId, via.dk.elearn.protobuf.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUsers"))
              .build();
        }
      }
    }
    return getGetAllUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUserByName(via.dk.elearn.protobuf.Name request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByNameMethod(), responseObserver);
    }

    /**
     */
    public void getUserByUsername(via.dk.elearn.protobuf.UserName request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void createNewUser(via.dk.elearn.protobuf.UserModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNewUserMethod(), responseObserver);
    }

    /**
     */
    public void getUserByID(via.dk.elearn.protobuf.UserId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByIDMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(via.dk.elearn.protobuf.UserModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(via.dk.elearn.protobuf.UserModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.Nothing> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void getAllUsers(via.dk.elearn.protobuf.UserId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserByNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.Name,
                via.dk.elearn.protobuf.UserModel>(
                  this, METHODID_GET_USER_BY_NAME)))
          .addMethod(
            getGetUserByUsernameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.UserName,
                via.dk.elearn.protobuf.UserModel>(
                  this, METHODID_GET_USER_BY_USERNAME)))
          .addMethod(
            getCreateNewUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.UserModel,
                via.dk.elearn.protobuf.UserModel>(
                  this, METHODID_CREATE_NEW_USER)))
          .addMethod(
            getGetUserByIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.UserId,
                via.dk.elearn.protobuf.UserModel>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.UserModel,
                via.dk.elearn.protobuf.UserModel>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.UserModel,
                via.dk.elearn.protobuf.Nothing>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getGetAllUsersMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.UserId,
                via.dk.elearn.protobuf.UserModel>(
                  this, METHODID_GET_ALL_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUserByName(via.dk.elearn.protobuf.Name request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByUsername(via.dk.elearn.protobuf.UserName request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNewUser(via.dk.elearn.protobuf.UserModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNewUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserByID(via.dk.elearn.protobuf.UserId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(via.dk.elearn.protobuf.UserModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(via.dk.elearn.protobuf.UserModel request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.Nothing> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUsers(via.dk.elearn.protobuf.UserId request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.dk.elearn.protobuf.UserModel getUserByName(via.dk.elearn.protobuf.Name request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.UserModel getUserByUsername(via.dk.elearn.protobuf.UserName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.UserModel createNewUser(via.dk.elearn.protobuf.UserModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNewUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.UserModel getUserByID(via.dk.elearn.protobuf.UserId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.UserModel updateUser(via.dk.elearn.protobuf.UserModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.dk.elearn.protobuf.Nothing deleteUser(via.dk.elearn.protobuf.UserModel request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.UserModel> getAllUsers(
        via.dk.elearn.protobuf.UserId request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.UserModel> getUserByName(
        via.dk.elearn.protobuf.Name request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.UserModel> getUserByUsername(
        via.dk.elearn.protobuf.UserName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByUsernameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.UserModel> createNewUser(
        via.dk.elearn.protobuf.UserModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNewUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.UserModel> getUserByID(
        via.dk.elearn.protobuf.UserId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.UserModel> updateUser(
        via.dk.elearn.protobuf.UserModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.dk.elearn.protobuf.Nothing> deleteUser(
        via.dk.elearn.protobuf.UserModel request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER_BY_NAME = 0;
  private static final int METHODID_GET_USER_BY_USERNAME = 1;
  private static final int METHODID_CREATE_NEW_USER = 2;
  private static final int METHODID_GET_USER_BY_ID = 3;
  private static final int METHODID_UPDATE_USER = 4;
  private static final int METHODID_DELETE_USER = 5;
  private static final int METHODID_GET_ALL_USERS = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER_BY_NAME:
          serviceImpl.getUserByName((via.dk.elearn.protobuf.Name) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel>) responseObserver);
          break;
        case METHODID_GET_USER_BY_USERNAME:
          serviceImpl.getUserByUsername((via.dk.elearn.protobuf.UserName) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel>) responseObserver);
          break;
        case METHODID_CREATE_NEW_USER:
          serviceImpl.createNewUser((via.dk.elearn.protobuf.UserModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserByID((via.dk.elearn.protobuf.UserId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((via.dk.elearn.protobuf.UserModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((via.dk.elearn.protobuf.UserModel) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.Nothing>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((via.dk.elearn.protobuf.UserId) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcUser.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserByNameMethod())
              .addMethod(getGetUserByUsernameMethod())
              .addMethod(getCreateNewUserMethod())
              .addMethod(getGetUserByIDMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getGetAllUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
