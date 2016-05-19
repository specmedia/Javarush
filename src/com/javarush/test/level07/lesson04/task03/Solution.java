package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in)); //ввод с клавиатуры
        String[] list = new String[10]; // создали массив на 10 строк
        int a[] = new int[10]; // создали массив на 10 чисел
        for (int i = 0; i < 10; i++) //цикл для массивов
        {
            list[i] = r.readLine(); //запись строк в массив строк
            a[i] = list[i].length();//запись длинны строк в массив для чисел
            System.out.println (a[i]); //вывод содержимое массива чисел
        }
    }
}
