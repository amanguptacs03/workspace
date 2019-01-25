package com.assign.nugget_4;

import java.util.Comparator;

public class JoiningdateComparator implements Comparator<Employee> {

	

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getHire_date().compareTo(e2.getHire_date());
	}

}
