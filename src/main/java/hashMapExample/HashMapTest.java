package hashMapExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapTest {

    public static void countEachCharacterInString(String s) {
        HashMap<Character, Integer> hashMap = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {
                hashMap.put(s.charAt(i), 1);
            }
        }
        System.out.println(hashMap);
    }

    public static void main(String[] args) {

        //Hashmap contains keys and values pair
        HashMap<String, String> hasMap = new HashMap<>();
        hasMap.put("PA", "Philadelphia");
        hasMap.put("Ohio", "Cleveland");
        hasMap.put("NY", "New York");
        hasMap.put("NJ", "Princeton");

        System.out.println(hasMap.get("NY"));
        System.out.println(hasMap.get("NJ"));

//        // ArrayList which contains different numbers, and you want to count how many times each number appear
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(1, 2, 1, 1, 3, 4, 4, 3, 4));
        HashMap<Integer, Integer> hash = new HashMap<>();

        // 1 = 2, 2 = 4, 3 = 2

        for (int i = 0; i < arrayList.size(); i++) {
            // ! mean not equal or not
            if (!hash.containsKey(arrayList.get(i))) {
                hash.put(arrayList.get(i), 1);
                System.out.println(hash);
            } else {
                hash.put(arrayList.get(i), hash.get(arrayList.get(i)) + 1);
                System.out.println(hash);
            }
        }
        System.out.println(hash);

        countEachCharacterInString("aabbbccccd");
    }
}
