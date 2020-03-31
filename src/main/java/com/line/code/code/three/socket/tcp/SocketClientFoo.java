package com.line.code.code.three.socket.tcp;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//接受socket--TCP发送的消息
public class SocketClientFoo {

    @Test
    public void receive(){
        try {
            Socket socket = new Socket("127.0.0.1", 8970);
            //接受消息
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readUTF());
            //返回信息
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(socket.getInetAddress()+":"+socket.getPort());
            dataOutputStream.writeUTF("socket-tcp 接收 返回信息");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
