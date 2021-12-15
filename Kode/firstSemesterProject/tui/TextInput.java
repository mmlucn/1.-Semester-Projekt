package tui;

import java.util.Scanner;
/**
 * Description of TextInput goes here.
 * 
 * @author Istvan Knoll, Mogens Holm Iversen
 * @version 0.0.1 initial draft version
 */
public class TextInput {
    
    public TextInput() {
    }
    

    //other methods
    public static int inputNumber(String question) {   
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        printQuesiton(question);
        while (!keyboard.hasNextInt()){
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        number = keyboard.nextInt();
        return number;
    }
    
    public static String inputString(String question) {
        Scanner keyboard = new Scanner(System.in);
        printQuesiton(question);
        return keyboard.nextLine();
    }

    public static double inputDouble(String question) {
        Scanner keyboard = new Scanner(System.in);
        printQuesiton(question);
        double number = 0.0f;
        while (!keyboard.hasNextDouble()){
            System.out.println("Input skal være et komme tal - prøv igen");
            keyboard.nextLine();
        }
        number = keyboard.nextDouble();
        return number;
    }
    
    private static void printQuesiton(String question) {
        System.out.print(" " + question + ": ");
    }

}
