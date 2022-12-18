package accessmodifiers;

public class ClassB_Public {
    public static void main(String[] args) {
        ClassC_Default cd =new ClassC_Default();
        ClassA_Public myObj = new ClassA_Public();
//        System.out.println(myObj.email);
//        System.out.println(myObj.name);
//        System.out.println(myObj.name1);

        System.out.println(cd.fname);

    }
}
