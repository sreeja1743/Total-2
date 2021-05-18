package streamsdemo;


import java.util.*;
import java.util.stream.Stream;

import day8.Employee;

public class StreamDemo {
	public static void main(String[] args) {
		StreamDemo s = new StreamDemo();
		s.createStream();
		s.terminal();
		
	}
	
	void createStream() {
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee("Sree", "101",20000);
		Employee e2 = new Employee("viditha","102",30000);
		Employee e3 = new Employee("vidisha","103",40000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		Stream<Employee> stream = list.stream();
		
		list = Arrays.asList(e1,e2,e3);
		
		Stream<Employee> s = Stream.of(e1,e2,e3);
	}
	
	void terminal() {
		List<Integer> list = Arrays.asList(1,122,3,30,4,10);
		int val = list.stream().max((i,j)->(i).compareTo(j)).get(); 
		System.out.println(val);
	}

}
