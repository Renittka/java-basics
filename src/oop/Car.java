package oop;

public class Car {
    private String model;
    private String color;
    private int age;

    public Car() {
        model = "Toyota";
        color = "Серый";
    }

    public Car(String myModel) {
        model = myModel;
    }

    public Car(String myModel, String myColor) {
        this(myModel);
        color = myColor;
    }

    public Car(String myModel, String myColor, int myAge) {
        this(myModel, myColor);
        age = myAge;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public void run(int mySpeed, String model) {
        if (mySpeed >= 120) {
            System.out.println("Нужно снизить скорость!");
        } else {
            System.out.println("Машина едет со скоростью: " + mySpeed);
        }
    }
}
