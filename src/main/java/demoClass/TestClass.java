package demoClass;

public class TestClass {

    //Methods
    // we have two different kinds of method
    // void method
    public static void totalPayment () {
        int monthlyPayment = 600;
        int months = 36;
        int total = monthlyPayment * months;
        System.out.println(total);
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
    }

    public static int totalMortgagePayment() {
        int monthlyPayment = 600;
        int months = 360;
        int total = monthlyPayment * months;
        return total;
    }
}
