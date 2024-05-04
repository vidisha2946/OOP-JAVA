class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Ch3DynamicMethodDispatchExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Creating Dog object using Animal reference
        Animal animal2 = new Cat(); // Creating Cat object using Animal reference

        animal1.sound(); // Calls Dog's sound method
        animal2.sound(); // Calls Cat's sound method
    }
}
