package oop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        //System.out.println(myCat.getStateWhenEat());

        //myCat.makeSound();

        Car myCar2 = new Car();
        Car myCar1 = new Car("Lexus");
        Car myCar = new Car("Toyota", "Черный");
        Car myCar3 = new Car("Toyota", "Черный", 3);

//        myCar.color = "Белый";
//        myCar.model = "Toyota";

        System.out.println(myCar.color);
        System.out.println(myCar.model);

        //myCar.run(120, "Toyota");


        /*
        Person myPerson = new Person();
        myPerson.name = "Мария";

        System.out.println(myPerson.name);

        Cat myCat = new Cat();
        Cat myCat2 = new Cat();

        System.out.println("Животное: " + myCat.name + ", возраст: " + myCat.age);
        System.out.println(myCat2.name);

        Rectangle myRectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        System.out.println("До изменения");
        System.out.println("x " + myRectangle.x);
        System.out.println("y " + myRectangle.y);

        myRectangle.x = 20;
        myRectangle.y = 40;

        System.out.println("После изменения");
        System.out.println("x " + myRectangle.x);
        System.out.println("y " + myRectangle.y);

        System.out.println("Второй прямоугольник");
        System.out.println("x " + rectangle2.x);
        System.out.println("y " + rectangle2.y);

         */

    }
}
