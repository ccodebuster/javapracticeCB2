package polymorphism;

public class Constructor_Overloading {
/* Same constructor name with the different number of argument or same number
    of argument with different data types it’s called constructor overloading.*/

    public Constructor_Overloading(int a) {
        System.out.println(a);
    }

    public Constructor_Overloading(int a, String name) {
        System.out.println(a);
        System.out.println(name);
    }

    public Constructor_Overloading(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Constructor_Overloading c1 = new Constructor_Overloading(10);
        Constructor_Overloading c3 = new Constructor_Overloading(100,200);
        Constructor_Overloading c2 = new Constructor_Overloading(50, "Ram");

    }
}
