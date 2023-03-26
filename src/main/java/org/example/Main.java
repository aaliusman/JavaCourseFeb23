package org.example;

public class Main {
    public static void main(String[] args) {


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
        System.out.println(3+5);
        System.out.println(5-2);
        System.out.println(5*3);
        System.out.println(10/2);
        System.out.println(10%4);
        System.out.println(19%4);
        System.out.println(15%5);

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
        x+=2;
        x+=2;
        x+=2;
        System.out.println(x);

        // --
        int y = 10;
        // y = y - 1;
        y--;
        --y;
        System.out.println(y);

        int c = 5;
        // c = c - 2
        c-=2;
        c-=2;
        System.out.println(c);

        boolean checkVal = 5 > 7;
        System.out.println(checkVal);


        // Java conditions and If Else statement
        if (true) {
            System.out.println("Print false");
        } else  {
            System.out.println("Print true");
        }


        if (false) {
            System.out.println("Print false");
        } else  {
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
        } else  {
            System.out.println("num is < 10");
        }

        String iopp = "Ali";
        String pio = "Ali";
        if (iopp == pio) {
            System.out.println("Strings match");
        } else  {
            System.out.println("Strings do not match");
        }

        int klp = 34;
        int lkp = 35;

        if (klp == lkp) {
            System.out.println("Both integer equals to each other");
        } else  {
            System.out.println("Not equals");
        }

        // <= less than or equal will return true
        if (34 <= 35) {
            System.out.println("Print line 235");
        } else  {
            System.out.println("Print line 237");
        }

        // >= greater than or equal will return true
        if (34 >= 35) {
            System.out.println("Print line 242");
        } else  {
            System.out.println("Print line 244");
        }

        // != represent not equal, in any programing language ! sign mean not
        if ( 24 != 34) {
            System.out.println("Print line 249");
        } else  {
            System.out.println("Print line 251");
        }


    }
}