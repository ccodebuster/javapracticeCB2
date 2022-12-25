package conditionalstatement;

public class Switch_Statement {
    /* switch(expression){
                    case lable1:
                         sout();
                         break;
                    case lable2:
                         sout();
                          break;
                    case lable n:
                        sout();
                         break;
                         default:
                         sout();
                         }
   */

    public static void main(String[] args) {
        String day = "C";


        switch (day){
            case "A":
                System.out.println("Monday");
                break;
            case "B":
                System.out.println("Tuesday");
                break;
            case "C":
                System.out.println("Wednesday");
                break;
            case "D" :
                System.out.println("Thursday");
                break;
            case "E":
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
