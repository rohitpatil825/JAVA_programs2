import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        int a, b, n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        a = sc.nextInt();
        do {
            b = a % 10;
            n = n * 10 + b;
            a = a / 10;
        } while (a > 0);
        System.out.println("Reverse no = " + n);
    }
}
