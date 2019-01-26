package t03;

import java.util.Scanner;

/**
 * Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
 * Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции
 */

public class FunctionCount {
    public static void main(String args[]) {
//        int a = 0;
        int c = 0;

        System.out.println("Enter a");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter b");
        int b = scan.nextInt();
        System.out.println("Enter h");
        int h = scan.nextInt();
        double f;
        while (h > 0 && h < (b - a)) {
            a = a + c * h;
            c++;
            f = Math.tan(2 * a) - 3;

            System.out.println("| x |" + a + " | " + "f(x)| " + f + " |");
        }
    }
}


