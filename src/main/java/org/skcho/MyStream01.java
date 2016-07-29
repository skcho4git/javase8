package org.skcho;

/**
 * @author skcho
 * http://itpro.nikkeibp.co.jp/article/COLUMN/20140422/552422/?ST=develop&P=12
 */

import java.util.stream.DoubleStream;


public class MyStream01 {
	
	
	public static void main(String[] args){
		
		
		new MyStream01().stream();		
		
	}
	
	private void stream(){		
		
		
		DoubleStream.iterate(0.0, x -> x + 1.0)
		            .limit(10)
		            .forEach(System.out::println);
		           
		
		
	}

}
