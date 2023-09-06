import java.util.Scanner;

class A {
    int a;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first no : ");
        a = sc.nextInt();
    }
}

class B extends A {
    int b;

    void input1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Second no : ");
        b = sc.nextInt();
    }
}

class C extends B {
    int c, sum;

    void input2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Third no : ");
        c = sc.nextInt();
    }

    void Add() {
        sum = a + b + c;
    }

    void show() {
        System.out.println("First no = " + a);
        System.out.println("Second no = " + b);
        System.out.println("Third no = " + c);
        System.out.println("Addition is  = " + sum);
    }
}

class multilevel_inheretance {
    public static void main(String[] args) {
        C ob = new C();
        ob.input();
        ob.input1();
        ob.input2();
        ob.Add();
        ob.show();
    }
}
