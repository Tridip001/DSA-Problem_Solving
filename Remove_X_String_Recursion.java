import java.util.Scanner;

public class Remove_X_String_Recursion {
    public static String Remove_x(String str){
        char a = 'x';
        if(str.length()==0){
            return str;
        }
        String small_str = Remove_x(str.substring(1));

        if(str.charAt(0)==a){
            return  small_str;
        }
        else {
            return str.charAt(0)+small_str;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:-");
        String str = sc.next();

        System.out.println(Remove_x(str));

    }
}
