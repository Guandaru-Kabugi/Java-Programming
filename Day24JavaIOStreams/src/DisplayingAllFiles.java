import java.io.File;

public class DisplayingAllFiles {
    public static void main(String[] args) {
        String dirPath = "src/main/resources/";
        File dir = new File(dirPath);
       File[] files = dir.listFiles();
       if(files!=null && files.length>0){
           for(File f : files){
               System.out.println(f.getName());
           }

       }
    }
}
