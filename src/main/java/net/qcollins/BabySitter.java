package net.qcollins;

public class BabySitter {

	private int bedTime;

	public BabySitter(int bedTime) {
		this.bedTime = bedTime;
	}

	public int getPay(int startTime, int endTime) {
		return getHoursBetweenStartAndBedTime(startTime, endTime) * 12
				+ getHoursBetweenBedTimeAndMidnight(startTime, endTime) * 8
				+ getHoursBetweenMidnightAndEndTime(startTime, endTime) * 16;
	}

	private int getHoursBetweenStartAndBedTime(int startTime, int endTime) {
		if (startTime >= bedTime) {
			return 0;
		}
		if (endTime <= bedTime) {
			return endTime - startTime;
		}
		return bedTime - startTime;

	}

	private int getHoursBetweenBedTimeAndMidnight(int startTime, int endTime) {
		if (bedTime >= 12 || endTime <= bedTime) {
			return 0;
		}
		if (startTime >= bedTime) {
			return 12 - startTime;
		}
		return 12 - bedTime;
	}

	private int getHoursBetweenMidnightAndEndTime(int startTime, int endTime) {
		if (endTime <= 12) {
			return 0;
		}
		if (startTime > 12) {
			return endTime - startTime;
		}
		return endTime - 12;
	}

}
