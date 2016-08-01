package org.skcho;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author skcho
 * 
 * http://itpro.nikkeibp.co.jp/article/COLUMN/20140527/559484/?ST=develop&P=5
 *  
 */



public class MyStream04 {
	
	
	public static void main(String[] args){
		
		
		new MyStream04().stream();		
		
	}
	
	private void stream(){
		
		
		List<Integer> list = IntStream.iterate(0,x -> x + 1)
				                      .limit(10)
		                              .mapToObj(n -> n)
		                              .collect(Collectors.toList());
		
		
		list.stream()
		    .forEach(System.out::println);
		
		
		List<String> list2 = Arrays.asList("a","b","c");
		
		
		
		
		
		
		
		
		
		
		
	}

}
