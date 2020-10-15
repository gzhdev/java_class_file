package learning.java;
//第10题//
public class Array_max_min {
    public static void main(String[] args) {
        int arr[][]={{71,82,53,24},{45, 66,72,88},{19,10,11,12}};
        int max_x,max_y,min_x,min_y,max,min;
        max_x=1;
        max_y=1;
        min_x=1;
        min_y=1;
        max=arr[0][0];
        min=arr[0][0];
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr[0].length;j++){
                if (arr[i][j]>=max){
                    max=arr[i][j];
                    max_x=i+1;
                    max_y=j+1;
                }
                if (arr[i][j]<=min){
                    min=arr[i][j];
                    min_x=i+1;
                    min_y=j+1;
                }
            }
        }
        System.out.println("最大值为"+max+"，其行号为"+max_x+"，列号为"+max_y);
        System.out.println("最小值为"+min+"，其行号为"+min_x+"，列号为"+min_y);
    }
}
