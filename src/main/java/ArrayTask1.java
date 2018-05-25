/*
Java программа.
Задача:
Есть неотсортированный массив целых чисел длинной N.
Он может содержать числа от 1 до N-1 и эти числа могут дублироваться любое число раз.
Нужно найти все числа которые не вошли в такой массив и вывести их на экран.

Например, массив длинной 10, может содержать числа от 1 до 9:
{1,1,8,3,4,3,3,5,6,8}
в этом случае ответ будет таким: 2,7,9.
 */

import java.util.Arrays;

public class ArrayTask1 {
    public static void main(String[] args) {
        int[] arrayInit = {1,1,8,3,4,3,3,5,1,8};
        int N = arrayInit.length;
        Arrays.sort(arrayInit);
        for (int i=0;i<N-1;i++){
            if (arrayInit[i+1]-arrayInit[i] > 1) findNumber(arrayInit[i],arrayInit[i+1]);
        }
        findNumber(arrayInit[N-1], N);


    }

    /**
     * Выводит на экран все числа между num1 и num2
     * @param num1
     * @param num2
     */
    private static void findNumber(int num1, int num2) {
        num1++;
        while (num1<num2){
            System.out.println(num1);
            num1++;
        }
    }
}
