package abstactnonaccessmodifier;

public class SecondMain_Abstract {
    public static void main(String[] args) {
        Student_Abstract myObj = new Student_Abstract();
        System.out.println(myObj.x);  //call variable from Main_abstarct class
        System.out.println(myObj.name);
        myObj.m1();  //Call abstract method
    }
}
