class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " barks.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " meows.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal generic = new Animal("SomeAnimal");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        generic.speak(); // SomeAnimal makes a sound.
        dog.speak();     // Buddy barks.
        cat.speak();     // Whiskers meows.
    }
}
