package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public boolean emailIsValid(String email) {
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(email);
		return matcher.find();
	}

	public boolean phoneNumberIsValid(String number) {
		Pattern pattern = Pattern.compile("\\d{3}-\\d{7}");
		Matcher matcher = pattern.matcher(number);
		return matcher.find();
	}

}
