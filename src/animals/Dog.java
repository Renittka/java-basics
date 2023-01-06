package animals;

public class Dog extends Animal {
    private double weight;

    public Dog() {

    }

    public Dog(String name, String type, double weight) {
        super(type, name);
        this.weight = weight;
    }

    public Dog(double weight) {
        this.weight = weight;
    }

    public void makeSound() {
        System.out.println("Гав");
    }
}
