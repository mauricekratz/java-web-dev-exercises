package excercises;

import java.util.Scanner;

public class AliceAdventureInWonderlandDeletion {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        String excerpt = new String("Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?' \n");
        System.out.println(excerpt);

        System.out.println("Search for word in the string:");
        String searchedWord = input.nextLine();


        if(excerpt.toLowerCase().contains(searchedWord.toLowerCase())){
            System.out.println(excerpt.replace(searchedWord,""));
            System.out.println("Test");
        }else {
            System.out.println(excerpt);
        }

    }
    }

