/**
 * @author Nova Robb
 * CEN 3024
 */
package application;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit test for the Text Analyzer application
 */
class MainTest {

	@Test
	void testAnalyzeTextFromPoemWebsite() {
		Main m = new Main();
		try {
			ArrayList<WordStat> stats = m.AnalyzeTextFromPoemWebsite("https://www.gutenberg.org/files/1065/1065-h/1065-h.htm");
			assertEquals("the", stats.get(0).word, "Most frequent word should be 'the'.");
			assertEquals(56, stats.get(0).count, "Most frequent word should have a count of 56.");
		} catch (IOException e) {
			fail("An exception was thrown, but was not expected! " + e);
		}
	}

}
