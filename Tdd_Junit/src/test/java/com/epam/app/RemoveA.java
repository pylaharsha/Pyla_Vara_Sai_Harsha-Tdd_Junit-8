package com.epam.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveA {
	
	/*
	 * "ABCD" => "BCD"
	 * "AACD" => "CD"
	 * "BACD" => "BCD"
	 * "BBAA" => "BBAA"
	 * "AABAA" => "BAA"
	 */

	@Test
	void test1char() {
		Remove_A rm = new Remove_A();
		String actual = rm.remove("ABCD");
		assertEquals("BCD", actual);
	}
	
	@Test
	void test2char() {
		Remove_A rm = new Remove_A();
		String actual = rm.remove("AACD");
		assertEquals("CD", actual);
	}
	
	@Test
	void testMiddlechar() {
		Remove_A rm = new Remove_A();
		String actual = rm.remove("BACD");
		assertEquals("BCD", actual);
	}
	
	@Test
	void testNochar() {
		Remove_A rm = new Remove_A();
		String actual = rm.remove("");
		assertEquals("", actual);
	}
	
	@Test
	void testLastchar() {
		Remove_A rm = new Remove_A();
		String actual = rm.remove("BBAA");
		assertEquals("BBAA", actual);
	}
	
	@Test
	void testMultichar() {
		Remove_A rm = new Remove_A();
		String actual = rm.remove("AABAA");
		assertEquals("BAA", actual);
	}
	
}
