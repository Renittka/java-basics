public class Exercises {
    public static boolean isSquare(int x, int y) {
        if (x == y) {
            return true;
        } else {
            return false;
        }
        // return x == y;
    }

    public static double getFinalPrice(double price) {
        if (price > 5000) {
            return price - price * 0.1;
        }
        return price;
    }

    public static char getGrade(int score) {
        /*
        if (score >= 80 && score <= 100 ) return 'A';
        else if (score >= 60 && score < 80) return 'B';
        else if (score >= 50 && score < 60 ) return 'C';

         */
        if (score < 0 || score > 100) {
            System.out.println("Некорректное значение");
            return 'N';
        }
        if (score < 25) {
            return 'F';
        } else if (score <= 45) {
            return 'E';
        } else if (score <= 50) {
            return 'D';
        } else if (score <= 60) {
            return 'C';
        } else if (score <= 80) {
            return 'B';
        }
        return 'A';
    }

    public static int getReversedNumber(int originalNumber) {
        // 12345
        // 54321

        int reversedNumber = 0;

        while (originalNumber != 0) {

            int i = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + i;
            originalNumber /= 10;

            System.out.println("i: " + i);
            System.out.println("Rev: " + reversedNumber);
            System.out.println("Original: " + originalNumber);
        }

        return reversedNumber;
    }

    public static boolean isPrime(int number) {
        // 11
        // 2 3 4 5 6 7 8 9
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printIsPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (!isPrime) {
            System.out.println("Not prime");
        } else {
            System.out.println("Prime");
        }
    }

    public static void printFinalSalary(double salary, char grade) {
        // 100 000
        // A

        switch (grade) {
            case 'A' -> {
                salary = salary * 1.5;
            }
            case 'B' -> {
                salary = salary * 1.25;
            }
        }
        System.out.println(salary);

    }

    public static double getAverage(int[] array) {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        /*
        for (int j : array) {
            sum += j;
        }
         */
        average = sum / array.length;
        return average;
    }

    public static void printFoundNumber(int[] array, int x) {

        boolean isFound = false;

        for (int j : array) {
            if (x == j) {
                isFound = true;
                System.out.println(x);
            }
        }

        System.out.println("Found: " + isFound);
    }

    public static void printIndexOfFoundNumber(int[] array, int x) {

        boolean isFound = false;

        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                isFound = true;
                System.out.println(i);
            }
        }

        System.out.println("Found: " + isFound);
    }


    public static void printSubArray(int[] originalArray, int n, int m) {
        int[] resultArray = new int[m - n + 1];
        // 1 2 3 4 5 6 7 8
        // n = 2
        // m = 5
        // 3 4 5 6

        int count = 0;
        for (int i = n; i <= m; i++) {
            resultArray[count] = originalArray[i];
            count++;
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
        }
    }
//
//    public static void main(String[] args) {
//        int x = 10;
//        int y = 10;
//
//        boolean isSquare = isSquare(x, y);
//        // System.out.println(isSquare);
//
//        double price = 6000;
//        // System.out.println(getFinalPrice(price));
//
//        int score = 25;
//        // System.out.println(getGrade(score));
//
//        int originalNumber = 12345;
//
//        // System.out.println("Result: " + getReversedNumber(originalNumber));
//
//        int number = 10;
//        // System.out.println(isPrime(number));
//
//        // printIsPrime(number);
//
//        // printFinalSalary(100000, 'A');
//
//        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
////        int[] myArray1 = new int[2];
////        myArray1[0] = 1;
////        myArray1[1] = 2;
//
//        //  System.out.println(getAverage(myArray));
//        // printIndexOfFoundNumber(myArray, 2);
//
//
//        printSubArray(myArray, 2, 5);
//
//
//    }
}
