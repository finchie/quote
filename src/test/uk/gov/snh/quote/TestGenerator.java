package uk.gov.snh.quote;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGenerator {
	
	private static final int START = 0;
	private static final int MID = 87;
	private static final int END = Generator.quotes.length - 1;
	private static final int LENGTH = Generator.quotes.length;
	
	private static final String QUOTE_START = Generator.quotes[START];
	private static final String QUOTE_MID = Generator.quotes[MID];
	private static final String QUOTE_END = Generator.quotes[END];

	@Test
	void testNext() {
		Generator gen = new Generator();
		String next = gen.next();
		
		assertTrue("next quote is not null or empty", next != null && !"".equals(next));
	}

	@Test
	void testRandom() {
		Generator gen = new Generator();
		String random = gen.random();
		
		assertTrue("random quote is not null or empty", random != null && !"".equals(random));
	}

	@Test
	void testGetRandomIndex() {
		Generator gen = new Generator();
		int index;
		
		for (int i = 0; i < 100000; i++) {
			index = gen.getRandomIndex();

			assertTrue("index is greater than or equal to zero", index >= 0);
			assertTrue("index is less than the number of quotes", index < Generator.quotes.length);
		}
	}

	@Test
	void testGetQuoteAtFirstIndex() {
		Generator gen = new Generator();

		assertEquals(QUOTE_START, gen.getQuoteAtIndex(START));
	}

	@Test
	void testGetQuoteAtMidIndex() {
		Generator gen = new Generator();

		assertEquals(QUOTE_MID, gen.getQuoteAtIndex(MID));
	}

	@Test
	void testGetQuoteAtLastIndex() {
		Generator gen = new Generator();

		assertEquals(QUOTE_END, gen.getQuoteAtIndex(END));
	}

	@Test
	void testGetQuoteAtOverflowIndex() {
		Generator gen = new Generator();

		assertEquals(QUOTE_MID, gen.getQuoteAtIndex(LENGTH + MID));
	}

	@Test
	void testindexWrapAround() {
		Generator gen = new Generator();

		assertEquals(START, gen.indexWrapAround(START));
		assertEquals(MID, gen.indexWrapAround(MID));
		assertEquals(END, gen.indexWrapAround(END));
		assertEquals(START, gen.indexWrapAround(LENGTH));
		assertEquals(MID, gen.indexWrapAround(LENGTH + MID));
	}

}
