package oop;


public class Main {

    static boolean checkAge(int age) {
        if (age < 18) {
            throw new RuntimeException("Доступ запрещен. Вам нет 18 лет!");
        } else {
            System.out.println("Доступ разрешен!");
            return true;
        }
    }

    public static void main(String[] args) {

        //System.out.println(checkAge(15));

        try {
            int[] myIntegers = {1, 2, 3, 4};
            int myNumber = myIntegers[10];
            int result = myNumber / 0;

            System.out.println(myNumber);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Возникла ArrayIndexOutOfBoundsException в методе main(): " + e);
        } catch (Exception e) {
            System.out.println("Возникла ArithmeticException в методе main(): " + e);
            //e.printStackTrace();
        } finally {
            System.out.println("Процесс try-catch завершен");
        }



        /*
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();

        boolean exit = false;

        while (!exit) {

            System.out.println("""
                    Введите 1, чтобы добавить номер телефона
                    Введите 2, чтобы просмотреть информацию телефонной книги
                    Введите 3, чтобы обновить телефонную информацию
                    Введите 4, чтобы выполнить поиск по контакту
                    Введите 5, чтобы выйти из программы
                    """);

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    // добавить телефон
                    System.out.println("Введите имя");
                    String name = scanner.next();
                    System.out.println("Введите номер телефона");
                    String phoneNumber = scanner.next();
                    phoneBook.addPhone(name, phoneNumber);
                }
                case 2 -> {
                    // вывести информацию о контактах
                    phoneBook.printPhones();
                }
                case 3 -> {
                    // обновить информацию о контакте
                    System.out.println("Введите имя контакта");
                    String name = scanner.next();
                    System.out.println("Введите новый номер телефона");
                    String newPhoneNumber = scanner.next();

                }
                case 4 -> {
                    // выполнить поиск по контакту
                }
                case 5 -> {
                    System.out.println("Программа завершена");
                    exit = true;
                }
                default -> {
                    System.out.println("Выберите действие из списка");
                }
            }
                 }
         */


    }

}
