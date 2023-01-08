package exceptionhandling;

public class Test1 {

    void akshit() throws Exception{
        System.out.println(10/0);
    }
    void urvi() throws Exception{
        akshit();
    }
    void jigar(){
        try {
            urvi();
        }catch (Exception e){

            System.out.println(10/2);
        }
    }

    public static void main(String[] args) {
        Test1 t =new Test1();
     t.jigar();
    }
}
