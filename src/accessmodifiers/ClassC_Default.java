package accessmodifiers;

class ClassC_Default {
    String fname = "Gaurang";
    String lname = "Patel";
    int m = 500;
    int n = 500;
    int a = m+n;

    public static void main(String[] args) {
        ClassC_Default cd = new ClassC_Default();
        System.out.println(cd.fname);
        System.out.println(cd.lname);
        System.out.println(cd.m);
        System.out.println(cd.a);
    }
}
