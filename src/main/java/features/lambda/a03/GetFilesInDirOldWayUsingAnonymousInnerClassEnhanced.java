package features.lambda.a03;

import java.io.File;
import java.io.FileFilter;

/***
 * Get files with extension .txt from a directory old way
 * Using Anonymous inner class
 */
public class GetFilesInDirOldWayUsingAnonymousInnerClassEnhanced {
    public static void main(String[] args) {

        File dir = new File("/tmp");

        //Get files in a directory that ends with txt extension
        // Create Anonymous inner class and initialize it at same time

        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt");
            }
        });

        //print all the files
        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}

