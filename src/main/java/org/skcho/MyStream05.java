package org.skcho;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
		
		Map<String,List<String>> map = null;
		Map<String,Long> map1 = null;
		
		
		map = list.stream()
		          .collect(Collectors.groupingBy(w -> w.substring(0,1)));
		
		map1 = list.stream()
				   .collect(Collectors.groupingBy(w -> w.substring(0,1), 
						                          Collectors.counting()));
				  
		
		
		
		System.out.println(map);
		System.out.println(map1);
		
		
		
		
	}

}
