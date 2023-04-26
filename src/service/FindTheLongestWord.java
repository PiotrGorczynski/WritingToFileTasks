package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindTheLongestWord
{
    public static void findTheLongestWord(String file) throws FileNotFoundException
    {
        String longest_word = "";
        String current;
        Scanner sc = new Scanner(new File(file));

        while(sc.hasNext())
        {
            current = sc.next();
            if(current.length()>longest_word.length())
            {
                longest_word = current;
            }
        }
        System.out.println(longest_word);
    }

    public static void findTheWordWithThreeChars(String file) throws FileNotFoundException
    {
        ArrayList<String> list = new ArrayList<>();
        String current;
        Scanner sc = new Scanner(new File(file));
        while(sc.hasNext())
        {
            current = sc.next();
            if(current.length() == 3)
            {
                list.add(current);
            }
        }
        System.out.println(list);
    }
}
