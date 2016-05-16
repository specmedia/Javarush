package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int maximum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++)
        {
            int a = Integer.parseInt(reader.readLine());
            if (maximum == 0) maximum = a;
            maximum = max(a, maximum);
        }
        System.out.println(maximum);
    }

    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }
}