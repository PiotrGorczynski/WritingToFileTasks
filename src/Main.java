import service.DisplaySizeOfFile;
import service.LastModifiedDate;

import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {

//        listAllFilesAndAskForExtension();
//        Set<String> set = ListFileWithinDirectory.listFilesUsingJavaIO("src");
//        System.out.println(set);
//        Path path = Paths.get("C:/Users/Piotr/IdeaProjects/WritingToFileTasks/src/service");
//        List<Path> paths = ListAllFiles.listFiles(path);
//        paths.forEach(x-> System.out.println(x));
//        displaySizeOfFile("C:/Users/Piotr/IdeaProjects/WritingToFileTasks/src/utils");
//        final File folder =  new File("C:\\Users\\Piotr\\IdeaProjects\\WritingToFileTasks\\src\\service");
//        listFilesForFolder(folder);
        DisplaySizeOfFile.displaySizeOfFile("C:/Users/Piotr/IdeaProjects/WritingToFileTasks/src/service/DisplayAllPathsByGivenPath.java");
        LastModifiedDate.getLastModifiedFilePath("C:/Users/Piotr/IdeaProjects/WritingToFileTasks/src/service");
        LastModifiedDate.getTheOldestModifiedFile("C:/Users/Piotr/IdeaProjects/WritingToFileTasks/src/service");
    }

}
