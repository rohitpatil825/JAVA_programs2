import java.util.Scanner;

class While {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no : ");
        n = sc.nextInt();
        i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
