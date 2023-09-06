import java.util.Scanner;

class even_odd {
    int a;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no : ");
        a = sc.nextInt();
    }

    void calc() {
        if (a % 2 == 0)
            System.out.println(" number is even ");
        else
            System.out.println(" number is odd ");
    }

    public static void main(String[] args) {
        even_odd ob = new even_odd();
        ob.input();
        ob.calc();
    }
}