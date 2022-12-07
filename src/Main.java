import javax.swing.text.ParagraphView;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//  Задача 5
//  Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль.
//  Постарайтесь заполнить обе диагонали в одном цикле.
        System.out.println("Задача 5");
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i == 0 && j == 2 || i == 2 && j == 0) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

//  Задача 6
//  Нам дан массив чисел: {5, 4, 3, 2, 1}. Необходимо привести его к виду: {1, 2, 3, 4, 5}
//  Решите задачу с использованием дополнительного массива.
//  Напечатайте массив до преобразования и после с помощью System.out.println(Arrays.toString(arr));
        System.out.println("Задача 6");
        int [] nums = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(nums));
        int [] invertedNums = new int [nums.length];
        for (int i = 0; i < invertedNums.length; i++) {
            invertedNums[i] = nums[(nums.length - 1) - i];
        }
        System.out.println(Arrays.toString(invertedNums));
        System.out.println();

//  Задача 7
//  Решите предыдущее задание, но без использования дополнительного массива.
//  Необходимо добиться того, чтобы исходный массив полностью соответствовал второму массиву из прошлого задания.
//  Выведите результат программы в консоль тем же способом.
        System.out.println("Задача 7");
        int [] array = {5, 8, 2, 3, 9};
        System.out.println(Arrays.toString(array));
        int num1 = array[0];
        int num2 = array[1];
        int num3 = array[2];
        int num4 = array[3];
        int num5 = array[4];
        array[0] = num5;
        array[1] = num4;
        array[2] = num3;
        array[3] = num2;
        array[4] = num1;
        System.out.println(Arrays.toString(array));

    }
}