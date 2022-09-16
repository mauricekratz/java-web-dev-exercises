package excercises;
import java.util.Scanner;

public class numericTypes {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("What is the length your rectangle?");
        int length = input.nextInt();

        System.out.println("What is the width your rectangle?");
        int width = input.nextInt();
        input.close();

        int area = length * width;

        System.out.println("The area of your rectangle is "+ area);

    }
}
