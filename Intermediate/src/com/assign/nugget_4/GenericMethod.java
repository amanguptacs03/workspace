package com.assign.nugget_4;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class GenericMethod {

	public static <T> void print(Collection<T> collection){
	
		Iterator<T> it=collection.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
	
	public static void main(String[] args) {
		
		List<String >arr=new ArrayList<String>();
		arr.add("aman");
		arr.add("is");
		arr.add("excellent");
		arr.add("coder");
		
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(2);
		
		Queue<Employee> queue=new PriorityQueue<Employee>();
		queue.add(new Employee(1, 1, 99999.00, "Mangesh", Date.valueOf("2019-01-10")));
		queue.add(new Employee(2, 1, 99999.00, "Aman", Date.valueOf("2019-01-10")));
		queue.add(new Employee(3, 1, 99999.00, "Roma", Date.valueOf("2019-01-10")));
		
	
		
		print(arr);
		System.out.println("--------------------------------------------------------------------");
		print(set);
		System.out.println("--------------------------------------------------------------------");
		print(queue);
		

	}
	
}
