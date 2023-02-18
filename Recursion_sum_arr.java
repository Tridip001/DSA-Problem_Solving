import java.util.Scanner;

public class Recursion_sum_arr {
    public static int sum(int [] arr){

        int n = arr.length;
        if(n==0){
            return 0;
        }
        else {
            int [] small_arr = new int[arr.length-1];
            for(int i=1;i<n;i++){
                small_arr[i-1] = arr[i];
            }
            return arr[0]+sum(small_arr);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of array using recursion:- ");
        System.out.println(sum(arr));
    }
}
