public class StringSearch {
    public static void main(String[] args) {
        String msg = "I like Ice , i like Icecreme too ";
        System.out.println(msg);
        System.out.println("index of 'i' in " + msg + " is : " + msg.indexOf('i'));
        System.out.println("index of 'i' in " + msg + " is " + " from 10 th location is : " + msg.indexOf('i', 10));
        System.out.println("index of \"Ice\" in " + msg + " is : " + msg.indexOf("Ice"));
        System.out.println("index of \"Ice\" in " + msg + " from 15 location is : " + msg.indexOf("Ice", 15));
        System.out.println(" index of 'i' from end in " + msg + " is " + msg.lastIndexOf('i'));
        System.out
                .println(" index of 'i' from end in " + msg + " from 10 th location is :  " + msg.lastIndexOf('i', 10));
        System.out.println(" index of \"Ice\" from end in " + msg + " is :  " + msg.lastIndexOf("Ice"));
        System.out.println(
                " index of \"Ice\" from end in " + msg + " from 15 th location is : " + msg.lastIndexOf("Ice", 15));
    }

}
