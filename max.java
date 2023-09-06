import java.util.Scanner;

class max {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a first no : ");
        a = sc.nextInt();
        System.out.println("enter a second no : ");
        b = sc.nextInt();
        if (a > b) {
            System.out.println("max no is = " + a);
        } else {
            System.out.println("max no is = " + b);
        }
    }
}
