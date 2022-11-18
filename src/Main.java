public class Main {

    public static void main(String[] args) {
        /*
        int x = 1;
        int y = 5;
        if (x > y) {
            System.out.println(x + " больше, чем " + y);
        } else {
            System.out.println(x + " меньше, чем " + y);
        }
        System.out.println("Это не входит в if");

        int time = 19;
        if (time < 12) {
            System.out.println("Доброе утро!");
        } else if (time < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }

        int myTime = 20;
        if (myTime < 18) {
            System.out.println("Добрый день");
        } else {
            System.out.println("Добрый вечер");
        }
        */
//        int myTime = 12;
//        String result = (myTime < 18) ? "Добрый день" : "Добрый вечер";
//        System.out.println(result);


        /*
        int day = 20;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("Не найдено");
        }
         */
        /*
        String color = "Blue";
        switch (color) {
            case "Blue":
                System.out.println("Голубой");
                break;
            case "Black":
                System.out.println("Черный");
                break;
            case "White":
                System.out.println("Белый");
                break;
            case "Pink":
                System.out.println("Розовый");
                break;
            case "Red":
                System.out.println("Красный");
                break;
            default:
                System.out.println("Не найдено");
        }

        int i = 2;
        if (i > 0 && i < 5) {
            System.out.println(i);
        }

        if (color.equals("Blue") || color.equals("Black")) {
            System.out.println("Голубой или Черный");
        } else if (color.equals("Black")) {
            System.out.println("Черный");
        } else if (color.equals("White")) {
            System.out.println("Белый");
        } else if (color.equals("Pink")) {
            System.out.println("Розовый");
        } else if (color.equals("Red")) {
            System.out.println("Красный");
        } else {
            System.out.println("Не найдено");
        }

         */

        /*
        int i = 0;
//        while (i < 6) {
//            System.out.println(i);
//            i++;
//        }

        do {
            System.out.println(i);
            i++;
        } while (i < 6);

         */
//
//        for (int i = 0; i < 6; i++) {
//            System.out.println(i);
//        }
//
//        int sum = 0;
//
//        for (int i = 10; i <= 20; i += 2) {
//            if (i == 18) {
//                continue;
//            }
//            sum += i; // sum = sum + i;
//            System.out.println("Элемент: " + i);
//            System.out.println("Текущая сумма: " + sum);
//        }
//        System.out.println("Итоговая сумма: " + sum);


        int i = 0;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
