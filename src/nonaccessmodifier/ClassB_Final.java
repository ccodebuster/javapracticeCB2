package nonaccessmodifier;

public class ClassB_Final{
    final int a= 50;
    final float b = 20.256f;

    public static void main(String[] args) {
        ClassB_Final cf = new ClassB_Final();
        System.out.println(cf.a);
        System.out.println(cf.b);
    }
}
