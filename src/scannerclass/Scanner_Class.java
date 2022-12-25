package scannerclass;

import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
//        int a =10;
//        int b =20;
//        String n = "Codebuster";
//        System.out.println("Addition is  = " +(a+b));
//        System.out.println(n);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name " );
        String name = sc.next();
        System.out.println("Enter Marks of English :");
        int eng = sc.nextInt();
        System.out.println("Enter Marks of Science :");
        int sci = sc.nextInt();
//        boolean e = sc.nextBoolean();
//        double f = sc.nextDouble();
//        float g = sc.nextFloat();

        int total = eng + sci ;
        System.out.println("Total of C and D  = " +total);

        System.out.println("engter englissh marsk");
        while(!sc.hasNextInt()){
            System.out.println("invalid emtry");
            sc.next();
        }
        int englishMark=sc.nextInt();

    }


}
