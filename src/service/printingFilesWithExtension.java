package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class printingFilesWithExtension
{

    public static void main(String[] args)
    {
        Path path = Paths.get("C:/Users/Piotr/IdeaProjects/WritingToFileTasks/src/service");
        String txtExtension = ".txt";
        String javaExtension = ".java";
        run(path, javaExtension);
    }

    public static void run(final Path path, final String extension)
    {
        try{
            System.out.printf("Printing %s%n ",extension);
            printingFilesWithExtension(path,extension);
        }catch (Exception e)
        {
            System.err.printf("Error reading %s, message %s%n", path, e.getMessage());
        }
    }

    public static void printingFilesWithExtension(final Path path, final String extension) throws IOException
    {
        if(Files.isDirectory(path))
        {
            for (Path nextPath : Files.list(path).collect(Collectors.toList()))
            {
                printingFilesWithExtension(nextPath,extension);
            }
        }
        else
        {
            if(path.toString().endsWith(extension))
            {
                System.out.println(path);
            }
        }
    }
}

