import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ClassByteArrayStreamChallenge {
    public static void main(String[] args) {
        byte[] data = {72,101,108,108,111};
        //to read data
        ByteArrayInputStream inputStream = null;
        try{
            inputStream = new ByteArrayInputStream(data);
            int byteData;
            //byteData = inputStream.read();
            //java knows its done reading a stream if result is -1
            while((byteData = inputStream.read()) != -1){
                System.out.print((char)byteData);
            }
        }catch (Exception e){
            System.out.println("Error occurred when handling input stream.");

        }finally {
            if(inputStream !=null){
                //we close the stream. Close throws an exception and must be handled
                try{
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
