package com.assign.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Movie implements Comparable<Movie> {

	private  String name, language, director, producer, duration;
	private String releaseDate;

	

	

	public Movie() {
		super();
	}

	public Movie(String name, String language, String director,
			String producer, String duration, String releaseDate) {
		super();
		this.name = name;
		this.language = language;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
		this.releaseDate = releaseDate;
	}

	

	public void sortByLanguage(List<Movie> movieList) {
		Collections.sort(movieList);
		System.out.println(movieList);
	}

	@Override
	public String toString() {
		return name + "," + language + "," + director + "," + producer + ","
				+ duration + "," + releaseDate;
	}

	@Override
	public int compareTo(Movie m) {

		return language.compareTo(m.language);
	}

}
