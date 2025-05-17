import java.io.File;

public class CreateDirectoryPath {
    public static void main(String[] args) {
        String dirPath = "src/main/resources/file";
        String nestedDirPath = "src/main/resources/file/subdir1/subdir2";

        File dir = new File(dirPath);
        if(!dir.exists()){
            if(dir.mkdir()){
                System.out.println("Directory created: " + dir.getName());
            }else{
                System.out.println("Failed to create a directory");
            }

        }else{
            System.out.println("Directory already exists.");
        }
        File nestedDirs = new File(nestedDirPath);
        if(!nestedDirs.exists()){
            if(nestedDirs.mkdirs()){
                System.out.println("two subfolders created." + nestedDirs.getName());
            }else{
                System.out.println("Failed to create two new folders.");
            }
        }else{
            System.out.println("The subfolders exist");
        }

    }
}
