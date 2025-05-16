import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteOnFilesTryWithResources {
    public static void main(String[] args) {
        String data = "Hello, this is a test using fileoutputstream";
        try(FileOutputStream fos = new FileOutputStream(
                "src/main/resources/output.txt")){
            byte[] byteArray = data.getBytes();
            fos.write(byteArray);//writes the data
            fos.flush();
            System.out.println("Data written to file successfully.");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
