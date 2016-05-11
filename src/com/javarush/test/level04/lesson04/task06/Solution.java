package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String snumber = reader.readLine();
        int num = Integer.parseInt(snumber);
        if (num==1)
        {
            System.out.println("понедельник");//напишите тут ваш код
        }
        else if (num==2)
        {
            System.out.println("вторник");//напишите тут ваш код
        }
        else if (num==3)
        {
            System.out.println("среда");//напишите тут ваш код
        }
        else if (num==4)
        {
            System.out.println("четверг");//напишите тут ваш код
        }
        else if (num==5)
        {
            System.out.println("пятница");//напишите тут ваш код
        }
        else if (num==6)
        {
            System.out.println("суббота");//напишите тут ваш код
        }
        else if (num==7)
        {
            System.out.println("воскресенье");//напишите тут ваш код
        }
        else
        {
            System.out.println("такого дня недели не существует");//напишите тут ваш код
        }
    }

}