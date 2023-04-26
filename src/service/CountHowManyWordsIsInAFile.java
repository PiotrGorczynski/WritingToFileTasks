package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountHowManyWordsIsInAFile
{
    public static void countHowManyWordsIsInaFile(String fileName) throws FileNotFoundException
    {
        File file = new File(fileName);
        try(Scanner sc = new Scanner(new FileInputStream(file))){
            int count = 0;
            while(sc.hasNext())
            {
                sc.next();
                count++;
            }
            System.out.println(count);
        }
    }
}
