import java.util.*;

class Fan2 {
    private String fcomp, ftype, fcolor;
    private byte war, nob, speed;
    private short price;
    private boolean state;

    void show() {
        System.out.println("company =" + fcomp);
        System.out.println("Type =" + ftype);
        System.out.println("Color =" + fcolor);
        System.out.println("Warranty =" + war);
        System.out.println("No of blades =" + nob);
        System.out.println("Speed =" + speed);
        System.out.println("Price = " + price);
        System.out.println("State = " + state);
    }

    public Fan2(String Fcomp, String Ftype, String Fcolor, int War, int Speed, int Nob, int Price, boolean State) {
        fcomp = Fcomp;
        ftype = Ftype;
        fcolor = Fcolor;
        war = (byte) War;
        speed = (byte) Speed;
        nob = (byte) Nob;
        price = (short) Price;
        state = State;
    }

    public Fan2() {
        fcomp = "Bajaj";
        ftype = "Ceiling";
        fcolor = "Black";
        war = 1;
        speed = 2;
        nob = 3;
        price = 1500;
        state = false;
    }

    public Fan2(Fan2 ob) {
        fcomp = ob.fcomp;
        ftype = ob.ftype;
        fcolor = ob.fcolor;
        war = ob.war;
        speed = ob.speed;
        nob = ob.nob;
        price = ob.price;
        state = ob.state;
    }

    void on() {
        state = true;
        if (speed != 0) {
            System.out.println("Fan is moving of speed : " + speed);
        } else {
            System.out.println("Fan is not moving Fan is off");
        }
    }

    void off() {
        state = false;
        System.out.println("Fan is off");

    }

    void setSpeed(int sp) {
        if (sp < 0)
            sp = 0;
        if (sp > 5) {
            sp = 5;
        }
        speed = (byte) sp;
        if (state)
            System.out.println("Fan is Moving on speed : " + speed);
        else
            System.out.println("Fan is not moving speed is : " + speed);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Company : ");
        fcomp = sc.nextLine();
        System.out.println("Enter a type : ");
        ftype = sc.nextLine();
        System.out.println("Enter a Color : ");
        fcolor = sc.nextLine();
        System.out.println("Enter a Warranty : ");
        war = sc.nextByte();
        System.out.println("Enetr a Spped ");
        speed = sc.nextByte();
        System.out.println("Enter a No. of Blades : ");
        nob = sc.nextByte();
        System.out.println("Enter a Price ");
        price = sc.nextShort();
    }

}

public class FanDemo3 {
    public static void main(String[] args) {
        Fan2 f1 = new Fan2("Usha", "Ceiling", "Brown", 1, 3, 4, 2000, false);
        Fan2 f2 = new Fan2();
        Fan2 f3 = new Fan2(f1);
        Fan2 f4 = new Fan2();
        System.out.println("Using F1 fan");
        f1.show();
        f1.on();
        f1.off();
        f1.setSpeed(3);
        System.out.println("Using F2 fan");
        f2.show();
        f2.on();
        f2.off();
        f2.setSpeed(2);
        System.out.println("Using F3 fan");
        f3.show();
        f3.on();
        f3.off();
        f3.setSpeed(4);
        System.out.println("Using F4 fan");
        f4.input();
        f4.show();
        f4.on();
        f4.off();
        f4.setSpeed(4);

    }
}
