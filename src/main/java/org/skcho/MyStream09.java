package org.skcho;



import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collector.*;

/**
 * @author skcho
 * 
 * http://itpro.nikkeibp.co.jp/article/COLUMN/20140623/566070/?ST=develop&P=5
 *  
 */





public class MyStream09 {
	
	
	public static void main(String[] args){
		
		
		new MyStream09().stream();		
		
	}
	
	private void stream(){
		
		List<String> words1 = Arrays.asList("Echo", "Alpha", "Coca");
	    List<String> words2 = Arrays.asList("Bravo", "Foxtrot", "Delta");
	    List<String> words3;
	    String str;
	    
	    
	    words3 = Stream.concat(words1.stream(), words2.stream())
	                   .peek(System.out::println)
	                   .sorted()
	                   .collect(Collectors.toList());
	    
	    
	    System.out.println(words3);
	    
	    
	    
	    IntStream integer1 = IntStream.range(0, 5);
	    IntStream integer2 = IntStream.range(5, 10);
	    
	    /*str = IntStream.concat(integer1,integer2)
	                   .mapToObj(String::valueOf)
	                   .collect(Collectors.joining(",","[","]"));
	    
	    System.out.println(str);*/
	    
	    
	    Collector<String,StringJoiner,String> collector = Collector.of(() -> new StringJoiner(",","[","]"),
	    		                                                       //(j,i) -> j.add(i),
	    		                                                       StringJoiner::add,
	    		                                                       //(j1,j2) -> j1.merge(j2),
	    		                                                       StringJoiner::merge,
	    		                                                       //j -> j.toString(),
	    		                                                       StringJoiner::toString,
	    		                                                       Characteristics.CONCURRENT);
	    
	    
	    
	    
	    
	    str = IntStream.concat(integer1,integer2)
	                   .mapToObj(String::valueOf)
	                   .collect(collector);    
	    
	    
	    		                                                        
	    		                                                        
	    
	    System.out.println(str);
	    
	             
	    
	    
	    
	    
	    
	    

		
		
				
		
		
		
		
		
	}

}
