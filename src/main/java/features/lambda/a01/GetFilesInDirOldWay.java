package features.lambda.a01;

import java.io.File;
import java.io.FileFilter;

/***
 * Get files with extension .txt from a directory old way
 */
public class GetFilesInDirOldWay {
    public static void main(String[] args) {
        FileFilter textFileFilter = new TextFileFilter();
        File dir = new File("/tmp");
        //Get files in a directory that ends with txt extension
        File[] files = dir.listFiles(textFileFilter);

        //print all the files
        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}

/**
 * Implementing FileFilter interface
 */
class TextFileFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(".txt");
    }
}