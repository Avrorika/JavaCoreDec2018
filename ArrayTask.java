package t04;
/**
Задание 4. Одномерные массивы
 */

public class ArrayTask {

    public static void main(String[] args) {
        int[] array = {3, 56, 73, 4, 98, 10, 2, 7, 42, 1, 7, 12, 1};
        int newArray = getSummOf2Numbers(array);
        System.out.println(newArray);
    }

    public static int getSummOf2Numbers(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < (arr.length + 1) / 2; i++) {
            max = arr[i] + arr[arr.length - 1 - i] > max && i != arr.length - 1 - i ? arr[i] + arr[arr.length - 1 - i] : max;
            max = arr[i] + arr[arr.length - 1 - i] > max && i == arr.length - 1 - i ? arr[i] : max;
        }
        return max;
    }
}



