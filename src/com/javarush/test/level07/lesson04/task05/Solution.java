package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayBig = new int[20];
        for (int i = 0; i < arrayBig.length; i++)
        {
            int number = Integer.parseInt(reader.readLine());
            arrayBig[i] = number;
        }
            int[] array1 = new int[10];
            int[] array2 = new int[10];
            System.arraycopy(arrayBig, 0, array1, 0, array1.length);
            System.arraycopy(arrayBig, array1.length, array2, 0, array2.length);
        for (int i=0; i<array2.length; i++)
            System.out.println(array2[i]);
    }
}
