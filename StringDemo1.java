public class StringDemo1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String msg = "ye re ye re pavasa tula deto misal";
        System.out.println(msg);
        System.out.println("Length of " + msg + " is : " + msg.length());
        System.out.println("Character of 12 th location in " + msg + " is : " + msg.charAt(12));
        char[] ch = new char[msg.length() + 1];
        msg.getChars(12, 26, ch, 0);
        System.out.println(new String(ch));
        byte[] b = new byte[msg.length() + 1];
        msg.getBytes(12, 26, b, 0);
        System.out.println("substring from character 12 : " + msg.substring(12));
        System.out.println("substring from character 12 to 26 is : " + msg.substring(12, 26));
        char[] c = msg.toCharArray();
        System.out.println(new String(c));

    }

}
