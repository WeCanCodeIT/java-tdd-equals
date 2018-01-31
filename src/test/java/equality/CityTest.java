package equality;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * <p>
 * These tests are named oddly to facilitate the exercise. Make them pass in
 * order, one at a time, in the simplest fashion.
 * </p>
 * 
 * <p>
 * City is a <em>value object</em>, so we define equality based on attribute
 * values.
 * </p>
 * 
 * <p>
 * We could have used <code>assertEquals</code> and <code>assertNotEquals</code>
 * below rather than <code>assertTrue</code> and <code>assertFale</code>.
 * </p>
 * 
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

	@Test
	public void _03_shouldNotBeEqualToNull() {
		assertFalse(underTest.equals(null));
	}

	@Test
	public void _04_shouldNotBeEqualIfNameIsDifferent() {
		City cleveland = new City("Cleveland", "OH");

		assertFalse(underTest.equals(cleveland));
	}

}
