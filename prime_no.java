import java.util.Scanner;

class prime_no {
    public static void main(String[] args) {
        int i, j, count, total = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no : ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {

                System.out.println(i);
                total++;
            }
        }
        System.out.println("total prime no = " + total);
    }
}
