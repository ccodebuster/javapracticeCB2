package exceptionhandling;

public class Test_Throw {
    public static void validate(int age){
       if(age<18){
          throw new ArithmeticException("person not eligible for vote");
       } else{
           System.out.println("person  eligible for vote");
       }
    }


    public static void main(String[] args) {
        validate(15);
    }
}
