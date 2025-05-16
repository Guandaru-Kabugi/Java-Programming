import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamClassToReadFile {
    public static void main(String[] args) {
        //String data = "Hello, this is a test using fileoutputstream";
        //when using a .txt, all data will not be readable on the file except the string
        //input stream
        InputStream fileStream = BufferedInputStreamClassToReadFile.class.getClassLoader().getResourceAsStream("output.txt");
        if(fileStream ==null){
            System.out.println("File is null");
            return;
        }
        try(
                //best is to use a bin
            BufferedInputStream bis = new BufferedInputStream(fileStream)){
            int data;
            while((data = bis.read()) != -1){
                System.out.print((char)data); //convert to char
            }
            //make resources folder a resources
            //project structure, modules, tick src/resources as resources and apply

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
