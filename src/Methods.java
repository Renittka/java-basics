public class Methods {
    static void printHelloWorld() {
        System.out.println("Привет, мир!");
    }

    static void printHello(String name) {
        System.out.println("Привет, " + name);
    }

    static void printHelloWithInfo(String name, int age, String company, double salary) {
        System.out.println("Привет, " + name + ", возраст: " + age + ", компания: " + company + ",  зарплата: " + salary);
        printHelloWorld();
    }

    static String getHelloWorld() {
        return "Привет, мир";
    }

    static int getSumOfTwoNums(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static String getStrSumOfTwoNums(int a, int b) {
        int sum = getSumOfTwoNums(a, b);
        return a + "+" + b + "=" + sum;
    }

    static void checkAge(int age) {
        if (age < 21) {
            System.out.println("Доступ запрещен!");
        } else {
            System.out.println("Доступ разрешен!");
        }
    }

    static boolean getPermission(int age) {
        if (age < 21) {
            return false;
        } else {
            return true;
        }
    }

    static int getSumOfNumbers(int[] myNumArray) {
        int sum = 0;
        for (int i = 0; i < myNumArray.length; i++) {
            sum += myNumArray[i];
        }
        return sum;
    }

    static int getSum(int a, int b) {
        return a + b;
    }

    static double getSum(double a, double b) {
        return a + b;
    }

    static float getSum(float a, float b) {
        return a + b;
    }

    static int getSum(int x) {
        if (x > 0) {
            System.out.println("x=" + x);
            return x + getSum(x - 1); // 10 + sum(9 + sum(8+sum(7).. ... + 0)))))
        } else {
            System.out.println("x=" + x);
            return 0;
        }
    }

    /*
    public static void main(String[] args) {

        printHelloWorld();
        printHello("Анна");
        printHelloWithInfo("Азамат", 20, "Dar Tech", 300000);


        String stringHelloWorld = getHelloWorld();
        System.out.println(stringHelloWorld);
        System.out.println(stringHelloWorld + "!");

        System.out.println(getHelloWorld());


        int a = 2, b = 5;
        int sum1 = getSumOfTwoNums(a, b);

        String str = getStrSumOfTwoNums(a, b);
        printHello(str);

        int age = 30;
        checkAge(age);

        boolean resultPermission = getPermission(age);
        System.out.println(resultPermission);

        int sum = getSum(10);
        System.out.println("Сумма= " + sum);

        System.out.println(getSum(1, 2));
        System.out.println(getSum(2.5, 5.2));
        System.out.println(getSum(2.3f, 32f));
    }

     */

}
