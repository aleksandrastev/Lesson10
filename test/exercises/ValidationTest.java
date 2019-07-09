package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidationTest {

	@Test
	void testEmailValidation() throws Exception {
		Validation testRegex = new Validation();
		assertTrue(testRegex.emailIsValid("name@example.com"));
		assertTrue(testRegex.emailIsValid("name1@example.com"));
		assertTrue(testRegex.emailIsValid("name@example"));

		assertFalse(testRegex.emailIsValid("nameexample.com"));
		assertFalse(testRegex.emailIsValid("name#example.com"));
		assertFalse(testRegex.emailIsValid("@example.com"));
	}

	@Test
	void testPhoneNumbersValidation() throws Exception {
		Validation testRegex = new Validation();
		assertTrue(testRegex.phoneNumberIsValid("012-3456789"));

		assertFalse(testRegex.phoneNumberIsValid("0123456789"));
		assertFalse(testRegex.phoneNumberIsValid("012 3456789"));
		assertFalse(testRegex.phoneNumberIsValid("012 345 6789"));
		assertFalse(testRegex.phoneNumberIsValid("A12-3456789"));
	}

}
