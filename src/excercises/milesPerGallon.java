package excercises;
import java.util.Scanner;

public class milesPerGallon {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("How many miles have you drive?");
        int milesDriven = input.nextInt();

        System.out.println("How many gallons did you use?");
        int milesConsumed = input.nextInt();
        input.close();

        int milesPerGallon = milesDriven/milesConsumed;

        System.out.println("This trip: "+milesPerGallon + " mpg!");
    }
}

