package practice.java8.lambdaexp;

import java.io.File;
import java.io.FileFilter;

public class TryLambda {

    public static void main(String[] args) {
        /*FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java");
            }
        };*/

        FileFilter filter1 = (File pathname) ->
                pathname.getName().endsWith(".java");
        
        File file= new File("E:/tmp/");
        File[] files = file.listFiles(filter1);

        for(File filePo:files){
            System.out.println(filePo);
        }


    }

}
