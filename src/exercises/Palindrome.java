package exercises;

import java.util.List;
import examples.FileHelper;

public class Palindrome {

	public List<String> loadWords() {
		return FileHelper.loadFileContentsIntoArrayList("resource/words.txt");
	}

	public boolean isPalindrome(String word) {
		for (int i = 0; i < word.length() / 2; i++)
			if (word.charAt(i) != word.charAt(word.length() - i - 1))
				return false;
		return true;

	}
}
