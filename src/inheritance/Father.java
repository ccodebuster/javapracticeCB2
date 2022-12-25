package inheritance;

public class Father {
    public static void m1(){  //static method
        System.out.println("Parent class contain m1 method");
    }

    public void m2(){  //Instance Method
        System.out.println("Parent class contain m2 method");
    }

    public static void main(String[] args) {
        Father f = new Father(); //To Access Instance method or Variable we declared an Object
        m1();  //static method called Directly
        f.m2();  //Instance method called using object name
    }
}
