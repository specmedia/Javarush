package com.javarush.test.level06.lesson08.task01;

/* Класс Cat и статическая переменная catCount
Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
*/

public class Cat
{
        String name;            //обычная переменная
        static int catCount;    //статическая переменная

    public Cat()
        {
            catCount++;   //увеличиваем значение статический переменной на 1
        }
    //напишите тут ваш код
}
