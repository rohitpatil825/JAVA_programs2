import java.util.Scanner;

class Power {
    public static void main(String[] args) {
        int x, y, pro = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter a base : ");
        x = sc.nextInt();
        System.out.println("enter a power : ");
        y = sc.nextInt();
        while (y > 0) {
            pro = pro * x;
            y--;
        }
        System.out.println("value = " + pro);
    }
}
