class constrcuter {
    int a, b;

    constrcuter() {
        a = 10;
        b = 20;
    }

    constrcuter(int x, int y) {
        a = x;
        b = y;
    }

    void show() {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        constrcuter ob = new constrcuter();
        constrcuter ob1 = new constrcuter(100, 200);
        ob.show();
        ob1.show();
    }
}
