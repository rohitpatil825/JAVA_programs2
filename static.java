class Static {
    int rno;
    String name;
    String cname = "VCK";

    Static(int x, String y) {
        rno = x;
        name = y;
    }

    void show() {
        System.out.println(" Roll no = " + rno + "\n Name = " + name + "\n College name = " + cname);
    }

    public static void main(String[] args) {
        Static ob1 = new Static(1, "Tushar");
        Static ob2 = new Static(2, "Pranav");
        ob1.show();
        System.out.println("****************************************");
        ob2.show();

    }
}
