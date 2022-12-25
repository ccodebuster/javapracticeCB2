package inheritance;

public class GrandSon extends Son{
    public void m5(){
        System.out.println("m5 method");
    }

    public void m6(){
        System.out.println("m6 method");
    }

    public static void main(String[] args) {
        GrandSon g = new GrandSon();
        m1();
        g.m2();
        g.m3();
        g.m4();
        g.m5();
        g.m6();
    }
}
