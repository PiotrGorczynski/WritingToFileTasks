import utils.ListFileWithinDirectory;

import java.util.Set;

import static service.ListAllFilesAndAskForExtension.listAllFilesAndAskForExtension;

public class Main
{
    public static void main(String[] args)
    {

        listAllFilesAndAskForExtension();
        Set<String> set = ListFileWithinDirectory.listFilesUsingJavaIO("src");
        System.out.println(set);
    }

}
