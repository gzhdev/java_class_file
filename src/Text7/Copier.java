package Text7;

import java.io.*;

public class Copier {
    public static void main(String[] args) {
        File f1 = new File("E:/Java/workspace/src/Text7/0.txt");
        File f2 = new File("E:/Java/workspace/src/Text7/00.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
            String s;
            while ((s = br.readLine())!= null){
                bw.write(s+"\n");
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
