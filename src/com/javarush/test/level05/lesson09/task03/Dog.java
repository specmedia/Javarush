package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private int growth;
    private String color;
    private String filename = null;

    public Dog(String name)
    {
        this.filename = name;
    }

    public Dog(String name, int growth)
    {
        this.filename = name + growth;
    }

    public Dog (String name, int growth, String sex)
    {
        this.filename = name + growth + sex;
    }
}
