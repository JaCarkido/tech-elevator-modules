package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {
	
	
	
	public int[] factorize(int num) {
		List<Integer> factors = new ArrayList<Integer>();
		
		
		if(num > 1){
			for(int i = 2; i < num; i++) {
				if (num % i == 0) {
					factors.add(i);
					num = num / i;
					i = 2;
				}
			}
			
			int[] result = new int[factors.size()];
			
			for(int i = 0; i < factors.size(); i++) {
				result[i] = factors.get(i).intValue();
			}
			
			 return result;
			
			//System.out.println("result array: " +result);
			//return result;
			
		}
		
		
		return null ;
		
	}
}









