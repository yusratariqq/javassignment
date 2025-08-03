class Creature {
    private String name;

    public Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Canine extends Creature {
    public Canine(String name) {
        super(name);
    }
}

class Feline extends Creature {
    public Feline(String name) {
        super(name);
    }
}

class Wolf extends Canine {
    public Wolf(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " howls: Awooo!");
    }
}

class Tiger extends Feline {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " roars: Grrr!");
    }
}

public class AnimalZoo {
    public static void main(String[] args) {
        Creature[] animals = {
                new Wolf("Ghost"),
                new Tiger("Rajah")
        };

        for (Creature animal : animals) {
            animal.eat();
            animal.makeSound();
        }
    }
}
