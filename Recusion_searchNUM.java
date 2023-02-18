import java.util.Scanner;

public class Recusion_searchNUM {
    public static boolean Check_num_Helper(int []arr,int x,int start_index){
        if(start_index==arr.length){
            return false;
        }
        if(arr[start_index] == x){
            return true;
        }
        return Check_num_Helper(arr,x,start_index+1);
    }

    public static boolean Check_num(int []arr,int x){

        return Check_num_Helper(arr,x,0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size:-");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the num:(for search in array->)");
        int x = sc.nextInt();

        System.out.println(Check_num(arr,x));
    }
}
