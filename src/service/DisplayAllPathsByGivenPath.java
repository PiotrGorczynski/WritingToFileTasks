package service;

import java.io.File;

public class DisplayAllPathsByGivenPath
{
    public static void listFilesForFolder(final File folder)
    {
        for(final File fileEntry : folder.listFiles())
        {
            if(fileEntry.isDirectory())
            {
                listFilesForFolder(fileEntry);
            }
            else
            {
                System.out.println(fileEntry.getAbsolutePath());
            }
        }
    }
}
