package Text7;

import java.io.*;

public class outPrinter {
    public static void main(String[] args) {
        File f1 = new File("E:/Java/workspace/src/Text7/1.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String s;
            while((s=br.readLine()) != null){
                System.out.println(s);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
