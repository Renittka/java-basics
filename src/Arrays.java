public class Arrays {
    public void print() {
        // одномерные массивы
        int[] myArray = new int[4];
        myArray[0] = 10;
        myArray[1] = 20;

        int num = 10;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = num;
            num += 10;
        }

        for (int number : myArray) {
            System.out.println(number);
        }

        String[] fruits = {"Apple", "Banana", "Orange", "Avocado"};
        int[] myNums = {10, 20, 30, 40};
        System.out.println(fruits[3]);
        fruits[3] = "Lime";
        System.out.println(fruits[3]);
        System.out.println(fruits.length);

        for (int number : myNums) {
            System.out.println(number);
        }

        int sum = 0;
        for (int myNum : myNums) {
            System.out.println("Элемент: " + myNum);
            sum += myNum;
            System.out.println("Сумма: " + sum);
        }
        System.out.println("Сумма элементов массива: " + sum);

        // многомерные массивы
        int[][] myNumArray = new int[2][2];
        myNumArray[0][0] = 10;
        myNumArray[0][1] = 20;
        myNumArray[1][0] = 30;
        myNumArray[1][1] = 40;

        int[][] myIntegers = {{10, 21, 20}, {33, 40, 30}, {10, -6, 9}};

        for (int i = 0; i < myIntegers.length; i++) {
            for (int j = 0; j < myIntegers[i].length; j++) {
                System.out.printf("%s[%d][%d]: %d\n", "myIntegers", i, j, myIntegers[i][j]);
//                String res = String.format("%s[%d][%d]: %d\n", "myIntegers", i, j, myIntegers[i][j]);
//                System.out.print(res);
            }
        }

//

        /*
                 столбец0 столбец1  столбец2
        строка0     10      20
        строка1     30      40
         */

        for (int i = 0; i < myIntegers.length; i++) {
            for (int j = 0; j < myIntegers[i].length; j++) {
                System.out.println("myInteger[" + i + "][" + j + "]: " + myIntegers[i][j]);
            }
        }

        for (int i = 0; i < myIntegers.length; i++) {
            for (int j = 0; j < myIntegers[i].length; j++) {
                if (myIntegers[i][j] % 2 != 0) {
                    System.out.print(myIntegers[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < myIntegers.length; i++) {
            for (int j = 0; j < myIntegers[i].length; j++) {
                if (i == j) {
                    System.out.print(myIntegers[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
