package overridingExample;

public class ExampleOverriding {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.myFavoriteFruit();

        ParentClass object2 = new ChildClass();
        object2.myFavoriteFruit();


    }
}
