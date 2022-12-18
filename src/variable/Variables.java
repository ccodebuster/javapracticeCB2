package variable;
/*1.Local Variables:-Variables Which Are declared inside the method or inside the Contructor or inside the block called local Variable.
 Local variables - Scope :- Inside the Methods or Inside the Constructor or Inside the blocks.*/

/*Instance Variable:- variables which are declared inside the class but outside the methods are called Instance Variable.
Scope:- across the class but into instance area.
*/

/*Static Variables:- Variables which are declared inside the class,outside the method with static keyword is called Static Variable.
 Scope:- across the class or within the class
*/

//Constructor:- Class name and Constructor name must be same

public class Variables {
    int b =20;          //Instance Variable
    float c = 19.9f;    //Instance Variable
    String myName = "Vaidehi";  //Instance Variable

    static int num = 100;  //Static Variable
    static String name1 = "John";  //Static variable

    public Variables(){  //Declare Constructor
        int maths = 200;  //Local Variable
    }
     //Instance Block
     {
         char x ='A';  //Local Variable
         int y = 15; //Local Variable
     }

     //Static Block
    static {
        double m = 20.52d;
     }


    public static void main(String [] args){    //Main Method Or pre-defined method

        Variables variables = new Variables();  //Create object
        System.out.println(variables.b);
        System.out.println(variables.myName);
        int a =10;     //Declare Local Variable
        String name = "CodeBuster";  //Declare Local Variable
        System.out.println("Java is Simple, Secure and Platform Independent Language");
        System.out.println(name);
        System.out.println(a);

    }
}
