package com.sn349ml;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.io.IOException;

public class PalindromeValidatorTest {
    private static final String ABNORMAL_WARNING = "User input has abnormal character";

    @Test
    public final void returnAbnormalWarningFromSpecialCharacter() throws IOException {
        final Throwable expected = Assertions.catchThrowable(() -> new PalindromeValidator("Dogd$$$"));
        Assertions.assertThat(expected).hasMessageContaining(ABNORMAL_WARNING);
    }

    @Test
    public final void returnTrueFromValidAnagramWord() throws IOException {
        final String correctWord = "racecar";
        final PalindromeValidator expected = new PalindromeValidator(correctWord);
        Assertions.assertThat(expected.isPalindrome(correctWord)).isTrue();
    }

    @Test
    public final void returnTrueFromValidAnagramSentence() throws IOException {
        final String correctSentence = "nurse i spy gypsies run";
        final PalindromeValidator expected = new PalindromeValidator(correctSentence);
        Assertions.assertThat(expected.isPalindrome(correctSentence)).isTrue();
    }

    @Test
    public final void returnFalseFromEmptyUserInput() throws IOException {
        final String emptyInput = "";
        final PalindromeValidator expected = new PalindromeValidator(emptyInput);
        Assertions.assertThat(expected.isPalindrome(emptyInput)).isFalse();
    }

    @Test
    public final void returnFalseFromSingleCharacterUserInput() throws IOException {
        final String singleCharacterInput = "a";
        final PalindromeValidator expected = new PalindromeValidator(singleCharacterInput);
        Assertions.assertThat(expected.isPalindrome(singleCharacterInput)).isFalse();
    }

    @Test
    public final void returnFalseFromNonAnagramUserInput() throws IOException {
        final String nonAnagramWord = "wall";
        final PalindromeValidator expected = new PalindromeValidator(nonAnagramWord);
        Assertions.assertThat(expected.isPalindrome(nonAnagramWord)).isFalse();
    }
}
