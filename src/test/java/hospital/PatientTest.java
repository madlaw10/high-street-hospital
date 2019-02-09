package hospital;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PatientTest {

	Patient underTest;

	@Before
	public void setup() {
		underTest = new Patient("Harvey", "1234");
	}

	@Test
	public void shouldBeNamedHarvey() {
		String testName = underTest.getName();
		assertEquals("Harvey", testName);
	}

	@Test
	public void shouldHaveIDNumber1234() {
		String testIDNumber = underTest.getPatientID();
		assertEquals("1234", testIDNumber);
	}

	@Test
	public void shouldHaveBloodLevelOfTwenty() {
		int testBlood = underTest.getBloodLevel();
		assertEquals(20, testBlood);
	}

	@Test
	public void shouldHaveHealthLevelOfTen() {
		int testHealth = underTest.getHealthLevel();
		assertEquals(10, testHealth);
	}

	@Test
	public void shouldLoseHealthByOne() {
		int testHealthBefore = underTest.getHealthLevel();
		underTest.drainHealthByOne();
		int testHealthAfter = underTest.getHealthLevel();
		assertEquals(testHealthBefore - 1, testHealthAfter);
	}

	@Test
	public void shouldLoseBloodByOne() {
		int testBloodBefore = underTest.getBloodLevel();
		underTest.drainBloodByOne();
		int testBloodAfter = underTest.getBloodLevel();
		assertEquals(testBloodBefore - 1, testBloodAfter);
	}

	@Test
	public void shouldBeHealedToTen() {
		underTest.drainHealthByOne();
		underTest.returnHealthToTen();
		int testHealthAfter = underTest.getHealthLevel();
		assertEquals(10, testHealthAfter);
	}

	@Test
	public void shouldHaveBloodReplenishedToTwenty() {
		underTest.drainBloodByOne();
		underTest.returnBloodToTwenty();
		int testBloodAfter = underTest.getBloodLevel();
		assertEquals(20, testBloodAfter);
	}

	@Test
	public void shouldPeriodciallyLoseHealthByOne() {
		int loopCount = 5;
		int testHealthBefore = underTest.getHealthLevel();
		underTest.conditionWorsens(loopCount);
		int testHealthAfter = underTest.getHealthLevel();
		assertEquals(testHealthBefore - 1, testHealthAfter);
	}

}
