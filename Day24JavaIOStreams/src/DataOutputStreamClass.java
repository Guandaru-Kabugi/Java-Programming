import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataOutputStreamClass {
    public static void main(String[] args) {
        //String data = "Hello, this is a test using fileoutputstream";
        //when using a .txt, all data will not be readable on the file except the string
        //input stream
        InputStream fileStream = DataOutputStreamClass.class.getClassLoader().getResourceAsStream("output.bin");
        try(FileOutputStream fos = new FileOutputStream(
                "src/main/resources/output.bin");
            //best is to use a bin
            DataOutputStream dos = new DataOutputStream(fos)){
            dos.writeDouble(3.14);
            dos.writeChar('H');
            dos.writeInt(42);
            dos.writeUTF("This is a string");
            dos.flush();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
