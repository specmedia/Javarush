package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();// создаю список
        list.add(reader.readLine()); //1 строка
        int minimum = list.get(0).length();
        for (int i = 1; i < 5; i++) //остальные строки
        {
            list.add(reader.readLine());
            if (list.get(i).length() < minimum)
                minimum = list.get(i).length();
        }
        for (String s : list)
            if (s.length() == minimum)
                System.out.println(s);
    }
}

