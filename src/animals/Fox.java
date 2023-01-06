package animals;

public class Fox extends SecondAnimal implements Runnable, Swimmable {
    @Override
    public void makeSound() {
        System.out.println("Лиса говорит: фыр-фыр");
    }

    @Override
    public void eat() {

        System.out.println("Eating ... ");
    }

    @Override
    public void run() {
        System.out.println("Running ... ");
    }

    @Override
    public void swim() {
        System.out.println("Swimming ... ");
    }
}
