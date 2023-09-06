import java.util.Scanner;

class Sum_product {
    public static void main(String[] args) {
        int n, sum = 0, pro = 1, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no : ");
        n = sc.nextInt();
        while (n > 0) {
            a = n % 10;
            if (a % 2 == 0) {
                sum = sum + a;
            } else {
                pro = pro * a;
            }
            n = n / 10;
        }
        System.out.println("Sum of even digit = " + sum);
        System.out.println("product of odd digit = " + pro);
    }
}
