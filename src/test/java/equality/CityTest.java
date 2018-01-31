package equality;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * These tests are named oddly to facilitate the exercise. Make them pass in
 * order, one at a time, in the simplest fashion.
 * 
 * City is a <em>value object</em>, so we define equality based on state (attribute values).
 */
public class CityTest {

	private City underTest = new City("Columbus", "OH");

	/**
	 * This test already passes. <em>Why?</em>
	 */
	@Test
	public void _01_shouldBeEqualToItself() {
		assertTrue(underTest.equals(underTest));
	}
	
	@Test
	public void _02_shouldBeEqualToCityWithSameValues() {
		City equivalent = new City("Columbus", "OH");
		
		assertTrue(underTest.equals(equivalent));
	}
}
