package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
    {
        private String name;
        private int age;
        private String sex;
        private String filename = null;

        public Friend(String name)
        {
            this.filename = name;
        }

        public Friend(String name, int age)
        {
            this.filename = name + age;
        }

        public Friend(String name, int age, String sex)
        {
            this.filename = name + age + sex;
        }
    }