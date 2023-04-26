package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FileToUppercaseLetters
{
    public static void toUpperCaseLetter(String stFile, String ndFile) throws IOException
    {
        File inputFile = new File(stFile);
        File outputFile = new File(ndFile);

        Scanner sc;
        FileWriter fw;

        try {
            sc = new Scanner(inputFile);
            fw = new FileWriter(outputFile);

            while(sc.hasNextLine()) {
                String str = sc.nextLine();
                fw.write(str.toUpperCase(Locale.ROOT));
            }

            sc.close();
            fw.close();

        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
