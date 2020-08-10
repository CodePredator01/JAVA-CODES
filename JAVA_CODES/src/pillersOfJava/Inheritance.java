package pillersOfJava;

class Animal { // Parent
    String name;
    float weight;

    void eat() {
    }

    void run() {
    }

    void sleep() {
    }

    void speak() {
    }
}

// We use extende function for call Parent class
// Code Re-Usability
class Dog extends Animal { // Child
    void bark() {
        run();
        sleep(); // Inherited the speak method from the Parent class (Animal)
    }
}
