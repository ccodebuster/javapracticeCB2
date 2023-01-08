package interfacedemo;

public class Child_Interface implements Interface_Demo{

    @Override
    public void m1() {
        System.out.println("Method from Interface");
    }

    @Override
    public void m2() {
        System.out.println("Hello");
    }

    @Override
    public void printName() {
        System.out.println("Codebuster Testing");
    }

    public static void main(String[] args) {
        Child_Interface c = new Child_Interface();
        c.m1();
        c.m2();
        c.printName();
    }
}
