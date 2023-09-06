import java.util.*;

class Division {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First no : ");
        a = sc.nextInt();
        System.out.println("Enter a Second no : ");
        b = sc.nextInt();
    }

    void show() {
        System.out.println("First no is : " + a);
        System.out.println("Second no is : " + b);
    }

    void div() {
        float c = (float) (a / b);
        System.out.println("Division of " + a + " and " + b + " is " + c);
    }
}

public class NTryDemo {
    public static void main(String[] args) {
        Division ob = new Division();
        try {
            ob.input();
            ob.show();
            ob.div();
        } catch (InputMismatchException ex) {
            System.out.println("Enter a Valid no ");
        } catch (ArithmeticException a) {
            System.out.println("Do not enter a zero");
        }
        System.out.println("Main terminated Normally");
    }
}
