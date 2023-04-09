package arraylistExample;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    // Arrays we assign multiple values to one variable
    public static void main(String[] args) {
        // The length/size of Arrays are fixed
        String[] cars = {"BMV", "Nissan", "Tesla", "Ford"};
        System.out.println(cars[2]);
        cars[2] = "Chevy";
        System.out.println(cars[2]);
        cars[3] = "Volvo";
        System.out.println(cars[3]);


        // It is very similar to array, but it is dynamic, and we change the size of it according to the situation
        ArrayList<String> car = new ArrayList<>();
        System.out.println(car.size());
        car.add("Mazda");
        car.add("BMV");
        car.add("Mercedes");
        car.add("Cadillac");
        System.out.println(car.get(0));
        System.out.println(car.get(3));
        System.out.println(car);
        car.add("Tesla");
        car.set(4, "Honda");
        System.out.println(car);
        System.out.println(car.size());


        int n = car.size();
        //
        for (int i = 0;i < car.size(); i++) {
            if(car.get(i).equals("Honda")) {
                System.out.println("It does contain Honda");
            } else {
                System.out.println("Not equals Honda");
            }
        }

        ArrayList aList = new ArrayList(Arrays.asList("Mazda", "JBMV", "Mercedes", "Ccadillac", "Honda"));

        for (int i = 0;i < car.size(); i++) {
            if (car.get(i).equals(aList.get(i))) {
                System.out.println("Passed");
            } else {
                System.out.println("Test Failed: " + car.get(i) + " not equal to " + aList.get(i));
            }
        }





    }
}
