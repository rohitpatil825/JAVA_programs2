import java.util.Scanner;

class A {
    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first no : ");
        a = sc.nextInt();
        System.out.println("Enter a Second no : ");
        b = sc.nextInt();
    }
}

class B extends A {
    int c, sum = 0;

    void input1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a third no : ");
        c = sc.nextInt();
    }

    void Add() {
        sum = a + b + c;
    }

    void show() {
        System.out.println("First no = " + a);
        System.out.println("Second no = " + b);
        System.out.println("Third no = " + c);
        System.out.println("Addition of three no = " + sum);
    }
}

class single_inheritance {
    public static void main(String[] args) {
        B ob = new B();
        ob.input();
        ob.input1();
        ob.Add();
        ob.show();
    }
}