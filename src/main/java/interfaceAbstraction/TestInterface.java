package interfaceAbstraction;

public class TestInterface {

    public static void main(String[] args) {
        Car tesla = new Tesla();
        tesla.carPower();
        tesla.carType();

        Car bmw = new BMV();
        bmw.carPower();
        bmw.carType();

    }
}
