package org.skcho;

import java.util.Arrays;
import java.util.List;

/**
 * @author skcho
 * 
 * http://itpro.nikkeibp.co.jp/article/COLUMN/20140422/552431/?ST=develop&P=10
 *  
 */



public class MyStream03 {
	
	
	public static void main(String[] args){
		
		
		new MyStream03().stream();		
		
	}
	
	private void stream(){
		
		
		List<String> list = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
		
		//String[] hoge = (String[])list.toArray();
		
		Integer sum = list.stream()
				          //.map(x -> Integer.valueOf(x))
				          .map(Integer::valueOf)
		                  .reduce(0,(x1, x2) -> x1 + x2);
		
		System.out.println(sum);
		
		
		int sum1 = list.stream()
				           .mapToInt(Integer::parseInt)
				           .reduce(0, (x,y) -> x + y);
		
		
		System.out.println(sum1);
		
		
		
		
	}

}
