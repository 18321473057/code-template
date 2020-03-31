package com.line.code.code.three.socket.tcp;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//socket--TCP 发现宋消息
public class SocketServerFoo {
    @Test
    public void send() {
        try {
            ServerSocket serverSocket = new ServerSocket( 8970);
            Socket socket = serverSocket.accept();
            //发送消息
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(socket.getInetAddress() + ":" + socket.getPort());
            dataOutputStream.writeUTF("socket-tcp 接收 发送消息");
            //接受返回消息
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readUTF());


            serverSocket.close();
            socket.close();
            dataOutputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
