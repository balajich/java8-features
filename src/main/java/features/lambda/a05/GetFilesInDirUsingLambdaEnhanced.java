package features.lambda.a05;

import java.io.File;
import java.io.FileFilter;

/***
 * Get files with extension .txt from a directory using lambda
 */
public class GetFilesInDirUsingLambdaEnhanced {
    public static void main(String[] args) {

        File dir = new File("/tmp");
        //Java allows you to create variable with out data type :)
        //It is allowed in lambda expression
        FileFilter fileFilter = (pathname) -> pathname.getName().endsWith(".txt");


        //Get files in a directory that ends with txt extension
        // Pass lambda expression

        File[] files = dir.listFiles(fileFilter);

        //print all the files
        for (File file : files) {
            System.out.println(file.getName());
        }

    }
}

