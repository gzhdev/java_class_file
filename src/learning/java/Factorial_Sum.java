package learning.java;
//第9题//
public class Factorial_Sum {
    public static void main(String[] args) {
        float sum=0,fn=1;
        for (int i=1;i<=20;i++){
            fn=fn*i;
            if (i%2!=0){
                sum+=1/fn;
            }
            else {
                sum-=1/fn;
            }
        }
        System.out.println(sum);
    }
}
