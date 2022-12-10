package oop;

public class Car {
    String model;
    String color;
    int age;

    public Car() {
        model = "Toyota";
        color = "Серый";
    }

    public Car(String myModel) {
        model = myModel;
    }

    public Car(String myModel, String myColor) {
        model = myModel;
        color = myColor;
    }

    public Car(String myModel, String myColor, int myAge) {
        model = myModel;
        color = myColor;
        age = myAge;
    }

    public void run(int mySpeed, String model) {
        if (mySpeed >= 120) {
            System.out.println("Нужно снизить скорость!");
        } else {
            System.out.println("Машина едет со скоростью: " + mySpeed);
        }
    }
}
