package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DisplaySizeOfFile
{

    public static void displaySizeOfFile(String fileName)
    {
        Path path = Paths.get(fileName);
        try
        {
            long bytes = Files.size(path);
            System.out.println(String.format("%,d bytes",bytes));
            System.out.println(String.format("%,d kilobytes",bytes/1024));
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
