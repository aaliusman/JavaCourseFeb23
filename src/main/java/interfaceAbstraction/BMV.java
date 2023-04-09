package interfaceAbstraction;

public class BMV implements Car{
    @Override
    public void carType() {
        System.out.println("This is BMW sedan");
    }

    @Override
    public void carPower() {
        System.out.println("This BMW has a horsepower of 400");
    }
}
