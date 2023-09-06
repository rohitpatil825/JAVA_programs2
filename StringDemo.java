
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        char[] msg = { 'w', 'e', 'l', ' ', 'c', 'o', 'm', 'e' };
        String s3 = new String(msg);
        String s4 = new String(msg, 4, 4);
        byte[] b = { 65, 66, 67, 68, 69 };
        String s5 = new String(b);
        String s6 = new String(b, 1, 3);
        String s7 = new String(s4);
        int l = s3.length();
        System.out.println("S1 = " + s1);
        System.out.println("S2 = " + s2);
        System.out.println("S3 = " + s3);
        System.out.println("S4 = " + s4);
        System.out.println("S5 = " + s5);
        System.out.println("S6 = " + s6);
        System.out.println("S7 = " + s7);
        System.out.println("length of " + s3 + " is " + l);
        System.out.println("Length of Tushar is = " + "Tushar".length());

    }

}
