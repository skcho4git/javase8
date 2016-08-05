package org.skcho;

import java.util.Optional;

/**
 * @author skcho
 * 
 * http://itpro.nikkeibp.co.jp/atcl/column/14/224071/072300002/?ST=develop&P=2
 *  
 */

public class MyStream10 {
	
	
	public static void main(String[] args){
		
		
		new MyStream10().stream();		
		
	}
	
	private void stream(){
		
		
		String text = "Hello, Java!";
		
		Optional<String> optional01 = Optional.of(text);
		Optional<String> optional02 = Optional.ofNullable(text);
		
		System.out.println(optional01.get());
		System.out.println(optional02.get());
		
		
		text = null;
		
		//NullPointerException
		//Optional<String> optional03 = Optional.of(text);
		
		Optional<String> optional04 = Optional.ofNullable(text);
		
		//NoSuchElementException
		//System.out.println(optional03.get());
		//System.out.println(optional04.get());
		
		
		System.out.println(optional04.orElse("No text1!!"));
		System.out.println(optional04.orElseGet(() -> "No text2!!"));
		
		
		Optional<String> optional05 = Optional.empty();		
		
		//NoSucheElementException
		//System.out.println(optional05.get());
		System.out.println(optional05.orElse("No text3!!"));
		System.out.println(optional05.orElseGet(() -> "No text4!!"));
		
		
		try{
			
			System.out.println(optional05.orElseThrow(() -> new Exception("No text5!!")));
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}		
		
		optional02.ifPresent(System.out::println);
		optional04.ifPresent(System.out::println);
		optional05.ifPresent(System.out::println);	
		
		
		Optional<Student> optional06 = Optional.of(new Student("James",3));
		
		optional06.filter(studnet -> studnet.getGrade() == 3)
		          .ifPresent(student -> System.out.println(student.getName()));
		
		optional06.filter(student -> student.getGrade() == 3)
		          .map(student -> student.getName())
		          .ifPresent(System.out::println);
		
		
		
	}
	

	static class Student implements Cloneable{	
		
		
		private String name;
		private int grade;
		
		public Student(){
			
		}		
		public Student(String name,int grade){
			
			this.name = name;
			this.grade = grade;
		}
		
		public void setName(String name){
			
			
		}
		
		public void setGrade(int grade){
			
			this.grade = grade;
			
			
		}
		
		public String getName(){
			
			return name;
			
		}
		
		
		public int getGrade(){
			
			return grade;		
			
		}
		
	}

}
