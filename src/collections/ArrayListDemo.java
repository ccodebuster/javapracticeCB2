package collections;

import java.util.ArrayList;

public class ArrayListDemo {
    /*
    * ArrayList supports dynamic array that can grow as needed
    * It can contain duplicate element and it also maintains the insertion order
    * manipulation is slow because a lot of shifting to be occured if any elemet is removed from the array list
    * Arrylist  snot synchronised
    * Arraylist allows random access because it works on the index basis
    * */


    public static void main(String[] args) {
        String[] names = {"bhavesh", "akshit", "kuldip", " hetvi"};
        //System.out.println(names[1]);
        //ArrayList <String> names1 = new ArrayList<>(Arrays.asList(names));
        ArrayList<String> names1 = new ArrayList();
        names1.add("gaurang");
        names1.add("anish");
        names1.add("nidhi");
        names1.add("nidhi");
        System.out.println(names1 + "___________1st line");
        names1.set(2, "riddhi");
        System.out.println(names1 + "___________2st line");
        names1.remove(1);
        System.out.println(names1 + "___________3st line");

       // Collections.sort(names1); homework

        ArrayList<String> names2 = new ArrayList();
        names2.addAll(names1);
        System.out.println(names2);

        for(String e:names2){
           if(e.equalsIgnoreCase("RIDDHI")){
               System.out.println(e);
           }
        }
    }
}
