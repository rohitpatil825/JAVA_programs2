public class Message {
    int x = 10;

    static void showFlower() {
        System.out.println("Jai");
        System.out.println("Jui");
        System.out.println("Mogara");
    }

    static void showNasta() {
        System.out.println("Vada");
        System.out.println("Misal");
        System.out.println("Pohe");
    }

    void showGame() {
        System.out.println("Cricket");
        System.out.println("Kho-Kho");
        System.out.println("Kabaddi");
    }

    public static void main(String[] args) {
        Message ob = new Message();
        ob.showGame();
        showNasta();
        showFlower();
        System.out.println(ob.x);
    }
}
