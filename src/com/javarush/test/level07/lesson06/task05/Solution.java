package com.javarush.test.level07.lesson06.task05;
//Задача 5. Удали последнюю строку и вставь её в начало

 //       1. Создай список строк.
  //      2. Добавь в него 5 строчек с клавиатуры.
  //      3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
  //      4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
        import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int b = 0; b<5; b++)
        {
            list.add(reader.readLine());
        } for (int a = 0; a < 13; a++)
    {
        String list2=list.get(list.size()-1);//переменной присваивается значение 4 ячейки (последней строки)
     list.remove(list.size()-1);//удаление значения из четвертой ячейки(последняя строка)
         list.add(0, list2); // присваивание в нулевой ячейке(первой строке) значение переменной list2(последней строки). // в данном случае, данные с ячеек не пропадают, а смещаются на одну вперед, т.к. последнюю мы удаляем, но присваиваем значение к нулевой(первой строке), внесенные ранее значения ячеек смещаются на одну вперед //цикл происходит следующим образом: при вводе 1,2,3,4,5 цикл 51234-45123-34512-23451-12345-51234-45123-34512-23451-12345-51234-45123-34512

}
    for (int b = 0; b<list.size(); b++)
    {
        System.out.println(list.get(b));
    }

// и на выходе получается каждое значение с новой строки(34512)

}

}