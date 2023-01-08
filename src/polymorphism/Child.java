package polymorphism;

public class Child extends Parent{

    @Override
    public void add(int a, int b) {
        super.add(a,b);
        System.out.println(a - b);
    }

    public void women(){
        super.women(); //method calling from Parent class using super keyword
        System.out.println("Teacher");  // child class method statements
    }

    public void marry(){
        System.out.println("White Girl");
    }

    public static void main(String[] args) {
        Child child = new Child();
//        child.add(10,5);
//        child.printName("Codebuster");
//        child.women();
        child.marry();
    }
}
