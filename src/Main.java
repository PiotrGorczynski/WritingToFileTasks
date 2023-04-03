import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        listAllFilesAndAskForExtension();
    }

    private static void listAllFilesAndAskForExtension()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the extension: ");
        String nameOfExtension = scanner.nextLine();
        System.out.println("Given name is: " + nameOfExtension);

        File file = new File("C:");
        String[] children = file.list();
        System.out.println();

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
                System.out.println(filename);
                if(getFileExtension(filename).equals(nameOfExtension))
                {
                    System.out.println();
                    System.out.println("File extension is: " + getFileExtension(filename));
                }
//                System.out.println(fileExtension);

            }
        }
    }

    public static String getFileExtension(String filename)
    {
        int index = filename.lastIndexOf('.');
        String extension = "";
        if (index > 0)
        {
            extension = filename.substring(index + 1);
        }
        return extension;
    }

}
