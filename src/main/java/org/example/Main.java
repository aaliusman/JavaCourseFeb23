package org.example;

import demoClass.JavaClass;
import demoClass.PracticeClass;
import demoClass.TestClass;

public class Main {

    String adsfa = "Hello";
    int jh = 23;





    public static void main(String[] args) {
        System.out.println();

        // Whenever we have a variable, we need to start with datatype, then variable name then assign value to it
        // dataType variableName = value;
        String myName = "Usman";
        String address = "My name is Usman, and i Live at #$#$ hollybrooke";
        System.out.println(myName);

        /* We have two different types of data type ( Primitive, Non-Primitive)
        // Primitive data types - includes byte , short , int , long , float , double , boolean and char.
        Non-primitive data types - String
        String name = "Usman"
        System.out.println("I love coding");
        */

        /* asdflaksdfj */
        // lkajsdlfjasfj
        // alksdjflasdjfkl

        int age1 = 16, age2 = 18, age3 = 18;
        String name1 = "Ali", name2 = "Rover", name3 = "John";


        int num = 234;
        System.out.println(num);
        System.out.println(num);

        char ch = '1';
        char ab = 'a';
        char ba = 'y';

        System.out.println(ch);
        System.out.println(ba);
        System.out.println(ab);

        // a float value can hold only a maximum of 7 digits after the decimal
        float tr = 2f;
        System.out.println(tr);

        // We should use int datatype for Any integer value which is less than 8 digits
        int bigVal = 12345;
        System.out.println(bigVal);
        // Integer between 8 decimals to 15 decimals. You should go for double data type
        double bigValue = 1234578;
        System.out.println(bigValue);

        //boolean
        boolean asdfasf = true;
        boolean isTrue = true;
        boolean abcdd = true;
        boolean isFalse = false;
        boolean fdsf = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        System.out.println("Hello world!");
        System.out.println("Hello Universe");
        System.out.println(45);

        //Concatenation of two strings
        String n0 = "Name: ";
        String n1 = "My name";
        String n2 = " is Muhammad Usman";
        System.out.println(n0 + n1 + n2);
        System.out.println(n1 + " is Muhammad Usman");

        //Concatenation of int and string
        String abn = "My number is ";
        int n34 = 45;
        System.out.println(abn + n34);


        String av = "45";
        int va = 45;
        int baa = 5;
        System.out.println(av + va + baa);

        System.out.println(va + baa);

        int hj = 4 + 10;
        System.out.println(hj / 7);
        System.out.println(5 * 3);

        int kl = 34 - hj;
        System.out.println(kl);

        double bigVa = 3432443;
        System.out.println(bigVa);


        // It is possible to re-assign the value to variable, but we can't create two variable with same name.
        // When you re-assign the value, you don't add the datatype

        String myNameIs = "Arsalan";
        myNameIs = "Khan";
        System.out.println(myNameIs);

        int myAccountBal = 10000;
        myAccountBal = 10000 - 2000;
        System.out.println(myAccountBal);

        String nam = "Ali";
        String name = "Arsalan";
        name = "kahn";
        nam = "Usman";
        nam = "Usman";
        System.out.println(nam);

        int myFavNum = 26;
        myFavNum = 16;
        myFavNum = 10;
        myFavNum = 34;
        System.out.println(myFavNum);

        // String with special characters
        // my favorite car is "Range Rover"

        String myFavSUV = "My favorite SUV is \"Range Rover\"";
        System.out.println(myFavSUV);


        //Casting - Changing the datatype String to int
        String age = "10";
        int newAge = Integer.parseInt(age);
        System.out.println(newAge);
        System.out.println(age);
        System.out.println(newAge);

        int divideBy2 = newAge / 2;
        int add10 = newAge + 10;
        int minus10 = newAge - 10;
        System.out.println(divideBy2);
        System.out.println(age);

        //Casting - Changing the datatype Int to String
        int nop = 34;
        String newInt = Integer.toString(nop);
        System.out.println(newInt);

        //Different type of operators in java +, -, *, /,%, ++, --
        System.out.println(3 + 5);
        System.out.println(5 - 2);
        System.out.println(5 * 3);
        System.out.println(10 / 2);
        System.out.println(10 % 4);
        System.out.println(19 % 4);
        System.out.println(15 % 5);

        // ++
        int i = 2;
        //i = i + 1;
        // ++i or i++;
        i++;
        ++i;
        i++;
        i = i + 1;
        i = i + 1;
        System.out.println(i);
        //+=2
        int x = 2;
        // x = x + 2
        x += 2;
        x += 2;
        x += 2;
        System.out.println(x);

        // --
        int y = 10;
        // y = y - 1;
        y--;
        --y;
        System.out.println(y);

        int c = 5;
        // c = c - 2
        c -= 2;
        c -= 2;
        System.out.println(c);

        boolean checkVal = 5 > 7;
        System.out.println(checkVal);


        // Java conditions and If Else statement
        if (true) {
            System.out.println("Print false");
        } else {
            System.out.println("Print true");
        }


        if (false) {
            System.out.println("Print false");
        } else {
            System.out.println("Print true");
        }

        if (8 > 9) {
            System.out.println("8 is > 9");
        } else {
            System.out.println("8 is < 9");
        }

        int nummm = 9;
        if (nummm > 10) {
            System.out.println("numm is > 10");
        } else {
            System.out.println("num is < 10");
        }

        String iopp = "Ali";
        String pio = "Ali";
        if (iopp == pio) {
            System.out.println("Strings match");
        } else {
            System.out.println("Strings do not match");
        }

        int klp = 34;
        int lkp = 35;

        if (klp == lkp) {
            System.out.println("Both integer equals to each other");
        } else {
            System.out.println("Not equals");
        }

        // <= less than or equal will return true
        if (34 <= 35) {
            System.out.println("Print line 235");
        } else {
            System.out.println("Print line 237");
        }

        // >= greater than or equal will return true
        if (34 >= 35) {
            System.out.println("Print line 242");
        } else {
            System.out.println("Print line 244");
        }

        // != represent not equal, in any programing language ! sign mean not
        if (24 != 34) {
            System.out.println("Print line 249");
        } else {
            System.out.println("Print line 251");
        }

        //if else if
        String fruit = "apple";

        if (fruit.equals("Orange")) {
            System.out.println("This Orange");
        } else if (fruit.equals("Mango")) {
            System.out.println("This is Mango");
        } else if (fruit.equals("apple")) {
            System.out.println("This is apple");
        } else {
            System.out.println("Can't find fruit");
        }

        int month = 3;
        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else {
            System.out.println("Can't find Month");
        }

        //if ( 24 != 34) {
        //            System.out.println("Print line 249");
        //        } else  {
        //            System.out.println("Print line 251");
        //        }
        String checkNumbers = (24 == 34) ? "integers are equal" : "integers are not equal";
        System.out.println(checkNumbers);

        int mon = 9;
        String months = (mon == 8) ? "Month is Sep" : "Don't know what month is it";
        System.out.println(months);

        // Switch statement
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
        }

