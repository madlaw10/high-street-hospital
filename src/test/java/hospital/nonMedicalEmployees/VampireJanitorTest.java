package hospital.nonMedicalEmployees;
import org.junit.Before;
import org.junit.Test;

import hospital.nonMedicalEmployees.VampireJanitor;

public class VampireJanitorTest {
	
	VampireJanitor underTest;
	
	@Before
	public void setup() {
		underTest = new VampireJanitor("", "000");
	}
	
	@Test
	public void shouldQuenchThirstBySuckingBlood() {
		
	}

}
