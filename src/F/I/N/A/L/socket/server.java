package F.I.N.A.L.socket;

import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try{
            ServerSocket s_socket = new ServerSocket(6565);
            Socket socket = s_socket.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            String s = in.readUTF();
            System.out.println(s);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("你好，我是服务器");
            socket.close();
            in.close();
            out.close();
            s_socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
