package org.skcho;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

/**
 * @author skcho
 * 
 * http://itpro.nikkeibp.co.jp/article/COLUMN/20140527/559484/?ST=develop&P=7
 *  
 */



public class MyStream05 {
	
	
	public static void main(String[] args){
		
		
		new MyStream05().stream();		
		
	}
	
	private void stream(){
		
		List<String> list = Arrays.asList("alpha", "beta", "apple", "bridge", "application");
		
		Map<String,List<String>> map00 = null;
		Map<String,Long> map01 = null;
		Map<String,Integer> map02 = null;
		ConcurrentMap<String,List<String>> map03 = null;
		int count = 0;
		
		
		
		map00 = list.stream()
		          .collect(Collectors.groupingBy(w -> w.substring(0,1)));
		
		System.out.println(map00);
		
		map01 = list.stream()
				   .collect(Collectors.groupingBy(w -> w.substring(0,1), 
						                          Collectors.counting()));	
		
		
		System.out.println(map01);
		
		
		map02 = list.stream()
				    .collect(Collectors.groupingBy(w -> w.substring(0,1),
				    		                       Collectors.summingInt(w -> ((String)w).length())));
		
		
		System.out.println(map02);
		
		
		map03 = list.parallelStream()
				    .collect(Collectors.groupingByConcurrent(w -> w.substring(0,1)));
				    //.collect(Collectors.toConcurrentMap(w -> w.substring(0,1), w -> w));
		
		
		System.out.println(map03);
		
		
		
		count = list.stream()
				     .collect(Collectors.summingInt(w -> w.length()));
			
		
		System.out.println(count);
		
		
		count = list.stream()
				    .mapToInt(w -> w.length())
				    .sum();
		
		System.out.println(count);
		
		
		
		
	}

}
