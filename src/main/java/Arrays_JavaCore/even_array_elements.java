package Arrays_JavaCore;

import java.util.Arrays;
import java.util.Random;

public class even_array_elements {

/* Метод вывода
Примеры вывода:
[2, 7, 9, 7, 2, 2, 3, 5, 0, 0]
Четных чисел в массиве: 5
Разница между самым большим и маленьким элементом: 9
true
* */
    public static void main(String[] args) {
        int[] arrayNumber = createArray();
        System.out.println(Arrays.toString(arrayNumber));
        System.out.printf("Четных чисел в массиве: %d\n", countEvens(arrayNumber));
        System.out.printf("Разница между самым большим и маленьким элементом: %d\n", numberDifference(arrayNumber));
        System.out.println(hasZeroNeighbor(arrayNumber));

    }
/* Метод генерации и наполнения нашего массива рандомными числами
* */
    public static int[] createArray() {
        Random random = new Random();
        int[] arrayNumber = new int[10];
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = random.nextInt(0, 10);
        }
        return arrayNumber;
    }
/*Метод подсчета четный чисел в нашем масиве
* */
    public static int countEvens(int[] arrayNumber) {
        int count = 0;
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] % 2 == 0)
                count++;
        }
        return count;
    }
/* Метод для нахождения разницы между min и max элементами массива
* */
    public static int numberDifference(int[] arrayNumber) {
        int max = Arrays.stream(arrayNumber).max().getAsInt();
        int min = Arrays.stream(arrayNumber).min().getAsInt();
        return max - min;
    }
/* Метод возвращающий истину, если в переданном массиве есть два соседних элемента, с нулевым значением
* */
    public static boolean hasZeroNeighbor(int[] arrayNumber) {

        if (arrayNumber == null || arrayNumber.length < 2) {
            return false;
        }


        for (int i = 1; i < arrayNumber.length; i++) {
            if (arrayNumber[i] == 0 && arrayNumber[i - 1] == 0) {
                return true;
            }
        }

        return false;
    }
}