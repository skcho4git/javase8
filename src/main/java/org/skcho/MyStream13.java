package org.skcho;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author skcho
 * 
 * http://itpro.nikkeibp.co.jp/atcl/column/14/224071/113000012/
 *  
 */

public class MyStream13 {
	
	
	public static void main(String[] args){
		
		
		new MyStream13().stream();	
		
	}
	private void stream(){
		
		
		
		
		 int[] numbers = {3,4,1,6,0,2};
		 
		 
		 Arrays.parallelSort(numbers);
		 
		 
		 System.out.println(numbers);
		 
		 Arrays.parallelPrefix(numbers, (s,n) -> s + n);
		 
		 System.out.println(numbers);
		 
		 
		 double[] doubles = {3,4,1,6,0,2};
		 
		 Arrays.parallelSetAll(doubles, index -> index);
		 
		 System.out.println(doubles);
		 
		 
		 /*List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		 
		 list.removeIf(x -> x % 2 == 0);
		 
		 System.out.println(list);*/
		 
		 
		 Map<String,String> maps = new HashMap<> ();
		 
		 
		 maps.put( "lemon", "黄" );
		 maps.put( "greap", "紫" );
		 maps.put( "pear", "緑" );
		 
		 
		 maps.forEach((k,v) -> System.out.println(k + ":" + v));
		 
		 maps.replaceAll((k,v) -> k + ":" + v);
		 System.out.println(maps);
		 
		 System.out.println(maps.getOrDefault("lemon", "fuo"));
		 System.out.println(maps.getOrDefault("hoge", "fuo"));
		 
		 
		 maps.putIfAbsent("hoge", "fuo");
		 
		 System.out.println(maps);
		 
		 maps.computeIfAbsent("hoge2", k -> k + "fuo");
		 System.out.println(maps.getOrDefault("hoge2", ""));
		 
		 
		 Map<String, String> map1 = new HashMap<>();
	     map1.put("a", "A");
	     map1.put("b", "B");

	     Map<String, String> map2 = new HashMap<>();
	     map2.put("a", "alpha");
	     map2.put("b", "beta");
	     map2.put("c", "charlie");
	        
	     // マップのマージ
	     //map2.forEach((k, v) -> map1.merge(k, v, (o, n) -> o + ":" + n));
	     map2.forEach((k,v) -> map1.merge(k, v, (o,n) -> o));
	     
	     System.out.println(map1);
		
	}
		
		
		

}
