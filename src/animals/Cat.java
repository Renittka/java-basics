package animals;

public class Cat extends Animal implements Runnable {
    private int age;
    private String color;

    public Cat() {
        super("Котик");
        age = 0;
        color = "Черный";
    }

    public Cat(String name, int age, String myColor) {
        super(name);
        this.age = age;
        color = myColor;
    }

    public void makeSound() {
        System.out.println("Мяу");
    }

    public String getStateWhenEat() {
        return "Котик кушает";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        // return name + ", цвет " + color + ", возраст " +  age;
        return String.format("%s, цвет: %s, возраст: %d, тип: %s ", super.getName(), color, age, super.getType());
    }

    @Override
    public void run() {

    }
}
