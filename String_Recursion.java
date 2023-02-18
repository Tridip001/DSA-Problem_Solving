import java.util.Scanner;

public class String_Recursion {

    public  static String Replace_string(String str, char a, char b){
        if(str.length()==0){
            return str;
        }
        String small_str =Replace_string(str.substring(1),a,b);
        if(str.charAt(0)==a){
            return b+small_str;
        }
        else {
            return str.charAt(0)+small_str;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println("Replace string x to y:--");
        System.out.println(Replace_string(str,'x','y'));
    }
}
