import time
import grpc
import hello_world_pb2
import hello_world_pb2_grpc

from concurrent import futures

class Server(hello_world_pb2_grpc.GreeterServicer):
    def pong(self, request, context):
        # TODO
        print("Response=", request.name)
        return hello_world_pb2.HelloResponse(message = "pong")

def run(host, port):
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=1))
    hello_world_pb2_grpc.add_GreeterServicer_to_server(Server(), server)
    server.add_insecure_port('%s:%d' % (host, port))
    server.start()

    _ONE_DAY_IN_SECONDS = 60 * 60 * 24
    try:
        while True:
            print("Server started at...%d" % port)
            time.sleep(_ONE_DAY_IN_SECONDS)
            # pingServer = PingServer()
            # send = pingServer.ping("pong")
            # print("Response = {}".format(send.data))
    except KeyboardInterrupt:
        server.stop(0)


if __name__ == '__main__':
    run('0.0.0.0', 3000)
