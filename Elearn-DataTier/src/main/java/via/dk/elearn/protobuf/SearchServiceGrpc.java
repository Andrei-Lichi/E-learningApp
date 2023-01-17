package via.dk.elearn.protobuf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rpc_search.proto")
public final class SearchServiceGrpc {

  private SearchServiceGrpc() {}

  public static final String SERVICE_NAME = "SearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.SearchLecturesRequest,
      via.dk.elearn.protobuf.LectureModel> getSearchLecturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchLectures",
      requestType = via.dk.elearn.protobuf.SearchLecturesRequest.class,
      responseType = via.dk.elearn.protobuf.LectureModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.SearchLecturesRequest,
      via.dk.elearn.protobuf.LectureModel> getSearchLecturesMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.SearchLecturesRequest, via.dk.elearn.protobuf.LectureModel> getSearchLecturesMethod;
    if ((getSearchLecturesMethod = SearchServiceGrpc.getSearchLecturesMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchLecturesMethod = SearchServiceGrpc.getSearchLecturesMethod) == null) {
          SearchServiceGrpc.getSearchLecturesMethod = getSearchLecturesMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.SearchLecturesRequest, via.dk.elearn.protobuf.LectureModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchLectures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.SearchLecturesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.LectureModel.getDefaultInstance()))
              .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("SearchLectures"))
              .build();
        }
      }
    }
    return getSearchLecturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.SearchUsersRequest,
      via.dk.elearn.protobuf.UserModel> getSearchUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchUsers",
      requestType = via.dk.elearn.protobuf.SearchUsersRequest.class,
      responseType = via.dk.elearn.protobuf.UserModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.SearchUsersRequest,
      via.dk.elearn.protobuf.UserModel> getSearchUsersMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.SearchUsersRequest, via.dk.elearn.protobuf.UserModel> getSearchUsersMethod;
    if ((getSearchUsersMethod = SearchServiceGrpc.getSearchUsersMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchUsersMethod = SearchServiceGrpc.getSearchUsersMethod) == null) {
          SearchServiceGrpc.getSearchUsersMethod = getSearchUsersMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.SearchUsersRequest, via.dk.elearn.protobuf.UserModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.SearchUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.UserModel.getDefaultInstance()))
              .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("SearchUsers"))
              .build();
        }
      }
    }
    return getSearchUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.dk.elearn.protobuf.SearchQuestionsRequest,
      via.dk.elearn.protobuf.QuestionModel> getSearchQuestionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SearchQuestions",
      requestType = via.dk.elearn.protobuf.SearchQuestionsRequest.class,
      responseType = via.dk.elearn.protobuf.QuestionModel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<via.dk.elearn.protobuf.SearchQuestionsRequest,
      via.dk.elearn.protobuf.QuestionModel> getSearchQuestionsMethod() {
    io.grpc.MethodDescriptor<via.dk.elearn.protobuf.SearchQuestionsRequest, via.dk.elearn.protobuf.QuestionModel> getSearchQuestionsMethod;
    if ((getSearchQuestionsMethod = SearchServiceGrpc.getSearchQuestionsMethod) == null) {
      synchronized (SearchServiceGrpc.class) {
        if ((getSearchQuestionsMethod = SearchServiceGrpc.getSearchQuestionsMethod) == null) {
          SearchServiceGrpc.getSearchQuestionsMethod = getSearchQuestionsMethod =
              io.grpc.MethodDescriptor.<via.dk.elearn.protobuf.SearchQuestionsRequest, via.dk.elearn.protobuf.QuestionModel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SearchQuestions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.SearchQuestionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.dk.elearn.protobuf.QuestionModel.getDefaultInstance()))
              .setSchemaDescriptor(new SearchServiceMethodDescriptorSupplier("SearchQuestions"))
              .build();
        }
      }
    }
    return getSearchQuestionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceStub>() {
        @java.lang.Override
        public SearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceStub(channel, callOptions);
        }
      };
    return SearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceBlockingStub>() {
        @java.lang.Override
        public SearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceBlockingStub(channel, callOptions);
        }
      };
    return SearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SearchServiceFutureStub>() {
        @java.lang.Override
        public SearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SearchServiceFutureStub(channel, callOptions);
        }
      };
    return SearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchLectures(via.dk.elearn.protobuf.SearchLecturesRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchLecturesMethod(), responseObserver);
    }

    /**
     */
    public void searchUsers(via.dk.elearn.protobuf.SearchUsersRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchUsersMethod(), responseObserver);
    }

    /**
     */
    public void searchQuestions(via.dk.elearn.protobuf.SearchQuestionsRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchQuestionsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchLecturesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.SearchLecturesRequest,
                via.dk.elearn.protobuf.LectureModel>(
                  this, METHODID_SEARCH_LECTURES)))
          .addMethod(
            getSearchUsersMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.SearchUsersRequest,
                via.dk.elearn.protobuf.UserModel>(
                  this, METHODID_SEARCH_USERS)))
          .addMethod(
            getSearchQuestionsMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                via.dk.elearn.protobuf.SearchQuestionsRequest,
                via.dk.elearn.protobuf.QuestionModel>(
                  this, METHODID_SEARCH_QUESTIONS)))
          .build();
    }
  }

  /**
   */
  public static final class SearchServiceStub extends io.grpc.stub.AbstractAsyncStub<SearchServiceStub> {
    private SearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchLectures(via.dk.elearn.protobuf.SearchLecturesRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchLecturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchUsers(via.dk.elearn.protobuf.SearchUsersRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchQuestions(via.dk.elearn.protobuf.SearchQuestionsRequest request,
        io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.QuestionModel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSearchQuestionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SearchServiceBlockingStub> {
    private SearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.LectureModel> searchLectures(
        via.dk.elearn.protobuf.SearchLecturesRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchLecturesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.UserModel> searchUsers(
        via.dk.elearn.protobuf.SearchUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<via.dk.elearn.protobuf.QuestionModel> searchQuestions(
        via.dk.elearn.protobuf.SearchQuestionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSearchQuestionsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SearchServiceFutureStub> {
    private SearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SearchServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SEARCH_LECTURES = 0;
  private static final int METHODID_SEARCH_USERS = 1;
  private static final int METHODID_SEARCH_QUESTIONS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_LECTURES:
          serviceImpl.searchLectures((via.dk.elearn.protobuf.SearchLecturesRequest) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.LectureModel>) responseObserver);
          break;
        case METHODID_SEARCH_USERS:
          serviceImpl.searchUsers((via.dk.elearn.protobuf.SearchUsersRequest) request,
              (io.grpc.stub.StreamObserver<via.dk.elearn.protobuf.UserModel>) responseObserver);
          break;
        case METHODID_SEARCH_QUESTIONS:
          serviceImpl.searchQuestions((via.dk.elearn.protobuf.SearchQuestionsRequest) request,
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

  private static abstract class SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SearchServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.dk.elearn.protobuf.RpcSearch.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SearchService");
    }
  }

  private static final class SearchServiceFileDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier {
    SearchServiceFileDescriptorSupplier() {}
  }

  private static final class SearchServiceMethodDescriptorSupplier
      extends SearchServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SearchServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchServiceFileDescriptorSupplier())
              .addMethod(getSearchLecturesMethod())
              .addMethod(getSearchUsersMethod())
              .addMethod(getSearchQuestionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
