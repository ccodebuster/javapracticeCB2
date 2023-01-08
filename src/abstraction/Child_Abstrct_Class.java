package abstraction;

public class Child_Abstrct_Class extends Parent_Abstract_Class {

    @Override
    void addition() {
        System.out.println("method from Parent Abstrct class");
    }

    @Override
    void printName() {
        System.out.println("Codebuster Testing and method called from Parent Abstrct Class");
    }

    @Override
    void balancecheck() {
        System.out.println("Balance check functionality");
    }

    @Override
    void withdrawmoney() {
        System.out.println("Withdraw Money Functionaly");
    }

    public static void main(String[] args) {
        Child_Abstrct_Class c = new Child_Abstrct_Class();
        c.addition();
        c.printName();


    }

}
