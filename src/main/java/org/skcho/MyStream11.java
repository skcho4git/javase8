package org.skcho;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * @author skcho
 * 
 * http://itpro.nikkeibp.co.jp/atcl/column/14/224071/072300003/?ST=develop&P=2
 *  
 */

public class MyStream11 {
	
	
	public static void main(String[] args){
		
		
		new MyStream11().stream();	
		
	}
	
	private void stream(){	
		
		OptionalInt optional01 = IntStream.range(0,10)
				                          .findFirst();
		
		optional01.ifPresent(System.out::println);
		
		
		OptionalInt optional02 = IntStream.range(0, 10)
				                          .findAny();
		
		
		optional02.ifPresent(System.out::println);
		
		
		
		
		
		
	}
		
		
		

}
