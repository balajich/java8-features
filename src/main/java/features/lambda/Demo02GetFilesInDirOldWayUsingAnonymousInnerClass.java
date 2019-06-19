package features.lambda;

import java.io.File;
import java.io.FileFilter;

/***
 * Get files with extension .txt from a directory old way
 * Using Anonymous inner class
 */
public class Demo02GetFilesInDirOldWayUsingAnonymousInnerClass {
    public static void main(String[] args) {
        //Create a anonymouse inner calls of FileFliter
        FileFilter textFileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".txt");
            }
        };
        File dir = new File("/tmp");
        //Get files in a directory that ends with txt extension
        File[] files = dir.listFiles(textFileFilter);

        //print all the files
        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}

