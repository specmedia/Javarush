package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        char[] txt = s.toCharArray(); // Создаём char массив и записываем в него полученную строку s
        int c=0;
        for (int i=0;i<txt.length;i++) // Цикл
        {            c=txt[i]==' '?0:c+1;
            if(c==1)txt[i]=String.valueOf(txt[i]).toUpperCase().charAt(0);
            }
            System.out.print(txt);
        }
    }
