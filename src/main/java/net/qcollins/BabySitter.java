package net.qcollins;

public class BabySitter {
	
	private int bedTime;

	public BabySitter(int bedTime) {
		this.bedTime = bedTime;
	}

	public Object getPay(int startTime, int endTime) {
		return (endTime - startTime)*12;
	}

}
