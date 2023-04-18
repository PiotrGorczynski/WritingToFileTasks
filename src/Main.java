import service.ListAllFiles;
import utils.ListFileWithinDirectory;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

import static service.DisplaySizeOfFile.displaySizeOfFile;
import static service.ListAllFilesAndAskForExtension.listAllFilesAndAskForExtension;

public class Main
{
    public static void main(String[] args) throws IOException
    {

        listAllFilesAndAskForExtension();
        Set<String> set = ListFileWithinDirectory.listFilesUsingJavaIO("src");
        System.out.println(set);
        Path path = Paths.get("C:/Users/Piotr/IdeaProjects/WritingToFileTasks/src/service");
        List<Path> paths = ListAllFiles.listFiles(path);
        paths.forEach(x-> System.out.println(x));
        displaySizeOfFile("C:/Users/Piotr/IdeaProjects/WritingToFileTasks/src/utils");
    }

}
