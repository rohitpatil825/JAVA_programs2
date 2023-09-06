import java.util.Scanner;

class ob {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a first no : ");
        a = sc.nextInt();
        System.out.println("enter a second no : ");
        b = sc.nextInt();

    }

    void show() {
        System.out.println("first no = " + a);
        System.out.println("second no = " + b);
        System.out.println("sum = " + (a + b));
    }

    public static void main(String[] args) {
        ob x = new ob();
        x.input();
        x.show();
    }
}
