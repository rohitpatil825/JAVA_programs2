import java.util.Scanner;

class evenodd_sum {
    int n, i, j, esum = 0, osum = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter a number : ");
        n = sc.nextInt();
    }

    void prime() {
        int count = 0;
        System.out.println("prime no : ");
        for (i = 1; i <= n; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i);
                System.out.print(" ");
                esum = esum + i;
            }
        }
        System.out.print("\n");
        System.out.println("not prime no : ");
        for (i = 2; i <= n; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count != 2) {
                System.out.print(i);
                System.out.print(" ");
                osum = osum + i;
            }
        }
        System.out.print("\n");
        System.out.println("sum of prime is : " + esum);
        System.out.println("sum of not prime is : " + osum);
    }

    void evenodd() {
        esum = 0;
        osum = 0;
        System.out.println("Even no is : ");
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
                System.out.print(" ");
                esum = esum + i;
            }
        }
        System.out.print("\n");
        System.out.println("odd no is : ");
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
                System.out.print(" ");
                osum = osum + i;
            }
        }
        System.out.print("\n");
        System.out.println("sum of even no is : " + esum);
        System.out.println("sum of odd no is : " + osum);
    }

    public static void main(String[] args) {
        evenodd_sum ob = new evenodd_sum();
        ob.input();
        ob.prime();
        ob.evenodd();
    }
}
