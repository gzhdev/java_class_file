package learning.java;

public class All_Narcissistic_Num {
    public static void main(String[] args) {
        for (int i=100;i<1000;i++){
            int units,tens,hundreds;
            hundreds=i/100;
            tens=i/10%10;
            units=i%10;
            if (i==Math.pow(hundreds,3)+Math.pow(tens,3)+Math.pow(units,3)){
                System.out.println(i);
            }
        }
    }
}
