package net.qcollins;

import org.junit.Assert;
import org.junit.Test;


public class BabySitterTest {
	

	@Test
	public void whenBedtimeIsSevenAndStartTimeIsFiveBabySitterMakesTwentyFour() {
		BabySitter sitter = new BabySitter(19);
		Assert.assertEquals(24, sitter.getPay(17, 19));
	}
	
	@Test
	public void whenBedTimeIsEightAndStartIsFiveBabySitterMakesThirtyTwo() {
		BabySitter sitter = new BabySitter(20);
		Assert.assertEquals(36, sitter.getPay(17, 20));
	}

}
