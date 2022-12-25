package conditionalstatement;

public class Nested_If_Else {
    /*     if(condition){
                  if body;
           }else if (condition){
                 else if body;
           }else{
                 else body;
          }     */

    public static void main(String[] args) {
         int marks = 72;

          if (marks>=90){
              System.out.println("Grade A");
          } else if (marks<=80 && marks >=70) {
              System.out.println("Grade B");
          } else if (marks<=60 && marks >=50) {
              System.out.println("Grade C");
          } else {
              System.out.println("Fail");
          }
        System.out.println("Hello Java");
    }
}
