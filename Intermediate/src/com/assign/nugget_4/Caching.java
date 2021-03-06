package com.assign.nugget_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Caching {

	
	static Map<String, Integer> map=new HashMap<String, Integer>();
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s;
		while((s=obj.next())!=null){
			if(map.get(s)!=null)
				System.out.println(map.get(s));
			else{
			Set<Character> ch=new HashSet<Character>();
			char arr[]=s.toCharArray();
			for(char c:arr)
			ch.add(c);
			
			map.put(s, ch.size());
			System.out.println(map.get(s));
			}
		}
	}
}
