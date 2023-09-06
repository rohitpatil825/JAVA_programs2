import java.util.Scanner;

class prime_oop {
    int n, i, j;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no to check prime or not : ");
        n = sc.nextInt();
    }

    void calc() {
        int count = 0;
        for (i = 1; i <= n; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println(" number is prime ");
        } else {
            System.out.println("number is not prime ");
        }
    }

    public static void main(String[] args) {
        prime_oop ob = new prime_oop();
        ob.input();
        ob.calc();
    }
}
