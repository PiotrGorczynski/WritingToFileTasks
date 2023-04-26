package service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Locale;
import java.util.Optional;


public class LastModifiedDate
{
    private static final DateTimeFormatter FORMATTER
            = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.ROOT);


    public static void getTheOldestModifiedFile(String path) throws IOException
    {
        Path path1 = Paths.get(path);
        Optional<Path> firstModified = Files.list(path1)
                .min(Comparator.comparing(f -> getLastModified(f)));

        firstModified.ifPresentOrElse(
                p -> System.out.println("" + p + " modified "
                        + getLastModified(p).atZone(ZoneId.systemDefault())
                        .format(FORMATTER)),
                () -> System.out.println("No files"));
        printFileName(firstModified);
    }

    public static void getLastModifiedFilePath(String path) throws IOException
    {
        Path path1 = Paths.get(path);
        Optional<Path> firstModified = Files.list(path1)
                .max(Comparator.comparing(f -> getLastModified(f)));

        firstModified.ifPresentOrElse(
                p -> System.out.println("" + p + " modified "
                        + getLastModified(p).atZone(ZoneId.systemDefault())
                        .format(FORMATTER)),
                () -> System.out.println("No files"));

        printFileName(firstModified);
    }
    

    private static Instant getLastModified(Path p) {
        try {
            return Files.readAttributes(p, BasicFileAttributes.class).lastModifiedTime().toInstant();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private static void printFileName(Optional<Path> firstModified)
    {
        Path path2 = firstModified.get().getFileName();
        System.out.println(path2);
    }
}
