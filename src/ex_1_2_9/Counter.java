package ex_1_2_9;

public class Counter {
	private long totalCount = 0;

	public String toString(){
		return String.valueOf(totalCount);
		
	}
	
	
	public long getTotalCount() {
		return totalCount;
	}

	public void incrementTotalCount() {
		totalCount++;

	}

}
