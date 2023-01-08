package exceptionhandling;

public class Test {

    public static void main(String[] args) {
        //Three types of excepetion
        //1. checked  --------- compile time
        //2. unchecked  ------------- runtime
        //3. error  ---- developer mistake

        //2 ways to handle expection
        // 1. try and catch block
        //2. throws
        //3. throw
        m1();

    }

    public static void m1() {
        try {
            System.out.println("bhavesh");
            System.out.println(10 / 0); // throw exception

        } catch (Exception a) {
            System.out.println("bhav");
            System.out.println(10 / 0);

        }
        finally{
            System.out.println("always run");
        }
    }
}
