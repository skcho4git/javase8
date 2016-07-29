package org.skcho;

/**
 * @author skcho
 * 
 */

import java.util.stream.DoubleStream;


public class MyStream02 {
	
	
	public static void main(String[] args){
		
		
		new MyStream02().stream();		
		
	}
	
	private void stream(){		
		
		
		//DoubleStream.generate(Math::random)
		DoubleStream.generate(() -> Math.random())
		            .limit(20)
		            .forEach(System.out::println);
		
		
		
		           
		
		
	}

}
