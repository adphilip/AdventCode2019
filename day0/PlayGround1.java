package day0;

import java.io.File;
import java.io.FileFilter;

class PlayGround1 {

    public static void main(String args[]){

        // FileFilter fileFilter = new FileFilter(){
        
        //     @Override
        //     public boolean accept(File pathname) {
              
        //         return pathname.getName().endsWith(".java");
        //     }
        // };

        FileFilter fileFilter = (File pathname) -> 
            pathname.getName().endsWith(".java");

        File directory = new File("/Users/pp02ue/GitLab/_PlayGround/OCP/src");
        File[] files = directory.listFiles(fileFilter);

        for(File f: files){
            System.out.println("Files :" + f);
        }

        System.out.println("End!");
    }
}