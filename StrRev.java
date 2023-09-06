
//prog: read string and print vartically and reverce 

import java.util.Scanner;

public class StrRev {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        str = sc.nextLine();
        System.out.println(str);
        System.out.println("Print Given String Vartically");
        // char [] str2=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println("Print Given String Reverse");
        for (int i = str.length(); i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
