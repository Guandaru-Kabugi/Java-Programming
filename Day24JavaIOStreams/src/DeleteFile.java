import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) {
        String filePath = "src/main/resources/newFile1.txt";
        String filePath3 = "src/main/resources/newFile3.txt";
        File file = new File(filePath3);
        if(file.exists()){
            System.out.println("This file does exist.");
        }else{
            System.out.println("File does not exist");
            try{
                if(file.createNewFile()){
                    System.out.println("File created successfully." + file.getName());
                } else{
                    System.out.println("Failed to create file.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred while creating a file.");
            }
        }
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getPath());
        //delete
        if(file.delete()){
            System.out.println("File deleted" + file.getName());
        }else{
            System.out.println("Deletion failed.");
        }

    }
}
