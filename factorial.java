import java.util.Scanner;

class factorial {
    int n, i, fact = 1;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        n = sc.nextInt();
    }

    void calc() {
        i = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial is : " + fact);
    }

    public static void main(String[] args) {
        factorial ob = new factorial();
        ob.input();
        ob.calc();
    }
}
