package com.assign.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieList {
	public List<Movie> createMovieList() {
		Scanner obj = new Scanner(System.in);
		List<Movie> movieList = new ArrayList<Movie>();
		String name,language,director,producer,duration,releaseDate;
		 int i=0;
		 while(i<3)
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
		 System.out.println("enter duration of the movie");
		 duration=obj.next();
		 System.out.println("enter release date of the movie");
		 obj.nextLine();
		 releaseDate=obj.nextLine();
		 
		 Movie newMovie=new Movie(name,language,director,producer,duration,releaseDate);	 
		 movieList.add(newMovie);
		 i++;
		}
		return movieList;

	}
}
