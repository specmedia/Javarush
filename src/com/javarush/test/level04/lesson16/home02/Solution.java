package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(r.readLine());
    int b = Integer.parseInt(r.readLine());
    int c = Integer.parseInt(r.readLine());
        if (a > b & b > c)
        {
            System.out.println(b);//напишите тут ваш код
        }
        else if (b > a & a > c)
        {
            System.out.println(a);//напишите тут ваш код
        }
        else if (a > c & c > b)
        {
            System.out.println(c);//напишите тут ваш код
        }
    }
}
