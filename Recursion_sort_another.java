import java.util.Scanner;

public class Recursion_sort_another {
    public static boolean Issort(int[] arr, int start_index){
        if(start_index==arr.length-1){
            return true;
        }
        if(arr[start_index]>arr[start_index+1]){
            return false;
        }
        boolean small_sort = Issort(arr,start_index+1);
        return  small_sort;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array is sort or not: ");
        System.out.println(Issort(arr,0));
    }
}
