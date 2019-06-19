package features.lambda;

import java.io.File;
import java.io.FileFilter;

/***
 * Get files with extension .txt from a directory old way
 * Using Anonymous inner class
 */
public class Demo04GetFilesInDirUsingLambda {
    public static void main(String[] args) {

        File dir = new File("/tmp");
        FileFilter fileFilter = (File pathname) -> {
            return pathname.getName().endsWith(".txt");
        };

        //Get files in a directory that ends with txt extension
        // Pass lambda expression

        File[] files = dir.listFiles(fileFilter);

        //print all the files
        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}

