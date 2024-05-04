class Parent {
    String message = "Hello from Parent class";
    void displayMessage() {
        System.out.println(message);
    }
}
class Child extends Parent {
    String message = "Hello from Child class";

    void displayMessage() {
        System.out.println(message);
        System.out.println(super.message);
    }
}
public class Ch3SuperKeyword {
    public static void main(String[] args) {
        Child child = new Child();
        child.displayMessage();
    }
}


