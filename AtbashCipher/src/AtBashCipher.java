import java.util.Scanner;
public class AtBashCipher {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        // Step 1: Display menu
        System.out.println("Welcome to the Encoder-Decoder Game!");
        System.out.println("1. Encode a string");
        System.out.println("2. Decode a string");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Step 2: Prompt user for input string
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        if(choice == 1){
            String encodedString = encode(input,0);
            System.out.println("The encoded word for " + input + " is " + encodedString);
        } else if (choice==2) {
            String decodedString = decode(input,0);
            System.out.println("The decoded word for " + input + " is " + decodedString);
        }else System.out.println("Invalid choice.");


        scanner.close();
    }

    public static String decode(String input,int index){
        //we start with the base case
        if(index ==input.length()){
            return "";
        }
        char ch = input.charAt(index);
        char decodedChar = atBash(ch);

        //we also have the recursive case
        return decodedChar + decode(input, index+1); //the plus is for concatenation of the chars
    }

    public static String encode (String input, int index){
        //this is the base case
        if(index==input.length()){
            return "";
        }
        char ch = input.charAt(index);
        char encodedChar = atBash(ch);

        //the recursive part

        return encodedChar + encode(input,index+1);


    }
    // the decimal value of characters in the ascii table is used
    // example is b is 98 and a is 97 and z is 122
    //so we get 122 - (98-97) = 121, which is 'y'
    public static char atBash(char ch){
        if(ch >= 'a' && ch <= 'z'){
            return (char) ('z' - (ch - 'a'));

        } else if(ch >= 'A' && ch <= 'Z'){
            return (char) ('Z' - (ch - 'A'));}
        else return ch;

    }
}
