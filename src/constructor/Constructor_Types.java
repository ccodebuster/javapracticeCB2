package constructor;

public class Constructor_Types {

    public Constructor_Types() //Declare Zero Argunment/Parameter Constructor
    {
        System.out.println("Zero Argunment Constructor");
    }

    public Constructor_Types(int a)  //Declare One Argunment/Parameter Constructor
    {
        System.out.println("One Argunment Constructor");
        System.out.println(a);
    }

    public Constructor_Types(int a,int b)  //Declare Two Argunment/Parameter Constructor
    {
        System.out.println("Two Argunment Constructor");
        System.out.println(a);
        System.out.println(b);
    }

    public Constructor_Types(String name, int id, String lname){
        System.out.println(name);
        System.out.println(id);
        System.out.println(lname);
    }


    public static void main(String[] args) {
        Constructor_Types ct = new Constructor_Types();  // calling Zero Argunment cunstructor
        Constructor_Types ct1 = new Constructor_Types(10); // calling One Argunment Constructor
        Constructor_Types ct2 = new Constructor_Types(20); // calling One Argunment Constructor
        Constructor_Types ct3 = new Constructor_Types(100,200); // calling Two Argunment Constructor
        Constructor_Types ct4 = new Constructor_Types("Codebuster",100,"Testing"); // calling Three Argunment Constructor


    }
}
