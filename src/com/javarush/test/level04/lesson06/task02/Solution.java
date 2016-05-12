package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String x = reader.readLine();
        String y = reader.readLine();
        String z = reader.readLine();
        String w = reader.readLine();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);
        int d = Integer.parseInt(w);
        if (a > b && a > c && a > d)
            System.out.println(a);
        else if (b > a && b > c && b > d)
            System.out.println(b);
        else if (c > a && c > b && c > d)
            System.out.println(c);
        else if (d > a && d > b && d > c)
            System.out.println(d);//напишите тут ваш ко//напишите тут ваш код

    }
}
