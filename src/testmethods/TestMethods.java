package testmethods;

public class TestMethods {
    public static void main(String[] args) {
        TestMethods t =new TestMethods();  //Create an Object
        t.addition();   //Called Instance method using object name
        subtraction(20,5); // Called static method Directly
        t.printName("Java is a Secure Language"); //Called Instance method using object name
        t.multiplication();  //Called Instance method using object name
        TestMethods.PrintStatement("CodeBuster","Testing"); // Called static method via Class name
        t.division(10,2);   //Called Instance method using object name
    }
    //No return type with no parameters
    public void addition(){
        int a =10, b=20;
        System.out.println("Addition is " +(a+b));
    }

    //No return type with parameters
    public static void subtraction(int x, int y){
        System.out.println("Subtarction is " +(x-y));
    }

    public void printName(String name){
        System.out.println(name);
    }

    //With return type with No parameters
    public int multiplication(){
        int m =10, n= 5;
        int result = m*n;
        System.out.println(result);
        return result;
    }

    //With return type with parameters
    public static String PrintStatement(String name, String name1){
        System.out.println(name);
        System.out.println(name);
        System.out.println(name1);
        return name;
    }

    public int division(int a, int b){
        int c = a/b;
        System.out.println(c);
        return  c;
    }


}
