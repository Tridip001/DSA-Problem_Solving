import java.util.Scanner;

public class Recursion_sort {
    public static boolean isSorted(int[] arr) {

        if (arr.length == 1) {
            return true;
        }

            if (arr[0] > arr[1]) {
                return false;
            }
            int[] smaLL_arr = new int[arr.length - 1];

            for (int i = 1; i < arr.length; i++) {

                smaLL_arr[i - 1] = arr[i];
            }
            boolean isSmall_arr_sorted = isSorted(smaLL_arr);
            return isSmall_arr_sorted;

    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [ ]a= new int[n];

            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }

        System.out.println("Array is Sorted or Not : ");
        System.out.println(isSorted(a));
    }
}
