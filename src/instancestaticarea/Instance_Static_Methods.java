package instancestaticarea;

//Calling :- Instance Variable to Instance method :- Direct
//Calling :- Static Variable to Instance method :- Direct Or via Class name
//Calling :- Static Variable to Static method :- Direct Or via Class name
//Calling :- Instance Variable to Static method :- Via Creating an object


public class Instance_Static_Methods {
    int a = 10; //Declared Instance variable

    float b = 20.10f; //Declared Instance variable
    static  double c = 25.25d; //Declared static variable
    static String name = "Java";  //Declared static variable

    void m1() //Declared Instance method
    {
        System.out.println("Java is a Simple Language");
        int x = 20; // Declared Local variable
        System.out.println(x);
        System.out.println(a);  //called Instance Variable Directly
        System.out.println(name); //called Static Variable Directly
        System.out.println(Instance_Static_Methods.name);  ////called Static Variable using Class name
    }

    static void m2()// Declared Static method
    {
        Instance_Static_Methods obj = new Instance_Static_Methods();  //Create an Object,
     /*here Instance_Static_Methods is class name, obj reference variable name, new is a keyword and
     Instance_Static_Methods() is a Constructor */
        System.out.println(obj.a);  //Called Instance Variable to static method using object name
        System.out.println(obj.b); //Called Instance Variable to static method using object name
        System.out.println(name); //Called sttic variable to static method Directly
        System.out.println(Instance_Static_Methods.c); //Called sttic variable to static method via Class name
        System.out.println("Codebuster Testing");
        int y = 5;
        System.out.println(y);
    }

    public static void main(String[] args) {  //Main method Or Predefined method
     Instance_Static_Methods a = new Instance_Static_Methods();
     a.m1();  //Called Instance method to Static method using object name
     m2();  //Called static method to Static method Directly
     Instance_Static_Methods.m2(); ////Called static method to Static method via Class name
    }

}
