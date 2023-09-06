import java.util.Scanner;
class Switch
{
    public static void main(String[] args)
    {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no : ");
        a=sc.nextInt();
        System.out.println("enter a second no : ");
        b=sc.nextInt();
        System.out.println("1.add 2.sub 3.mul 4.div");
        System.out.println("enter your choice : ");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("addition = "+(a+b));
                break;
            case 2:
                System.out.println("Substraction = "+(a-b));
                break;
            case 3:
                System.out.println("multiplication = "+(a*b));
                break;
            case 4:
                System.out.println("Division = "+(a/b));
                break;
            default:
                System.out.println("invalid choice ");
        }
    }
}
