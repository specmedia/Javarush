package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather1 = new Human("ded1", true, 90, null, null);
        Human grandfather2 = new Human("ded2", true, 90, null, null);
        Human grandmother1 = new Human("babka1", false, 90, null, null);
        Human grandmother2 = new Human("babka2", false, 90, null, null);
        Human father = new Human("otec", true, 45, grandfather1, grandmother1);
        Human mother = new Human("mat", false, 45, grandfather2, grandmother2);
        Human child1 = new Human("kid3", true, 5, father, mother);
        Human child2 = new Human("kid3", true, 4, father, mother);
        Human child3 = new Human("kid3", true, 3, father, mother);
        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;
        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;//напишите тут ваш код

        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
