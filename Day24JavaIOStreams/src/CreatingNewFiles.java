import java.io.File;
import java.io.IOException;

public class CreatingNewFiles {
    public static void main(String[] args) {
        String filePath = "src/main/resources/newFile.txt";
        File file = new File(filePath);
        if(file.exists()){
            System.out.println("File exists");
        }else{
            System.out.println("File does not exist");
            try{
                if(file.createNewFile()){
                    System.out.println("File created successfully." + file.getName());
                }else{
                    System.out.println("Failed to create file.");
                }
            }catch (IOException e){
                System.out.println("An error occurred while creating a file.");
                e.printStackTrace();
            }
        }
        System.out.println("File Name: " + file.getName());
        System.out.println("File Path: " + file.getPath());
    }
}
