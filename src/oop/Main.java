package oop;

import animals.*;
import inners.Outer;
import users.Person;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    enum WeekDays {
        MONDAY,
        TUESDAY
    }

    public static void main(String[] args) {


        HashMap<String, String> cities = new HashMap<>();
        cities.put("Казахстан", "Астана");
        cities.put("США", "Вашингтон");
        cities.put("Франция", "Париж");

        for (String key : cities.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println();

        for (String value : cities.values()) {
            System.out.print(value + " ");
        }
        System.out.println();
        for (String key : cities.keySet()) {
            System.out.printf("%s - %s %n", key, cities.get(key));
        }
        System.out.println();
        for (Map.Entry<String, String> entry : cities.entrySet()) {
            System.out.printf("%s - %s %n", entry.getKey(), entry.getValue());
        }

        HashMap<String, Double> students = new HashMap<>();
        students.put("Айдана", 2.3);


        ArrayList<String> fruits = new ArrayList<>();

        String[] arrayFruits = new String[12];

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Avocado");

        Collections.sort(fruits);
        System.out.println(fruits);
        System.out.println(fruits.remove(0));
        System.out.println(fruits.get(0));
        fruits.clear();
        System.out.println(fruits);

        ArrayList<Double> integers = new ArrayList<>();

        integers.add(12.4);
        integers.add(-5.1);
        integers.add(52.7);
        integers.add(2.1);

        integers.set(0, 57.4);
        System.out.println(!integers.isEmpty());
        Collections.sort(integers);
        Collections.reverse(integers);
        System.out.println(integers.get(integers.size() - 1).intValue());
        System.out.println(integers);


        LinkedList<String> linkedFruits = new LinkedList<>();

        linkedFruits.add("Apple");
        linkedFruits.add("Banana");
        linkedFruits.add("Orange");
        linkedFruits.addFirst("Avocado");

        System.out.println(linkedFruits.getLast());

        System.out.println(linkedFruits);
        Collections.sort(linkedFruits);
        System.out.println(linkedFruits);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        String formattedCurrentDate = currentDateTime.format(formatter);
        System.out.println(formattedCurrentDate);


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


        Outer myOuter = new Outer();
        Outer.Inner myInner = myOuter.new Inner();
        System.out.println(myInner.b + myInner.getOuterA());


        Animal myCat = new Cat();
        Animal myDog = new Dog("Рекс", "Собака", 5.5);
        Animal myAnimal = new Animal();

        myCat.setType("Млекопитающее");
        myCat.makeSound();
        myDog.makeSound();
        myAnimal.makeSound();

        // System.out.println(myCat);
        Person myPerson = new Person();


        System.out.println(myCat);
        myCat.setName("Том");
        System.out.println(myCat.getName());


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя кота: ");
        String name = scan.nextLine();
        System.out.println("Введите цвет: ");
        String color = scan.nextLine();
        System.out.println("Введите возраст: ");
        int age = scan.nextInt();
        Cat mySecondCat = new Cat(name, age, color);

        myCat.setName(name);
        // myCat.setAge(age);
        // myCat.setColor(color);


        //System.out.println(myCat.getStateWhenEat());

        //myCat.makeSound();

        Car myCar2 = new Car();
        Car myCar1 = new Car("Lexus");
        Car myCar = new Car("Toyota", "Черный");
        Car myCar3 = new Car("Toyota", "Черный", 3);

//        myCar.color = "Белый";
//        myCar.model = "Toyota";

//        System.out.println(myCar.color);
//        System.out.println(myCar.model);

        myCar.run(120, "Toyota");


        Person myPerson1 = new Person();
        //myPerson1.name = "Мария";

        //System.out.println(myPerson1.name);

        Cat myCat1 = new Cat();
        Cat myCat2 = new Cat();

        // System.out.println("Животное: " + myCat1.name + ", возраст: " + myCat1.age);
        // System.out.println(myCat2.name);

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
    }

}
