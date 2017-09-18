package net.qcollins;

public class BabySitter {

	private int bedTime;

	public BabySitter(int bedTime) {
		this.bedTime = bedTime;
	}

	public int getPay(int startTime, int endTime) {
		int pay = 0;
		pay += getHoursBetweenStartAndBedTime(startTime, endTime) * 12 +
				getHoursBetweenBedTimeAndEndTime(startTime, endTime) * 8;
		return pay;
	}

	private int getHoursBetweenBedTimeAndEndTime(int startTime, int endTime) {
		if(endTime < bedTime) {
			return 0;
		}
		if(startTime >= bedTime) {
			return endTime - startTime;
		}
		return endTime - bedTime;
	}

	private int getHoursBetweenStartAndBedTime(int startTime, int endTime) {
		if(startTime > bedTime) {
			return 0;
		}
		if(endTime < bedTime) {
			return endTime - startTime;
		}
		return bedTime - startTime;
		
	}
	
	
	

}
