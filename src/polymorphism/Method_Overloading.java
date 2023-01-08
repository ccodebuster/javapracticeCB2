package polymorphism;

public class Method_Overloading {
/*The class contains more than one method with the same name but different
    number of argument or same number of arguments with different data type. These
    called overloaded method */
    public void addition(int a, int b, int c){
        System.out.println("Addition is " + (a+b));
        System.out.println(c);
    }

    public void addition(int a, String c){
        System.out.println(a);
    }

    public void addition(String a , String b){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Method_Overloading m = new Method_Overloading();
        m.addition(10,"Vaidehi");
        m.addition(10,5,20);
        m.addition("Codebuster","Testing");
    }
}
