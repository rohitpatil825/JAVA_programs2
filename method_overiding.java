class A {
    final void show() {
        System.out.println("Tushar");
    }
}

class B extends A {
    void show1() {
        System.out.println("Hello Boss");
    }
}

public class method_overiding {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
    }

}
