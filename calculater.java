import java.util.Scanner;

class calc {
    public static void main(String[] args) {
        int a, b, ch;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a  first no : ");
        a = sc.nextInt();
        System.out.println(" enter a second no : ");
        b = sc.nextInt();
        System.out.println("1.add 2.sub 3.mul 4.div");
        System.out.println(" enter your choice : ");
        ch = sc.nextInt();
        if (ch == 1)
            System.out.println("Addition = " + (a + b));
        else if (ch == 2)
            System.out.println("Substraction = " + (a - b));
        else if (ch == 3)
            System.out.println("multiplication = " + (a * b));
        else if (ch == 4)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Invalid choice ");

    }
}