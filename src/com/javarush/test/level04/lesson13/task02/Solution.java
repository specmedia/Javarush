package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader (new InputStreamReader (System.in));
        String s = "8";
        int m = Integer.parseInt(r.readLine());
        int n = Integer.parseInt(r.readLine());
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j < n; j++)
            {
                System.out.print(s);
            }
            System.out.println(s);
        }
    }
}
