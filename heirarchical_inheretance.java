import java.util.Scanner;

class A {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first no : ");
        a = sc.nextInt();
        System.out.println("enter a second no : ");
        b = sc.nextInt();
    }
}

class B extends A {
    int sum = 0;

    void show() {
        System.out.println("First no = " + a);
        System.out.println("Second no = " + b);
        System.out.println("Addition = " + sum);
    }

    void add() {
        sum = a + b;
    }
}

class C extends A {
    int sub = 0;

    void show() {
        System.out.println("First no = " + a);
        System.out.println("Second no = " + b);
        System.out.println("Substraction = " + sub);
    }

    void sub() {
        sub = a - b;
    }
}

class heirarchical_inheretance {
    public static void main(String[] args) {
        B ob = new B();
        C ob1 = new C();
        ob.input();
        ob.add();
        ob.show();
        ob1.input();
        ob1.sub();
        ob1.show();
    }
}
