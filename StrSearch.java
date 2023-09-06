import java.util.Scanner;

public class StrSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Frist String : ");
        String str1 = sc.nextLine();
        System.out.println("Enter a Second  String : ");
        String str2 = sc.nextLine();
        System.out.println("String 1 is : " + str1);
        System.out.println("String 2 is : " + str2);
        if (str1.indexOf(str2) == -1) {
            System.out.println(str2 + " is not find in " + str1);
            return;
        }
        System.out.println(str2 + " find in " + str1);
    }

}
