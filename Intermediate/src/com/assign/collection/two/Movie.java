package com.assign.collection.two;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Movie implements Comparable<Movie> {

	private  String name, language,  director, producer;
	private long duration;
	private   Date releaseDate;
	
	
	
	
	public Movie() {
		super();
	}


	public long getDuration() {
		return duration;
	}


	public void setDuration(long duration) {
		this.duration = duration;
	}


	public Movie(String name, String language, String director, String producer,long  duration, Date releaseDate) {
		super();
		this.name = name;
		this.language = language;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
		this.releaseDate = releaseDate;
	}
	
	
	public List<Movie> createMovieList() throws ParseException{
		Scanner obj =new Scanner(System.in);
		List<Movie> movieList=new ArrayList<Movie>();
		int i=0;
		while(i<2)
		{
		System.out.println("Enter name of the movie");
		name=obj.nextLine();
		System.out.println("Enter language of the movie");
		language=obj.next();
		System.out.println("Enter name of the Director");
		obj.nextLine();
		director=obj.nextLine();
		System.out.println("Enter name of the Producer");
		producer=obj.nextLine();
		System.out.println("enter duration of the movie in minutes");
		duration=obj.nextLong();
		System.out.println("enter release date of the movie dd/mm/yyyy");
		 obj.nextLine();
		 releaseDate=new SimpleDateFormat("dd/M/yyyy").parse(obj.nextLine());
		 
		Movie m=new Movie(name, language, director, producer, duration, releaseDate);
		 movieList.add(m);	
		 i++;
		}
		
		 return movieList;
		
		
	}
	public   void sortByLanguageThenByReleaseDate(List<Movie> movieList) {
		Collections.sort(movieList);
		System.out.println(movieList);
	}
	
	public void sortByDuration(List<Movie> movieList) {
		Collections.sort(movieList, new DurationComparator());
		System.out.println(movieList);
	}

	@Override
	public String toString() {
		return name+","+ language+","+  director+","+ producer+","+ duration+","+releaseDate;
	}

	@Override
	public int compareTo(Movie m) {
		
		if(language.compareTo(m.language)==0)
			return releaseDate.compareTo(m.releaseDate);
		
		return language.compareTo(m.language);
	}
	
}
