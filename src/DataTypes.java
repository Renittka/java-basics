public class DataTypes {

    public void print() {

        String name = "Maria";
        System.out.println(name);
        int firstNumber = 100;
        System.out.println("firstNumber = " + firstNumber);
        int secondNumber;
        secondNumber = 200;
        System.out.println(secondNumber);
        secondNumber = 400;
        System.out.println(secondNumber);

        int a = 5, b = 6, c = 50;
        int d = 5;
        int e = 6;
        int f = 50;
        System.out.println(a + b + c);

        double x, y, z;
        x = y = z = 5.05;
        System.out.println(x + y + z);

        String myName = "Maria";
        System.out.println("Hello " + myName);

        String firstName = "Maria ";
        String lastName = "Smith";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int myNum1 = 15, myNum2 = 6;
        System.out.println(myNum1 + myNum2);
        System.out.println("Сумма: " + (myNum1 + myNum2));
        final double PI;
        PI = 3.14;

        int a1 = 4;
        byte b1 = (byte)a1;
        System.out.println(b1);

        // расширяющее преобразование
        byte c1 = 7;
        int d1 = c1;
        System.out.println(d1);

        // сужающее преобразование
        double myNum = 3.89;
        int myInteger = (int)myNum;
        System.out.println(myInteger);
        int a2 = 258;
        byte b2 = (byte)a2;
        System.out.println(b2);

        double a3 = 56.9898;
        int b3 = (int)Math.round(a3);
        System.out.println(b3);

    }

}
