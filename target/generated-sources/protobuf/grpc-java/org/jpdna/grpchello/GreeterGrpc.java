package org.jpdna.grpchello;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi
  public static final io.grpc.MethodDescriptor<org.jpdna.grpchello.HelloRequest,
      org.jpdna.grpchello.HelloResponse> METHOD_PONG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "helloworld.Greeter", "pong"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.jpdna.grpchello.HelloRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.jpdna.grpchello.HelloResponse.getDefaultInstance()));

  public static GreeterStub newStub(io.grpc.Channel channel) {
    return new GreeterStub(channel);
  }

  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreeterBlockingStub(channel);
  }

  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreeterFutureStub(channel);
  }

  public static interface Greeter {

    public void pong(org.jpdna.grpchello.HelloRequest request,
        io.grpc.stub.StreamObserver<org.jpdna.grpchello.HelloResponse> responseObserver);
  }

  public static interface GreeterBlockingClient {

    public org.jpdna.grpchello.HelloResponse pong(org.jpdna.grpchello.HelloRequest request);
  }

  public static interface GreeterFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<org.jpdna.grpchello.HelloResponse> pong(
        org.jpdna.grpchello.HelloRequest request);
  }

  public static class GreeterStub extends io.grpc.stub.AbstractStub<GreeterStub>
      implements Greeter {
    private GreeterStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    @java.lang.Override
    public void pong(org.jpdna.grpchello.HelloRequest request,
        io.grpc.stub.StreamObserver<org.jpdna.grpchello.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PONG, getCallOptions()), request, responseObserver);
    }
  }

  public static class GreeterBlockingStub extends io.grpc.stub.AbstractStub<GreeterBlockingStub>
      implements GreeterBlockingClient {
    private GreeterBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    @java.lang.Override
    public org.jpdna.grpchello.HelloResponse pong(org.jpdna.grpchello.HelloRequest request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_PONG, getCallOptions()), request);
    }
  }

  public static class GreeterFutureStub extends io.grpc.stub.AbstractStub<GreeterFutureStub>
      implements GreeterFutureClient {
    private GreeterFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreeterFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    @java.lang.Override
    public com.google.common.util.concurrent.ListenableFuture<org.jpdna.grpchello.HelloResponse> pong(
        org.jpdna.grpchello.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PONG, getCallOptions()), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final Greeter serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
      .addMethod(
        METHOD_PONG,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              org.jpdna.grpchello.HelloRequest,
              org.jpdna.grpchello.HelloResponse>() {
            @java.lang.Override
            public void invoke(
                org.jpdna.grpchello.HelloRequest request,
                io.grpc.stub.StreamObserver<org.jpdna.grpchello.HelloResponse> responseObserver) {
              serviceImpl.pong(request, responseObserver);
            }
          })).build();
  }
}
