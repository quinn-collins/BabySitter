package net.qcollins;

public class BabySitter {

	private int bedTime;

	public BabySitter(int bedTime) {
		this.bedTime = bedTime;
	}

	public int getPay(int startTime, int endTime) {
		return (bedTime - startTime) * 12 + (endTime - bedTime) * 8;
			
	}

}
