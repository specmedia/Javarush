package com.javarush.test.level09.lesson11.home09;

import java.util.*;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
    Map<String, Cat> map = createMap();
    Set<Cat> set = convertMapToSet(map); printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();
         map.put("Vaska", new Cat("Vaska"));
         map.put("Maska", new Cat("Maska"));
         map.put("Koshka", new Cat("Koshka"));
         map.put("Toha", new Cat("Toha"));
         map.put("Riji", new Cat("Riji"));
         map.put("Detka", new Cat("Detka"));
         map.put("Milii", new Cat("Milii"));
         map.put("Ben", new Cat("Ben"));
         map.put("Timon", new Cat("Timon"));
         map.put("Tom", new Cat("Tom"));
         return map;
    }
    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>(map.values());
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            Cat s = pair.getValue();
            set.add(pair.getValue());
        }//Напишите тут ваш код
         return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }
    public static class Cat
    {
    private String name;
    public Cat(String name)
        {
        this.name = name;
        }
    public String toString()
        {
        return "Cat "+this.name;
        }
    }
}