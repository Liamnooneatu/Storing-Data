package ie.atu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile{

    public static void main(String[] args) {

        String fileName = "File4.txt";

        try{
            if (FileWriter writer= new FileWriter(fileName, true)) {
               // System.out.println("File created successfully at " + myFile.getAbsolutePath());
                writer.write("some file content");

                System.out.println("The content has been printed") ;
            }

        } catch (IOException e) {
            System.out.println("An error occurred while creating the File.");
            e.printStackTrace();
        }

    }
}