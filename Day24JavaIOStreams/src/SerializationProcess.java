import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationProcess {
    public static void main(String[] args) {
        Student student = new Student("Alex",101,28);


        try(FileOutputStream fileout = new FileOutputStream("src/main/resources.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout)
        ){
            out.writeObject(student);
            System.out.println("Student object serialized");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
