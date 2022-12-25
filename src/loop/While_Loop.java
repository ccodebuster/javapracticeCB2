package loop;

public class While_Loop {
    /*  while (condition){
                body;}
   */
    public static void main(String[] args) {
        int i =10;   //Iteration
        while (i >= 1) {   //Condition
           System.out.println(i);
            i--;  //Increment/Decrement
        }
        i = 0;
        while (i<=5){
            System.out.println(i);
            i++;
        }
    }

}
