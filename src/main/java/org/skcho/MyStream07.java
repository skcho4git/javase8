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


public class MyStream07 {
	
	
	public static void main(String[] args){
		
		
		new MyStream07().stream();		
		
	}
	
	private void stream(){
		
		List<String> words = Arrays.asList("Echo", "Alpha", "Coca", "Bravo", "Foxtrot", "Delta");
		boolean b1,b2,b3;
		
		b1 = words.stream().allMatch(w -> w.contains("a"));
		b2 = words.stream().anyMatch(w -> w.contains("a"));
		b3 = words.stream().noneMatch(w -> w.contains("a"));
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		

		
		
		
		
		
		
	}

}
