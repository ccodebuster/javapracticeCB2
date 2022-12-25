package inheritance;

public class Son extends Father{

    public void m3(){
        System.out.println("Child class contain m3 method");
    }

    public void m4(){
        System.out.println("Child class contain m4 method");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.m3();
        s.m4();
        s.m1();
        s.m2();
        m1();

    }
}
