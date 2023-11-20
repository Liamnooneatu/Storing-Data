package ie.atu;

import java.io.File;
import java.io.IOException;

public class CreateFile{

    public static void main(String[] args) {

        String fileName = "File3.txt";

        File myFile = new File(fileName);

        try{
            if (myFile.createNewFile()){
                System.out.println("File created succesfully at " + myFile.getAbsolutePath());
            } else{
                System.out.println("File already exits at " + myFile.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("An error occured while creating the File.");
            e.printStackTrace();
        }
    }
}