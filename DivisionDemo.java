import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter a first no : ");
            a = sc.nextInt();
            System.out.println("enter a second  no : ");
            b = sc.nextInt();
            c = a / b;
            System.out.println("Division of " + a + " and " + b + " is " + c);
        } catch (InputMismatchException ex) {
            System.out.println("Enter a valid no ");
        } catch (ArithmeticException ex) {
            System.out.println("Don't enter a zero as 2nd number");
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
