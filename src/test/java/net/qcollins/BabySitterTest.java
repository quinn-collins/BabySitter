package net.qcollins;

import org.junit.Assert;
import org.junit.Test;


public class BabySitterTest {
	

	@Test
	public void whenBedtimeIsSevenAndStartTimeIsFiveBabySitterMakesTwentyFour() {
		BabySitter sitter = new BabySitter(7);
		Assert.assertEquals(24, sitter.getPay(5, 7));
	}
	
	@Test
	public void whenBedTimeIsEightAndStartIsFiveBabySitterMakesThirtyTwo() {
		BabySitter sitter = new BabySitter(8);
		Assert.assertEquals(36, sitter.getPay(5, 8));
	}
	
	@Test
	public void whenBedTimeIsTenAndBabySitterWorksFromBedTimeToMidnightTheyMakeSixteen() {
		BabySitter sitter = new BabySitter(10);
		Assert.assertEquals(16, sitter.getPay(10, 12));
	}
	
	@Test
	public void whenStartTimeIsFiveBedTimeIsEightAndEndTimeIsMidnightGetsPaidTwelveFromStartToBedAndEightFromBedToMidnight() {
		BabySitter sitter = new BabySitter(8);
		Assert.assertEquals(68, sitter.getPay(5, 12));
	}
	
	@Test
	public void startAfterBedTimeResultsInOnlyBedTimePay() {
		BabySitter sitter = new BabySitter(8);
		Assert.assertEquals(24, sitter.getPay(9, 12));
	}
	
	@Test
	public void endTimeBeforeBedTimeResultsInOnlyBeforeBedTimePay() {
		BabySitter sitter = new BabySitter(9);
		Assert.assertEquals(36, sitter.getPay(5, 8));
	}
	
	@Test
	public void paidSixteenAnHourBetweenMidnightAndFour() {
		BabySitter sitter = new BabySitter(8);
		Assert.assertEquals(32, sitter.getPay(12, 14));
	}

}
