package t02;

/**
 * Найти наименьший номер элемента последовательности, для которого выполняется условие M.
 * Вывести на экран этот номер и все элементы ai  где i = 1, 2, ..., п.
 */

import java.util.Scanner;


public class SmallestElement {
    public static void main(String args[]) {
        int i = 1;
        double a = 1 / Math.pow((i + 1), 2);
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        double e = scan.nextDouble();

        while (a >= e) {
            a = 1 / Math.pow((i + 1), 2);
            i++;
            System.out.println(a);

        }
        System.out.println(i - 1);
    }
}








