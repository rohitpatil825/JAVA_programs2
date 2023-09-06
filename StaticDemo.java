class Flower {
    void show() {
        System.out.println("Jai");
        System.out.println("Jui");
    }
}

class Game {
    void show() {
        System.out.println("Cricket");
        System.out.println("Kabaddi");
    }
}

class Nasta {
    static void show() {
        System.out.println("Pohe");
        System.out.println("Misal");
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Flower ob1 = new Flower();
        Game ob2 = new Game();
        ob1.show();
        ob2.show();
        Nasta.show();
    }
}