        //print a number 1 to 10
        // while loop, do while loop and for loop
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println("~~~~~~~~~~~~~~~");

        //the while loop loops through a block of code as long as a specified condition is true:
        int pp = 1;
        while (pp <= 5) {
            System.out.println(pp);
            pp++;
        }
        int tt = 3;
        while (tt == 6) {
            System.out.println(tt);
            tt++;
        }
        int card = 200;
        while (card == 300) {
            // i will click on bonus offer
            // i will go next page
            // i will validate if text is $200 online cash rewards bonus after making at least $1,000 in
        }

        // Do/While Loop
//        The do/while loop is a variant of the while loop. This loop will execute the code block once,
//        before checking if the condition is true, then it will repeat the loop as long as the condition is true.
        int bonus = 1;
        do {
            System.out.println(bonus);
            bonus++;
        } while (bonus == 3);

        int us = 4;
        do {
            System.out.println(us);
            us += 2;
        } while (us == 8);

        // for loop
        for (int z = 0; z < 10; z++) {
            System.out.println(z);
        }

        for (int z = 4; z <= 5; z++) {
            System.out.println(z);
            //z++
        }

        //Arrays are used to store multiple values in a single variable,
        // instead of declaring separate variables for each value.
        // After creation, its length is fixed.

        //arrays index start with 0
        // length starts with 1
        String[] cars = {"BMV", "Nissan", "Tesla", "Ford", "Escalade", "Honda", "Chevy"};
        int carsLength = cars.length;
        System.out.println(carsLength);
        System.out.println(cars[2]);

        int[] myNumbers = {2, 4, 6, 8, 10};
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[3]);

        for (int v = 0; v < cars.length; v++) {
            System.out.println(cars[v]);
        }

        System.out.println("***********");

        // revers your arrays
        // g =4;
        for (int g = cars.length - 1; g >= 0; g--) {
                System.out.println(cars[g]);
        }

        // if you want to print specific car
        for (int g = cars.length - 1; g >= 0; g--) {
            if (cars[g].equals("Tesla")) {
                System.out.println(cars[g]);
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        // String built in methods
        String txt = " I LOVE CODING ";
        System.out.println(txt.length());
        System.out.println(txt.toLowerCase().equals("i love coding"));
        System.out.println(txt.charAt(5));
        System.out.println(txt.length());
        // trim gets rid of extra spaces in the string before and after
        System.out.println(txt.trim().length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.contains("LOVE  "));
        // split example (we need to use \\$, \\., \\+) rest should work fine
        String boa = " Continue to BankofAmerica/com ";
        String [] split_boa = boa.split("/");
        System.out.println(split_boa[0]);
        System.out.println(split_boa[1]);
        if (split_boa[0].trim().equals("Continue to BankofAmerica")) {
            System.out.println("Test Passed");
        } else  {
            System.out.println("Test failed");
        }


        //Class example
        //Home home = new Home()
        JavaClass javaClass = new JavaClass();
        System.out.println(javaClass.cars[4]);

        System.out.println(javaClass.name);
        System.out.println(javaClass.myNumber);


        System.out.println(PracticeClass.multiplication);


        TestClass testClass = new TestClass();
        testClass.totalPayment();
        testClass.getMessage();

        testClass.getCodingMessage();
        System.out.println(testClass.getCodingMessage());
        System.out.println(testClass.totalMortgagePayment());













    }
}