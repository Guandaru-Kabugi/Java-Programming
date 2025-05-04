import java.util.*;

public class WordScrambleChallenge {
    public static void main(String[] args){

        welcomeUser();
        generateRandomWord();
        System.out.println(generateRandomWord());
        scrambleWord();





    }

    public static void welcomeUser(){
        System.out.println("Welcome to Word Scramble Game!");
        System.out.println("Unscramble the magic words to score points!");
    }
    // pick a random word from an array

    public static String generateRandomWord(){
        String[] randomWords = {"Lantern","Whisper", "Glacier","Puzzle","Orbit",
                "Velvet","Cactus","Marvel","Thread","Sizzle"};
        Random random = new Random();
        int index = random.nextInt(randomWords.length); //we get the random index then pass it to the array
        return randomWords[index];
    }
    public static void scrambleWord(){
        String wordChoice = generateRandomWord();
        char[] charArray = wordChoice.toCharArray(); // converts string to array of characters
        System.out.println(Arrays.toString(charArray));

        //convert to character list
        Character[] characters = new Character[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            characters[i] = charArray[i];

        }

        //shuffle the array

        List<Character> charList = Arrays.asList(characters);
        Collections.shuffle(charList);

        //convert back to string

        StringBuilder scrambled = new StringBuilder();
        for (char c:charList){
            scrambled.append(c);
        }
        String word = scrambled.toString();

        boolean continueAsking = true;

        while (continueAsking){
            Scanner scanner = new Scanner(System.in);

            System.out.println("The scrambled word is :" + word);
            System.out.println("You guess: ");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase(wordChoice)){
                System.out.println("Well done on your guess. The correct word is " + wordChoice);

                System.out.println("Do you want to make another guess? yes/no ");

                String answer1 = scanner.nextLine();
                if (answer1.equalsIgnoreCase("yes")){
                    scrambleWord();
                } else if (answer1.equalsIgnoreCase("no")) {
                    continueAsking = false;
                }


            } else {
                System.out.println("Wrong choice");
                int numberOfGuesses = 2;
                for (int i = 0; i < numberOfGuesses; i++) {
                    System.out.println("Make another guess");
                    String guess1 = scanner.nextLine();
                    if (guess1.equalsIgnoreCase(wordChoice)){
                        System.out.println("Well done. The answer is " + wordChoice);
                        break;
                    }
                    else continue;
                }


            }



            scanner.close();
        }




    }
    public static void guessGame(){

    }

}
