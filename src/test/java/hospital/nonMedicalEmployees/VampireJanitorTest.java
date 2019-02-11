package hospital.nonMedicalEmployees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import hospital.Hospital;

public class VampireJanitorTest {

	VampireJanitor underTest;
	Hospital testHospital;

	@Before
	public void setup() {
		underTest = new VampireJanitor("Kelso", "000");
		testHospital = new Hospital();
	}

	@Test
	public void shouldPeriodicallyDehydrateByOne() {
		int loopCount = 5;
		int testThirstBefore = underTest.getThirstLevel();
		underTest.dehydratesByOne(loopCount);
		int testThirstAfter = underTest.getThirstLevel();
		assertEquals(testThirstBefore + 1, testThirstAfter);
	}

	@Test
	public void shouldQuenchThirstBySuckingBlood() {
		int loopCount = 5;
		underTest.dehydratesByOne(loopCount);
		underTest.suckBlood(testHospital.getPatients());
		int testThirstAfter = underTest.getThirstLevel();
		assertEquals(0, testThirstAfter);
	}

}
