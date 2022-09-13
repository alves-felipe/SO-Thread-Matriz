package controller;

public class Sum extends Thread {

	int[] array;
	
	public Sum(int[] array) {
		this.array = array;
	}
	
	@Override
	public void run() {
		int sum = 0;
		
		for(int num : array) {
			sum += num;
		}
		
		System.out.println("id #"+getId()+ " - soma: "+sum);
	}
}
