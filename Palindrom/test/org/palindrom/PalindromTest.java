package org.palindrom;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromTest {

	@Test
	void testGetPalindromByChars() {
		int result = Palindrom.getPalindromByChars();
		assertEquals(906609, result);
	
	}

	@Test
	void testIsPalindromByChars() {
		
		boolean trueResult = Palindrom.isPalindromByChars(11111);
		
		assertTrue(trueResult);
		
		boolean falseResult = Palindrom.isPalindromByChars(11122); 
		
		assertFalse(falseResult);
	}

}
