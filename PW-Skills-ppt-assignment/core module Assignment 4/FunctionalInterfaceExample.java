interface MyFunctionalInterface {
    void performAction();
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface obj = () -> 
            System.out.println("Performing an action!");
        obj.performAction();
    }
}
