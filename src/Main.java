import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println(promptString("I'm passing this in as the parameter because I don't know what the specified message is and I think the prompt for input is supposed to be in the methods and not the main function"));
        System.out.println(promptInt("sorry for yapping"));
        System.out.println(promptDouble("sincerely, dyl"));


    }

    public static String promptString(String message) {

        String userInput = null;

        while (userInput == null) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please type a string message, one that is not an integer or a double");
            userInput = input.nextLine();


            try {
                double numTest = Double.parseDouble(userInput);
                userInput = null;
                System.out.println("Sorry, that is not a string message");

            } catch (Exception ignored) {}





        }

        return userInput;
    }

    public static int promptInt(String message) {
        int newInt = 0;

        while (newInt == 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please type an integer");
            String userInput = input.nextLine();


            try {
                newInt = Integer.parseInt(userInput);
                return newInt;

            } catch (Exception e) {
                System.out.println("Sorry, that is not an integer");
            }

        }

        return newInt;
    }


    public static double promptDouble(String message){
        double newDouble = 0;

        while (newDouble == 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please type a double");
            String userInput = input.nextLine();


            try {
                newDouble = Double.parseDouble(userInput);
                return newDouble;

            } catch (Exception e) {
                System.out.println("Sorry, that is not a number");
            }

        }

        return newDouble;
    }



}