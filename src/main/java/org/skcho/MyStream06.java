package org.skcho;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.StringJoiner;
import static java.util.stream.Collector.*;

/**
 * @author skcho
 * 
 * http://itpro.nikkeibp.co.jp/article/COLUMN/20140527/559532/?ST=develop&P=4
 *  
 */

import java.util.stream.DoubleStream;


public class MyStream06 {
	
	
	public static void main(String[] args){
		
		
		new MyStream06().stream();		
		
	}
	
	private void stream(){
		
		DoubleSummaryStatistics statistics = null;
		Random random = new Random();
		
		statistics = DoubleStream.generate(random::nextDouble)
		            .limit(1_000_000)
		            .mapToObj(d -> d)
		            .collect(Collectors.summarizingDouble(d -> d));
		
		
		System.out.println(statistics.getCount());
		System.out.println(statistics.getSum());
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getMin());
		System.out.println(statistics.getMax());
		
		
		statistics = DoubleStream.generate(random::nextDouble)
		                         .limit(1_000_000)
		                         .collect(DoubleSummaryStatistics::new,
		            		              //(r,d) -> r.accept(d),
		                        		  DoubleSummaryStatistics::accept,
		            		              //(r1,r2) -> r1.combine(r2));
		                        		  DoubleSummaryStatistics::combine);
		
		
		System.out.println(statistics.getCount());
		System.out.println(statistics.getSum());
		System.out.println(statistics.getAverage());
		System.out.println(statistics.getMin());
		System.out.println(statistics.getMax());
		
		
		List<String> list = Arrays.asList("alpha", "beta", "apple", "bridge", "application");
		StringJoiner joiner = null;
		String str = null;
		Collector<String,StringJoiner,String> collector = null;
		
		
		joiner = list.stream().collect(() -> new StringJoiner(",","[","]"),
				                       //(r,t) -> r.add(t),
				                       StringJoiner::add,
				                       //(r1,r2) -> r1.merge(r2));
				                       StringJoiner::merge);
		
		System.out.println(joiner.toString());
		
		
		collector = Collector.of(() -> new StringJoiner(",","[","]"),
		            		     StringJoiner::add,
		            		     StringJoiner::merge,
		            		     StringJoiner::toString,
		            		     Characteristics.CONCURRENT);
		
		
		str = list.stream().collect(collector);
		
		
		System.out.println(str);	
		
		
		
		
	}

}
