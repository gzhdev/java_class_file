package classLearning;

public class Factorial_Sum_smaple {
    public static void main(String[] args) {
        double sum=0.0;
        for (int i=1;i<=20;i++){
            sum=sum+1/fact(i)*Math.pow(-1,i-1);
        }
        System.out.println(sum);
    }
    public static double fact(int n){//递归求阶乘
        if (n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
