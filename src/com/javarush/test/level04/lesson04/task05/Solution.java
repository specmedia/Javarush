package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snumber = reader.readLine();
        int num = Integer.parseInt(snumber);
        int a,b;
        if (num>0)
        {
            a=num*2;
            System.out.println(a);//напишите тут ваш код
        }
        else
        {
            b=num+1;
            System.out.println(b);
        }
    }

}