class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void makeSound() {
        System.out.println(name + " makes a generic sound.");
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof woof!");
    }

    public void fetch() {
        System.out.println(getName() + " fetches the ball.");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meows: Meow!");
    }

    public void scratch() {
        System.out.println(getName() + " scratches the furniture.");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        myDog.eat();
        myCat.eat();

        myDog.makeSound();
        myCat.makeSound();

        if (myDog instanceof Dog) {
            ((Dog) myDog).fetch();
        }

        if (myCat instanceof Cat) {
            ((Cat) myCat).scratch();
        }
    }
}
