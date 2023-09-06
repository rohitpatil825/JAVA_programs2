import java.util.Scanner;

class Circle1 {
    float r;
    final float PI = 3.14f;

    Circle1() {
        r = 2.91f;
    }

    Circle1(float r) {
        this.r = r;
    }

    Circle1(Circle1 ob) {
        r = ob.r;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a redius : ");
        r = sc.nextFloat();
    }

    void show() {
        System.out.println("Redius = " + r);
    }

    void circum() {
        System.out.println("Circumference of circle = " + (2 * PI * r));
    }

    void area() {
        System.out.println("Area of circle = " + (PI * r * r));

    }
}

public class Circle {
    public static void main(String[] args) {
        Circle1 ob1, ob2, ob3, ob4;
        ob1 = new Circle1();
        ob2 = new Circle1(12.6f);
        ob3 = new Circle1(ob2);
        ob4 = new Circle1();
        System.out.println("using ob1");
        ob1.show();
        ob1.circum();
        ob1.area();
        System.out.println("using ob2");
        ob2.show();
        ob2.circum();
        ob2.area();
        System.out.println("using ob3");
        ob3.show();
        ob3.circum();
        ob3.area();
        System.out.println("using ob4");
        ob4.input();
        ob4.show();
        ob4.circum();
        ob4.area();
    }
}
