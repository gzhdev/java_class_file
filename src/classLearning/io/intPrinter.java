package classLearning.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class intPrinter {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];

        try {
            for (int i=0;i<10;i++) {
                String s = br.readLine();
                a[i] = Integer.parseInt(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(int i=0;i<10;i++){
            System.out.println(a[i]+" ");
        }
//        for(int i:a){
//            System.out.println(i);
//        }
        //排序算法 选择法 冒泡法
        // Arrays
        Arrays.sort(a);
        for(int i:a){
            System.out.println(i+"");
        }
    }
}
