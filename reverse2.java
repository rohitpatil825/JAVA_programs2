import java.util.Scanner;

class reverse2 {
    int n;

    void input(int m) {
        n = m;
    }

    void show() {
        int a, b = 0;
        while (n > 0) {
            a = n % 10;
            b = b * 10 + a;
            n = n / 10;
        }
        System.out.println("Reverse no : " + b);
    }

    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Number : ");
        m = sc.nextInt();
        reverse2 ob = new reverse2();
        ob.show();

    }
}
