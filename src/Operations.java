public class Operations {

    public void print() {

        // арифметические операции
        int sum1 = 100 + 50;
        System.out.println(sum1);
        int sum2 = sum1 + 250;
        System.out.println(sum2);
        int sum3 = sum1 + sum2;
        System.out.println(sum3);

        int a = 20;
        int b = 2;

        int c = a + b;
        int d = 4 + b;
        System.out.println(a + "+" + b + "=" + c);
        System.out.println(4 + "+" + b + "=" + d);

        c = a - b;
        d = 4 - a;
        System.out.println(a + "-" + b + "=" + c);
        System.out.println(4 + "-" + a + "=" + d);

        c = a * b;
        d = b * 5;
        System.out.println(a + "*" + b + "=" + c);
        System.out.println(b + "*" + 5 + "=" + d);

        c = a / b;
        double e = 22.5 / 4.5;
        double f = 20 * 5 * 7 / 4.5;
        System.out.println(a + "/" + b + "=" + c);
        System.out.println("22.5/4.5=" + e);
        System.out.println("20*5*7/4.5=" + f);

        int myNum = (int) (20 / 4.5);
        System.out.println(myNum);

        int h = 20;
        // операции инкремента и декремента
        // постфиксная форма
        h++;
        System.out.println("h++: " + h);
        System.out.println("h++: " + h++);
        h--; // 22 - 1
        System.out.println("h--: " + h); // 21
        System.out.println("h--: " + h--);
        System.out.println("Конечный результат h: " + h);

        h = 20;
        // префиксная форма
        ++h; // h = h + 1 = 20 + 1
        System.out.println("++h: " + h);
        System.out.println("++h: " + ++h);
        --h; // 22 - 1
        System.out.println("--h: " + h); // 21
        System.out.println("--h: " + --h);
        System.out.println("Конечный результат h: " + h);

        // деление по модулю, получение остатка от деления
        int remainder = -10 % 3;
        System.out.println(remainder);

        // операции присваивания
        double x = 2.5;
        System.out.println(x);

        int j = 10;
        // сокращенные операции присваивания
        j += 5; // j = j + 5 = 10 + 5
        System.out.println(j);
        System.out.println("j-=3: " + (j -= 3));
        System.out.println("j*=2: " + (j *= 2));
        System.out.println("j/=6: " + (j /= 6));

        // побитовые операции
        System.out.println("j<<=4: " + (j <<= 4));
        System.out.println("j>>=3: " + (j >>= 3));
        // 00000000
        // 2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0
        // 128 64 32 16 8 4 2 1
        // 4
        // 00000100
        //  значение >> количество
        // 00010000

        int m = 10;
        int n = 4;
        // операции сравнения
        System.out.println(m + "==" + n + ": " + (m == n));
        System.out.println(m + "!=" + n + ": " + (m != n));
        System.out.println("m<n: " + (m < n));
        System.out.println("m>n: " + (m > n));
        System.out.println("m<=10: " + (m <= 10));
        System.out.println("n>=4: " + (n >= 4));

        // логические операции
        boolean a1 = (5 > 6) || (4 > 6);
        boolean a2 = (5 < 6) && (4 < 6);
        boolean a3 = (5 < 6) ^ (4 < 6);
        boolean a4 = !(5 == 5);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

    }

}
