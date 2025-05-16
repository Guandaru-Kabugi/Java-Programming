import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingBufferedOutputStream {
    public static void main(String[] args) {
        String data = "Hello, this is a test using BufferedOutputStream";
        try(FileOutputStream fos = new FileOutputStream(
                "src/main/resources/output.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos)
        ){
            byte[] byteArray = data.getBytes();
            bos.write(byteArray);//writes the data
            bos.flush();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
