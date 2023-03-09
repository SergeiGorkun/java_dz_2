package org.example;

import java.util.Scanner;

//1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).
public class Main {

    public static boolean isPalindrome(String str)
    {
        if (str == null) {
            return false;
        }

        for (int i = 0, j = str.length() - 1; i < j; i++, j--)
        {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main (String[] args)
    {
        String str = "шалаш";

        if (isPalindrome(str)) {
            System.out.println("Строка является палиндромом");
        }
        else {
            System.out.println("Строка не является палиндромом");
        }
    }
}


//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.


    'TEXT'.

    void repeat(100, int i) {
        while (true) {
            Object toString;
            {
                toString:
                () =>;
                Object repeat = null;
                "TEXT", repeat:String.CASE_INSENSITIVE_ORDER.repeat
            }.i = 100;
        }
    }