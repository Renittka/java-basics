package oop;

import animals.*;
import animals.Runnable;
import inners.Outer;
import users.Person;

import java.util.Scanner;

public class Main {

    enum WeekDays {
     MONDAY,
     TUESDAY
    }

    public static void main(String[] args) {

        SecondAnimal myPig = new Pig();

        myPig.makeSound();
        myPig.sleep();
        Fox myFox = new Fox();
        myFox.eat();
        myFox.run();

        Level myLevel = Level.LOW;
        System.out.println(myLevel);

        switch (myLevel) {
            case LOW -> {
                System.out.println("Низкий уровень");
            }
            case MEDIUM -> {
                System.out.println("Средний уровень");
            }
            case HIGH -> {
                System.out.println("Высокий уровень");
            }
        }

        for (Level myLvl : Level.values()) {
            System.out.println(myLvl);
        }

        /*
        Outer myOuter = new Outer();
        Outer.Inner myInner = myOuter.new Inner();
        System.out.println(myInner.b + myInner.getOuterA());

         */

        /*
        Animal myCat = new Cat();
        Animal myDog = new Dog("Рекс", "Собака", 5.5);
        Animal myAnimal = new Animal();

        myCat.setType("Млекопитающее");
        myCat.makeSound();
        myDog.makeSound();
        myAnimal.makeSound();

        // System.out.println(myCat);
        Person myPerson = new Person();

         */

//        System.out.println(myCat);
//        myCat.setName("Том");
//        System.out.println(myCat.getName());

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя кота: ");
        String name = scan.nextLine();
        System.out.println("Введите цвет: ");
        String color = scan.nextLine();
        System.out.println("Введите возраст: ");
        int age = scan.nextInt();
              Cat mySecondCat = new Cat(name, age, color);

        myCat.setName(name);
        myCat.setAge(age);
        myCat.setColor(color);
         */


        //System.out.println(myCat.getStateWhenEat());

        //myCat.makeSound();

        Car myCar2 = new Car();
        Car myCar1 = new Car("Lexus");
        Car myCar = new Car("Toyota", "Черный");
        Car myCar3 = new Car("Toyota", "Черный", 3);

//        myCar.color = "Белый";
//        myCar.model = "Toyota";

        // System.out.println(myCar.color);
        // System.out.println(myCar.model);

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
