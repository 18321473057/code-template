package com.line.code.code.three.socket.udp;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class SocketUDPServer {

    @Test
    public void send() {
        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8972);
            DatagramSocket datagramSocket = new DatagramSocket();
            byte[] bytes = "我是UDP".getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetSocketAddress);
            datagramSocket.send(datagramPacket);


            //TODO  关闭



        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
