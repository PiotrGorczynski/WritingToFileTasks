package utils;

public class GetFileExtension
{
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
