import java.util.Scanner;

public class StrSearch1 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a email : ");
        str = sc.nextLine();
        int a = str.indexOf('@');
        int b = str.indexOf('.');
        if (a == -1)
            System.out.println("email is not  valid");
        else if (b == -1)
            System.out.println("email is not  valid");
        else
            System.out.println("email is valid ");
    }
}
