import java.util.Scanner;

class add {
  public static void main(String[] args) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a first no : ");
    a = sc.nextInt();
    System.out.println("enter a second no : ");
    b = sc.nextInt();
    c = a + b;
    System.out.println("Addition = " + c);
  }
}
