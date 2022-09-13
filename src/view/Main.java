package view;

import controller.Sum;

public class Main {
	
	public static void main(String[] args) {
		int[][] array = createArray();
		
		
		for(int i = 0; i < 3; i++) {
			Sum s = new Sum(array[i]);
			s.start();
		}
	}
	
	
	private static int[][] createArray() {
		int[][] array = new int[3][5];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				array[i][j] = (int) ((Math.random() * 10) + 1);
			}
		}
		
		return array;
	}

}
