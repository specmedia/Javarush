package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);
        if (a >= b && b >= c && a >= c)
            System.out.println (a + " " + b + " " + c);
        else if (a >= b && b <= c && a >= c)
            System.out.println (a + " " + c + " " + b);
        else if (b >= a && a >= c && b >= c)
            System.out.println (b + " " + a + " " + c);
        else if (b >= a && a <= c && b >= c)
            System.out.println (b + " " + c + " " + a);
        else if (c >= a && a >= b && c >= b)
            System.out.println (c + " " + a + " " + b);
        else if (c >= a && a <= b && c >= b)
            System.out.println (c + " " + b + " " + a);
        //напишите тут ваш код

    }
}
