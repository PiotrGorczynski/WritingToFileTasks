package service;

import java.io.File;
import java.util.Scanner;

import static utils.GetFileExtension.getFileExtension;

public class ListAllFilesAndAskForExtension
{
    public static void listAllFilesAndAskForExtension()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the name of the path: ");
        String nameOfPath = scanner.nextLine();
        System.out.println("Given path is: " + nameOfPath);
        System.out.print("Give the extension: ");
        String nameOfExtension = scanner.nextLine();
        System.out.println("Given name is: " + nameOfExtension);

        File file = new File(nameOfPath);
        String[] children = file.list();
        System.out.println("----------------");

        if(children == null)
        {
            System.out.println("Either dir does not exist or is not a directory.");
        }
        else
        {
            for (int i = 0; i < children.length; i++)
            {
                String filename = children[i];
                String fileExtension = getFileExtension(filename);
                if(getFileExtension(filename).equals(nameOfExtension))
                {
                    System.out.println();
                    System.out.println("File extension is: " + getFileExtension(filename));
                    System.out.println(filename);
                }
                else{
                    System.out.println("There is no file with this extension.");
                    System.out.println("----------------");
                    break;
                }
                System.out.println("----------------");
            }
        }
    }

}
