package net.qcollins;

public class BabySitter {

	private int bedTime;

	public BabySitter(int bedTime) {
		this.bedTime = bedTime;
	}

	public int getPay(int startTime, int endTime) {
		int pay = 0;
		if (endTime >= bedTime && startTime < bedTime) {
			pay += (endTime - bedTime) * 8;
		}
		if(startTime < bedTime && endTime >= bedTime) {
			pay += (bedTime - startTime) * 12;
		}
		if(startTime >= bedTime) {
			pay += (endTime - startTime) * 8;
		}
		if(endTime < bedTime) {
			pay += (endTime - startTime) * 12;
		}
		return pay;
	}
	
	
	

}
