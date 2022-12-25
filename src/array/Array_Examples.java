package array;

public class Array_Examples {

    public static void main(String[] args) {
        String [] name ={"Gaurang","Bhavesh","Krishiv","Prishiv"};
        int [] number = {10,20,30,40,50,60};

        System.out.println(name[1]);  // Calling data from its index number
        System.out.println(name[2]);  // Calling data from its index number
        System.out.println(number[3]); // Calling data from its index number

        //Single Dimensional Array
        int[] x;   //Prfferd way
        int z [] = {100,200,300};

        System.out.println(z.length);  // it will give the length of the array
        System.out.println(name.length); // it will give the length of the array

        //Multi Dimensional Array
        int m[][] = new int[100][100];

        int n [][] = {{100,102,103},
                      {200,201,202},
                      {300,301,302}};

        System.out.println(n.length);
        System.out.println(n[0][0]);
        System.out.println(n[0][1]);
        System.out.println(n[2][2]);
        System.out.println(n[1][2]);
        System.out.println(n[2][0]);






    }
}
