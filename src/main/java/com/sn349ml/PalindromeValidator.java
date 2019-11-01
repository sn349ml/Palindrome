package com.sn349ml;

import java.io.IOException;

/**
 * This class takes argument as a given source
 * Validate if input is valid and if input is palindrome
 */
public class PalindromeValidator {
    private final char EMPTY_CHAR = ' ';
    private final String Abnormal_Char_Exception = "User input has abnormal character";

    public PalindromeValidator(String userInput) throws IOException {
        if (!validInput(userInput)) throw new IOException(Abnormal_Char_Exception);
    }

    private boolean validInput(String userInput) {
        if (userInput == null) return false;
        for (char c : userInput.toLowerCase().toCharArray()) {
            if (c == EMPTY_CHAR) continue;
            int charRange = (int) c - 'a';
            if (charRange < 0 || charRange > 26) return false;
        }
        return true;
    }


    public boolean isPalindrome(String input) {
        if (input.isEmpty() || input.length() == 1) return false;
        input = input.trim();
        int i = 0, j = input.length() - 1;
        while (i < j) {
            while (i < j && input.charAt(i) == EMPTY_CHAR) i++;
            while (i < j && input.charAt(j) == EMPTY_CHAR) j--;
            if (input.charAt(i) != input.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
