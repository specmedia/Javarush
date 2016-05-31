package com.javarush.test.level11.lesson11.home03;

/* Эволюция
Написать четыре класса: Fish(Рыбы), Animal(Животные), Ape(Обезьяны), Human (Человек).
Унаследовать животных от рыб, обезьян от животных и человека от обезьян.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public abstract class Fish
    {

    }

    public abstract class Animal extends Fish
    {

    }

    public abstract class Ape extends Animal
    {

    }

    public class Human extends Ape
    {

    }

}
