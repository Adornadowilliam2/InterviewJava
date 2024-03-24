import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Questionnaire {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int score = 0;

        System.out.println("Welcome to the questionnaire!");

        // Question 1
        System.out.println("Q1: What is the capital of France?");
        String answer1 = getUserInput(reader);
        if (answer1.equalsIgnoreCase("Paris")) {
            score += 10;
        }

        // Question 2
        System.out.println("Q2: What is the color of the sky?");
        String answer2 = getUserInput(reader);
        if (answer2.equalsIgnoreCase("Blue")) {
            score += 10;
        }

        // Question 3
        System.out.println("Q3: How many days are there in a week?");
        String answer3 = getUserInput(reader);
        if (answer3.equalsIgnoreCase("7")) {
            score += 10;
        }

        // Question 4
        System.out.println("Q4: What is the largest planet in our solar system?");
        String answer4 = getUserInput(reader);
        if (answer4.equalsIgnoreCase("Jupiter")) {
            score += 10;
        }

        // Question 5
        System.out.println("Q5: Who painted the Mona Lisa?");
        String answer5 = getUserInput(reader);
        if (answer5.equalsIgnoreCase("Leonardo da Vinci")) {
            score += 10;
        }

        // Question 6
        System.out.println("Q6: What is the chemical symbol for gold?");
        String answer6 = getUserInput(reader);
        if (answer6.equalsIgnoreCase("Au")) {
            score += 10;
        }

        // Question 7
        System.out.println("Q7: What is the tallest mountain in the world?");
        String answer7 = getUserInput(reader);
        if (answer7.equalsIgnoreCase("Mount Everest")) {
            score += 10;
        }

        // Question 8
        System.out.println("Q8: Who wrote the play 'Romeo and Juliet'?");
        String answer8 = getUserInput(reader);
        if (answer8.equalsIgnoreCase("William Shakespeare")) {
            score += 10;
        }

        // Question 9
        System.out.println("Q9: What is the chemical symbol for water?");
        String answer9 = getUserInput(reader);
        if (answer9.equalsIgnoreCase("H2O")) {
            score += 10;
        }

        // Question 10
        System.out.println("Q10: What is the largest ocean in the world?");
        String answer10 = getUserInput(reader);
        if (answer10.equalsIgnoreCase("Pacific")) {
            score += 10;
        }

        System.out.println("Thank you for completing the questionnaire!");
        System.out.println("Your score is: " + score + "/100");
    }

    private static String getUserInput(BufferedReader reader) {
        String input = "";
        try {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
