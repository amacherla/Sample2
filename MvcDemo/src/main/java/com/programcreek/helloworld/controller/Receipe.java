package com.programcreek.helloworld.controller;

public class Receipe {
	
	public static void main(String[] args) {
		int[] proportions = {1,2,3}; 
		int[] remainingInGrams = {25,18,72}; // [16,0,45]
		
		int maxUnitSize = findMaxUnitSize(proportions, remainingInGrams );
		System.out.println("maxUnitSize : "+maxUnitSize);
		
		int[] result = {remainingInGrams[0]-maxUnitSize*proportions[0], remainingInGrams[1]-maxUnitSize*proportions[1], remainingInGrams[2]-maxUnitSize*proportions[2]};
		for(int i : result) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}

	private static int findMaxUnitSize(int[] proportions, int[] remainingInGrams) {
		
		for(int i=0;i<100;i++) {
			if(remainingInGrams[0] -proportions[0]*i== 0 ) {
				return i;
			}
			else if(remainingInGrams[1] -proportions[1]*i== 0) {
				return i;
			}
			else if(remainingInGrams[2] -proportions[2]*i== 0) {
				return i;
			}
		}
		
		return 0;
	}

}
