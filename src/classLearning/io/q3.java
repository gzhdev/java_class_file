package classLearning.io;


import java.io.*;

public class q3 {
    public static void main(String[] args) {
        File src = new File("e:"+File.separator+"one.log");
//        System.out.println(src);
        File tag = new File("e:"+File.separatorChar+"two.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(src));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tag));
            String s;
            int i=0;
            while ((s = br.readLine()) != null){
                i +=1;
                bw.write(i + "、" +s+"\n\r");
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("运行完成");
    }
}
