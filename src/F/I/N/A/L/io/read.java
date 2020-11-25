package F.I.N.A.L.io;

import java.io.*;

public class read {
    private void readRecords(String fileName) {
        try {
            DataInputStream in = new DataInputStream(new FileInputStream(fileName));
            try {
                while(true) {
                    String name = in.readUTF();
                    int age = in.readInt();
                    double pay = in.readDouble();
                }
            } catch (EOFException e) {}
            finally {
                in.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
