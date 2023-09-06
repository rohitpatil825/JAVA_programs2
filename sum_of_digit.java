import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        int a, b, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no : ");
        a = sc.nextInt();
        do {
            b = a % 10;
            sum = sum + b;
            a = a / 10;
        } while (a > 0);
        System.out.println("sum of digit = " + sum);
    }
}
