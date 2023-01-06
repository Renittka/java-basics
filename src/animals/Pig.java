package animals;

public class Pig extends SecondAnimal {
    @Override
    public void makeSound() {
        System.out.println("Хрюша говорит уи-уи");
    }

    @Override
    public void eat() {
        System.out.println("Eating ... ");
    }

//    @Override
//    public void sleep() {
//        System.out.println("Sleeping...");
//    }
}
