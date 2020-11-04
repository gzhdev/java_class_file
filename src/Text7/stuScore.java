package Text7;

import java.io.*;

public class stuScore {
    public static void main(String[] args) {
        File f1 = new File("E:/Java/workspace/src/Text7/student.txt");
        File f2 = new File("E:/Java/workspace/src/Text7/statistics.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
            String[][] str;
            str = new String[20][];
            int m = 0;
            String s;
            while ((s=br.readLine()) != null){
                str[m] = s.split(" ");
                m++;
            }
            double chiavg,engavg,mathavg,sciavg;
            chiavg = 0;
            engavg=0;
            mathavg = 0;
            sciavg = 0;
            for (String[] a:str){
                if(a==null){
                    break;
                }
                chiavg += Double.parseDouble(a[1]);
                engavg += Double.parseDouble(a[2]);
                mathavg += Double.parseDouble(a[3]);
                sciavg += Double.parseDouble(a[4]);
            }
            chiavg = chiavg/m;
            engavg = engavg/m;
            mathavg = mathavg/m;
            sciavg = sciavg/m;
            bw.write("共有"+m+"人，语文平均分为"+chiavg+"，英语平均分为"+engavg+"，数学平均分为"+mathavg+"，科学平均分为"+sciavg);
            br.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
