package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();// создаю список
        for (int i = 0; i < 5; i++)// наполняю его
        {
            String s = reader.readLine();
            list.add(s);
        }
        int a = 0, b = 0;
        for (int i = 5; i > 0; i++)
        {
            b = list.get(i).length();
            if(a<b)
            {
                a = b;
            }
        }
        b = 0;
        for (int i = 0; i < 5; i++)
        {
            b = list.get(i).length();
            if(b==a)
            {
                System.out.println( list.get(i) );
            }
        }
    }
}