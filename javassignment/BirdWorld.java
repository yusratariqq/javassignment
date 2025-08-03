interface Swimmer {
    void swim();
}

interface Flyer {
    void fly();
}

class Duck implements Swimmer, Flyer {
    public void swim() {
        System.out.println("Duck is swimming in the pond");
    }

    public void fly() {
        System.out.println("Duck is flying in the sky");
    }

    public void quack() {
        System.out.println("Duck says: Quack quack!");
    }
}

public class BirdWorld {
    public static void main(String[] args) {
        Duck donald = new Duck();
        donald.swim();
        donald.fly();
        donald.quack();
    }
}