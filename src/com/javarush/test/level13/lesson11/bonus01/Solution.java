package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fReader = new BufferedReader(new FileReader(fileName));
        ArrayList<Integer> list = new ArrayList<Integer>();
        String line = fReader.readLine();
        while (line != null)
        {
            list.add(Integer.parseInt(line));
            line = fReader.readLine();
        }
        fReader.close();
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for (int a : list)
        {
            if (a % 2 == 0)
                evenList.add(a);
        }

        Integer[] array = evenList.toArray(new Integer[evenList.size()]);
        for (int i=0; i<array.length; i++) {
            for (int j=array.length-1; j>i; j--) {
                if (array[j]<array[j-1]) {
                    int temp = array[j];
                    array[j]=array[j-1];
                    array[j-1] = temp;
                }
            }
        }
        for (Integer a : array)
            System.out.println(a);
    }
}
