package interfaceAbstraction;

public class Tesla implements Car{


    @Override
    public void carType() {
        System.out.println("This is Tesla Sedan");
    }

    @Override
    public void carPower() {
        System.out.println("The horsepower is 200");
    }
}
