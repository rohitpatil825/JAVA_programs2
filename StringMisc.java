public class StringMisc {
    public static void main(String[] args) {
        String str = "Bas Aata";
        System.out.println(str);
        System.out.println(str + " in upper case : " + str.toUpperCase());
        System.out.println(str + " in lower case : " + str.toLowerCase());
        System.out.println(str.concat(" Jato Amhi"));
        str = "     Back & Bill ,went up the till     ";
        System.out.println("Length of : " + str + " is : " + str.length());
        str = str.trim();
        System.out.println("Length of " + str + " is : " + str.length());
        System.out.println(str.replace('B', 'J'));
    }
}
