import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationInAction {
    public static void main(String[] args) {
        try(FileInputStream fileIn = new FileInputStream("src/main/resources.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn)
        ){
            Student deserializedStudent = (Student)in.readObject();
            System.out.println("Deserialization was successful.");
            deserializedStudent.displayStudentDetails();

        } catch (Exception e){
            System.out.println(e.getMessage());
            
        }

    }
}
