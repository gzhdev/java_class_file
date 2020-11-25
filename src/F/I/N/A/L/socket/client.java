package F.I.N.A.L.socket;

import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.0.0.1", 6565);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("你好");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            String s = in.readUTF();
            System.out.println(s);
            socket.close();
            out.close();
        } catch (Exception e) { }
    }
}
