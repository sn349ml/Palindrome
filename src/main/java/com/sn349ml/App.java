package com.sn349ml;

import org.cactoos.list.StickyList;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Anagram App
 * This class is for parsing command lines and direct input to parsing class
 */
public class App {
    private final transient Iterable<String> arguments;
    private final String EMPTY_INPUT_WARNING = "Your input was empty, please try again";

    public App(String... args) {
        this.arguments = Arrays.asList(args);
    }

    public static void main(final String... args) throws IOException {
        new App(args).exec();
    }

    public void exec() throws IOException {
        final List<String> givenCharacters = new StickyList<>(this.arguments);
        if (givenCharacters == null || givenCharacters.isEmpty()) throw new IOException(EMPTY_INPUT_WARNING);
        String userInput = givenCharacters.get(0).toLowerCase();
        System.out.println("The program will just grab your input and discard the rest of your inputs, as shown in bash script");
        System.out.format("Given input is %s, start running.....%n", userInput);
        PalindromeValidator palindromeValidator = new PalindromeValidator(userInput);
        if (palindromeValidator.isPalindrome(userInput))
            System.out.println(String.format(String.format("%s is anagram", userInput)));
        else System.out.println(String.format("%s is not anagram", userInput));
    }
}
