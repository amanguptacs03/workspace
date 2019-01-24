package com.assign.collection.two;

import java.util.Comparator;

public class DurationComparator implements Comparator<Movie>{

	

	@Override
	public int compare(Movie lhs, Movie rhs) {
		
		return (int) (lhs.getDuration()-rhs.getDuration());
	}

}
