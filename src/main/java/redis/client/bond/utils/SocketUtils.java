package redis.client.bond.utils;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @author lubin
 * @version 1.0
 * @date 2020/4/20 16:38
 */
public class SocketUtils  {

    public static Socket getSocket(String addrIp,Integer port,Integer connectionTimeOut){
        Socket  socket = new Socket();
        try {
            socket.setReuseAddress(true);
            socket.setSoTimeout(0);
            socket.setKeepAlive(true);
            socket.setSoLinger(true,0);
            SocketAddress socketAddress = new InetSocketAddress(addrIp,port);
            socket.connect(socketAddress,connectionTimeOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return socket;

    }
}
