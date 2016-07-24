package com.javarush.test.level14.lesson08.bonus03;

public class Singleton
{
    private Singleton(){

    }
    private static Singleton inst;
    public static Singleton getInstance(){
        if (inst == null)
        {
            inst = new Singleton();
        }
        return inst;
    }

}
