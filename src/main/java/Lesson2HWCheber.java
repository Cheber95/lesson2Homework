import java.util.Arrays;

public class Lesson2HWCheber {

    public static boolean checkBalance(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int s1 = 0;
            int s2 = 0;
            for (int j = 0; j < i; j++) {
                s1 = s1 + array[j];
            }
            for (int j = i; j < array.length; j++) {
                s2 = s2 + array[j];
            }
            if (s1 == s2)
                return true;
        }
        return false;
    }

    public static int[] shiftArray(int[] array, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmpVar = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--)
                    array[j] = array[j - 1];
                array[0] = tmpVar;
            }
        } else {
            for (int i = 0; i > n; i--) {
                int tmpVar = array[0];
                for (int j = 0; j < array.length - 1; j++)
                    array[j] = array[j + 1];
                array[array.length - 1] = tmpVar;
            }
        }
        return array;
    }

    public static void main(String[] args) {

        int[] arrayInt1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив задания 1:");
        System.out.println(Arrays.toString(arrayInt1));
        int i;
        int j;
        for (i = 0; i < arrayInt1.length; i++) {
            if (arrayInt1[i] == 1)
                arrayInt1[i] = 0;
            else
                arrayInt1[i] = 1;
        }
        System.out.println("Результат выполнения задания 1:");
        System.out.println(Arrays.toString(arrayInt1));

        int[] arrayInt2 = new int[8];
        for (i = 0; i < arrayInt2.length; i++) {
            arrayInt2[i] = i*3;
        }
        System.out.println("Результат выполнения задания 2:");
        System.out.println(Arrays.toString(arrayInt2));

        int[] arrayInt3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Исходный массив задания 3:");
        System.out.println(Arrays.toString(arrayInt3));
        for (i = 0; i < arrayInt3.length; i++) {
            if (arrayInt3[i] < 6) {
                arrayInt3[i] = arrayInt3[i] * 2;
            }
        }
        System.out.println("Результат выполнения задания 3:");
        System.out.println(Arrays.toString(arrayInt3));

        int sqSize = 8;
        int[][] arraySqInt4 = new int[sqSize][sqSize];
        for (i = 0; i < sqSize; i++) {
            for (j = 0; j < sqSize; j++) {
                arraySqInt4[i][j] = 0;
            }
        }
        for (i = 0; i < sqSize; i++) {
            arraySqInt4[i][i] = 1;
            arraySqInt4[i][sqSize - 1 - i] = 1;
        }
        System.out.println("Результат выполнения задания 4:");
        for (i = 0; i < sqSize; i++) {
            System.out.println(Arrays.toString(arraySqInt4[i]));
        }

        int[] arrayInt5 = { 10, 5, 3, 2, 111, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Исходный массив задания 5:");
        System.out.println(Arrays.toString(arrayInt5));
        int minEl = arrayInt5[0];
        int maxEl = arrayInt5[0];
        for (i = 1; i < arrayInt5.length; i++) {
            if (arrayInt5[i] < minEl)
                minEl = arrayInt5[i];
            if (arrayInt5[i] > maxEl)
                maxEl = arrayInt5[i];
        }
        System.out.println("Минимальный элемент: " + minEl);
        System.out.println("Максимальный элемент: " + maxEl);
        int[] arrayInt6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println("Исходный массив задания 6:");
        System.out.println(Arrays.toString(arrayInt6));
        boolean request = checkBalance(arrayInt6);
        if (request)
            System.out.println("Есть баланс");
        else
            System.out.println("Нет баланса");

        int[] arrayInt7 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Исходный массив задания 7:");
        System.out.println(Arrays.toString(arrayInt7));
        int n = 2;
        System.out.println("Массив сдвинул на " + n + " позиции:");
        System.out.println(Arrays.toString(shiftArray(arrayInt7, n)));
        n = -5;
        System.out.println("Массив сдвинул на " + n + " позиции:");
        System.out.println(Arrays.toString(shiftArray(arrayInt7, n)));
    }
}
