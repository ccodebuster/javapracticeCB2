package constructor;
/* Why we Create Constructor?
To assign value to the Variable */
public class Test_Constructor {
    int eid; //Instance Variable
    String name; //Instance Variable

    Test_Constructor(int eid , String name){  //Declare Consructor
        this.eid = eid;
        this.name = name;
        System.out.println(eid);
        System.out.println(name);
    }

    public static void main(String[] args) {

        Test_Constructor t = new Test_Constructor(101,"Vaidehi");
        Test_Constructor t1 = new Test_Constructor(102,"bhavesh");
        Test_Constructor t2 = new Test_Constructor(103,"parvinder");

    }
    public void m1(){
        System.out.println(eid);
    }
}
