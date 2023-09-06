import java.util.Scanner;

class Febonacci {
    public static void main(String[] args) {
        int x = 0, y = 1, sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a max no : ");
        n = sc.nextInt();
        while (sum <= n) {
            System.out.println(sum);
            x = y;
            y = sum;
            sum = x + y;
        }
    }
}
