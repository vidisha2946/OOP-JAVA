// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Grandchild class inheriting from Dog
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is black in color");
    }
}

public class Ch3MultilevelInheritanceExample {
    public static void main(String[] args) {
        Labrador dog = new Labrador();
        dog.eat();   // Inherits from Animal class
        dog.bark();  // Inherits from Dog class
        dog.color(); // Specific to Labrador class
    }
}
