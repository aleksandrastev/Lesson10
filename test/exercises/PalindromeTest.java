package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	Palindrome testPalindrome = new Palindrome();

	@Test
	void testLoadWords() {
		assertTrue(testPalindrome.loadWords().contains("apple"));
	}

	// 2. Test that a word exists in the dictionary
	@Test
	void testWordExists() throws Exception {
		assertTrue(testPalindrome.loadWords().contains("level"));
		assertTrue(testPalindrome.loadWords().contains("murdrum"));
		assertTrue(testPalindrome.loadWords().contains("book"));

		assertFalse(testPalindrome.loadWords().contains("agfhjk"));

	}

	// 3. Test that a word is a palindrome
	@Test
	void testIsPalindrome() throws Exception {
		assertTrue(testPalindrome.isPalindrome("level"));
		assertTrue(testPalindrome.isPalindrome("murdrum"));

		assertFalse(testPalindrome.isPalindrome("book"));
	}

}
