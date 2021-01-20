package com.gfl.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class test {
    public static void main(String[] args) throws IOException {
        String s;
        StringBuffer sb;
        StringBuilder sb2;

        ClassLoader c=new ClassLoader() {
            @Override
            protected Package[] getPackages() {
                return super.getPackages();
            }
        };

        ServerSocket serverSocket = new ServerSocket(8888);
        //循环监听
        while (true) {
            Socket socket = serverSocket.accept();
            //里面有输入流 / 输出流
            OutputStream out = socket.getOutputStream();
            out.write("hello world".getBytes());
            out.flush();//清空缓冲区
            out.close();//关闭流
        }
    }
}
