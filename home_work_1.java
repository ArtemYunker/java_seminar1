
// +Написать программу вычисления n-ого треугольного числа

import java.util.Scanner;

public class home_work_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите значение n: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int result = (n * (n + 1)) / 2;
        System.out.printf("Значение n-ого треугольного числа = %d \n", result);

        int k = 0;
        for (int i = 1; i <= n; i++) {
            k = k + 1;
            for (int j = 1; j <= 1; j++) {
                var s = "*".repeat(k);
                System.out.println(s);
            }
        }

    }
}
