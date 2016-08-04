package org.skcho;



import java.util.Arrays;
import java.util.List;

/**
 * @author skcho
 * 
 *  http://itpro.nikkeibp.co.jp/article/COLUMN/20140623/566070/?ST=develop&P=3
 *  
 */

import java.util.stream.DoubleStream;


public class MyStream08 {
	
	
	public static void main(String[] args){
		
		
		new MyStream08().stream();		
		
	}
	
	private void stream(){
		
		List<String> words = Arrays.asList("Echo", "Alpha", "Coca", "Bravo", "Foxtrot", "Delta");
		
		
		long count = words.stream()
		                  .filter(w -> w.length() > 4)
		                  .peek(System.out::println)
		                  .count();	
		
		
		System.out.println(count);
		
		
		
		
	}

}
