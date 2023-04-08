package demoClass;

public class MethodClassExample {

    //Methods
    // we have two different kinds of method
    // void method
    public static void totalPayment () {
        int monthlyPayment = 600;
        int months = 36;
        int total = monthlyPayment * months;
    }

    public static void getMessage () {
        String code = "I love coding";
        String prog = " And Programing";
        System.out.println(code + prog);
    }

    // return method
    public static String getCodingMessage() {
        String prog = "Selenium and Appium could be challenging";
        String code = "Coding is fun but "+ prog;
        return code;
        // String code = "Coding is fun but  Selenium and Appium could be challenging";
    }

    public static int totalMortgagePayment() {
        int monthlyPayment = 600;
        int months = 360;
        int total = monthlyPayment * months;
        return total;
    }


    // Overloading example
    public static int getEveryDayNetProfit(int sales, int expense, int tax) {
        int netProfit = sales - expense - tax;
        return netProfit;
    }

    public static int getEveryDayNetProfit(int sales, int expense) {
        int netProfit = sales - expense;
        return netProfit;
    }

    public static void aboutYou(String language, String color, String city) {
        String aboutU = "I love "+ language + ", my favorite color is "+ color + ", and i live in "+ city;
        System.out.println(aboutU);
    }

    public static void aboutYou(String language, String color) {
        String aboutU = "I love "+ language + ", my favorite color is "+ color;
        System.out.println(aboutU);
    }

    public static void aboutYou(int luckyNumber, int favNumber) {
        String aboutU = "My lucky Number is "+luckyNumber+", and my favorite number is "+ favNumber;
        System.out.println(aboutU);
    }

}
