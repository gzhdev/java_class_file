package F.I.N.A.L.web;

import java.net.*;
import java.io.*;

public class readURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.baidu.com/");
            InputStreamReader isr = new InputStreamReader(url.openStream());
            BufferedReader br = new BufferedReader(isr);
            String str;
            while ((str = br.readLine()) != null){
                System.out.println(str);
            }
            br.close();
            isr.close();
            } catch (Exception e) {
            System.out.println(e);
        }
    }
}
