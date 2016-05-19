package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String sN = null;
        while (!(sN = r.readLine()).equals("end"))
        {
            list.add(sN);
        }
        for (String sS : list)
        {
            System.out.println(sS);
        }
    }
}