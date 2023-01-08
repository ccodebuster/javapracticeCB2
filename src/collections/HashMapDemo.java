package collections;

import java.util.HashMap;

public class HashMapDemo {
//Hasmap doesnt maintin order of insertion
    //It allows only unique value

    //-Example----
    //Name(Key): bhavesh(Value)
    //Surnae(Key): patel(value)

    public static void main(String[] args) {

        HashMap<String, Integer> languages = new HashMap();
        languages.put("java", 1);
        languages.put("python", 2);
        languages.put("pearl", 3);
        languages.put("C#", 4);
        languages.put("C#", 4);
        System.out.println("hasmap full " + languages);
        System.out.println("-----------------------------------------------------");
        // access();
        // access1();
        //changeKey();
        remove();
    }

    public static void access() {
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "java");
        languages.put(2, "java1");
        languages.put(3, "java2");
        //get() method to get value
        String value = languages.get(2);
        System.out.println("value  at index : " + value);

    }

    public static void access1() {
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "java");
        languages.put(2, "java1");
        languages.put(3, "java2");
        System.out.println("hashmap(44): " + languages);
        System.out.println("hashmap(45): " + languages.keySet()); // return set view od keys using keyset()
        System.out.println("hashmap(46): " + languages.values()); // return set view od values using values()
        System.out.println("hashmap(47): " + languages.entrySet()); // return view od key value pairs using entryset()
    }

    public static void changeKey() {
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "java");
        languages.put(2, "java1");
        languages.put(3, "java2");
        System.out.println("hashmap(55): " + languages);
        languages.replace(2, "pearl");
        System.out.println("hashmap(57): " + languages);
    }

    public static void remove(){
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "java");
        languages.put(2, "java1");
        languages.put(3, "java2");
        System.out.println("hashmap(65): " + languages);
       String value =languages.remove(2);
        System.out.println(value);
        System.out.println("hashmap(69): " + languages);
    }
}
