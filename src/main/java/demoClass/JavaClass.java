package demoClass;

import org.example.Main;

import java.util.HashMap;

public class JavaClass extends Main {

    //Class is a template used to create objects and to define object data types and methods.


    public static String[] cars = {"BMV", "Nissan", "Tesla", "Ford", "Escalade", "Honda"};
    public static String[] fruits = {"Mango", "Apple", "Banana"};
    public static String[] languages = {"Java", "Python", "Javascript"};

    public static String name = "Ali";
    public static int myNumber = 450;

    public static void main(String[] args) {
        System.out.println(adsfa);

        String ab = "I love java coding";

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i<ab.length();i++){
            if (!hashMap.containsKey(ab.charAt(i))) {
                hashMap.put(ab.charAt(i), 1);
            } else {
                hashMap.put(ab.charAt(i), hashMap.get(ab.charAt(i))+1);
            }
        }
        System.out.println(hashMap);
        for (char keys: hashMap.keySet()){
            System.out.println("Total of "+keys+ ": " + hashMap.get(keys));
        }
    }

}
