package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution

{

    public static void main(String[] args) throws Exception

    {

        NaOborot();
    }
    public static int[] ChislovoiMassiv() throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int massiv[] = new int[10];
        for (int j = 0; j < 10; j++)
        {
            int i = Integer.parseInt(reader.readLine());
            massiv[j] = i;
        }
        return massiv;
    }
    static void NaOborot() throws IOException
    {
        int Massiv[] = ChislovoiMassiv();
        for (int x = 10 - 1; x >= 0; x--)
        {
            int NaEkran = Massiv[x];
            System.out.println(NaEkran);
        }
    }

}
