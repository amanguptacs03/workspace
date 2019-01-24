package com.assign.collection.two;


import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	
	
	
	public static void main(String[] args) throws ParseException {
		Movie mi=new Movie();
		List<Movie> ll=mi.createMovieList();
		System.out.println(ll);
		
		mi.sortByLanguageThenByReleaseDate(ll);
		
	}
	
	
}
