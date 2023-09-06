import java.util.Scanner;

class Addition {
    int x, y;

    void input(int a, int b) {
        x = a;
        y = b;
    }

    void calc() {
        System.out.println("First no : " + x);
        System.out.println("second no : " + y);
        System.out.println("Sum = " + (x + y));
    }

    public static void main(String[] args) {
        int x, y;
        Addition ob = new Addition();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first no : ");
        x = sc.nextInt();
        System.out.println("enter a second no : ");
        y = sc.nextInt();
        ob.input(x, y);
        ob.calc();
    }
}