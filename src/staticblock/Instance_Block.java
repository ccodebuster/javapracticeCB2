package staticblock;

public class Instance_Block {

    //Declare Instance Block
    String name;
    {
        System.out.println("Java");
        name = "Programming Language";
    }

    String name1;
    {
        System.out.println("Simple");
        name1 = "Language";
    }

    public void display(){
        System.out.println(name);
        System.out.println(name1);
    }
    public static void main(String[] args) {
        Instance_Block i = new Instance_Block();
        i.display();
        System.out.println("CodeBuster**************");
    }
}
