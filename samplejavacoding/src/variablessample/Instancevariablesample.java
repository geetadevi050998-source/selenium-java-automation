package variablessample;

public class Instancevariablesample {

    int a = 5; // Instance variable

    public static void main(String[] args) {
        Instancevariablesample obj = new Instancevariablesample(); // Create object
        System.out.println(obj.a); // Access instance variable using object
        obj.loginone(); // Calling non-static method
        obj.logintwo();
    }

    public void loginone() {
        System.out.println(a); // Instance variable can be accessed directly in non-static method
    }

    public void logintwo() {
        System.out.println(a);
    }
}




