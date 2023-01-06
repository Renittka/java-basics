package animals;

public class Animal {
    private String type;
    private String name;


    public Animal() {
        this.type = "Млекопитающее";
        this.name = "Животное";
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String type, String name) {
        this(name);
        this.type = type;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        if (name.equals("Том")) return;
        this.name = name;
    }
}
