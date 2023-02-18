import java.util.Scanner;

public class Recursion_fristINDEX {
    public static int first_Index(int arr[],int x){
        // using copying the array:
        int n = arr.length;
        if(n==0){
            return -1;
        }
        if(arr[0]==x){
            return 0;
        }
        int [] small_arr = new int[n-1];
        for(int i=1;i<n;i++){
            small_arr[i-1] = arr[i];
        }
        int first_index = first_Index(small_arr,x);

        if(first_index==-1){
            return -1;
        }
        else {
            return first_index+1;
        }
    }
    public static int Find_first_IND(int arr[],int x, int start_index){
        // using same array ::

        int n = arr.length;
        if(start_index == n){
            return -1;
        }
        if(arr[start_index]==x){
            return start_index;
        }
        return Find_first_IND(arr,x,start_index+1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();;
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println("Find the first_index:--(Using make copy array:)");
        System.out.println(first_Index(arr,x));
        System.out.println("Find the first_index:--(Using One array:)");
        System.out.println(Find_first_IND(arr,x,0));
    }
}
