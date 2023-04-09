package interviewCodingQuestions;

import java.util.HashMap;

public class MultipleProblems {


    //recursive function example
    public static void recursiveFunction(int num) {
        if (num < 11) {
            System.out.print(num);
            num++;
            recursiveFunction(num);
        }
    }

    //add number to 10
    // 1 + 1 = 2, 2+2 =4, 4 + 3 = 7, 7 + 4 = 11, 11 + 5 = 16
    public static void addNumTo10(int num) {
        for (int i = 1; i <= 10; i++) {
            num = num + i;
            System.out.println(num + "\t");
        }
        System.out.println(num);
    }

    //how to use hashmap to count each character
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

    //Nested for loop or increasing loop
    public static void pyramidOfNumber() {
        int num = 1;
        for (int i = 1; i < 5; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void increasingPyramidOfNumber() {
        for (int i = 1; i < 5; i++) {
            for (int x = 4; x >= i; x--) {
                System.out.print("x" + "\t");
            }
            System.out.println();
        }
    }

    public static void reverseName(String name) {
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }

    public static void reverseString(String sentence) {
        String reverse = "";
        String[] split_sentence = sentence.split(" ");
        for (int i = split_sentence.length - 1; i >= 0; i--) {
            reverse = reverse+split_sentence[i]+" ";
        }
        System.out.println(reverse.length());
        String trimReverse = reverse.trim();
        System.out.println(trimReverse.length());
        System.out.println(trimReverse);
    }


    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i);
        }

        recursiveFunction(1);
        System.out.println();
        addNumTo10(1);
        countEachCharacterInString("aabbbbcddd");
        pyramidOfNumber();
        //1
        // 2 3
        // 4 5 6
        // 7 8 9 10

        System.out.println("1");
        System.out.print("2");
        System.out.println("3");

        increasingPyramidOfNumber();
        reverseName("namsU");

        //Reverse String sentence  world java the to Welcome
        reverseString("world java the to Welcome");

    }
}
