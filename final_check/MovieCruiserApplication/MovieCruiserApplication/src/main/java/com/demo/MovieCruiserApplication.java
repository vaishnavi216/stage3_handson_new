package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Movie;
import com.demo.service.MovieService;
import com.demo.util.DateUtil;

@SpringBootApplication
public class MovieCruiserApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieCruiserApplication.class);

	private static MovieService movieService;

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(MovieCruiserApplication.class, args);
		movieService = context.getBean(MovieService.class);
		
		LOGGER.info("Inside Main...........");
		
		testGetMovieListAdmin();
		testGetMovieListCustomer();
		testModifyMovie();
		testGetMovie();
		testSaveAllMovies();
	}
	
	 private static void testGetMovieListAdmin() {
	    	LOGGER.info("Start");
	    	
	    	List<Movie> movieListAdmin = movieService.getMovieListAdmin();
	    	LOGGER.info("-----------------------------Movies List---------------------------");
	    	LOGGER.debug("Movies: {}",movieListAdmin);
	    	for(Movie m:movieListAdmin)
	    	{
	    		System.out.println(m);
	    	}
	    	LOGGER.info("End");
	    }
	 
	 private static void testGetMovieListCustomer() {
	    	LOGGER.info("Start");
	    	
	    	List<Movie> movieList = movieService.getMovieListCustomer();
	    	LOGGER.info("-----------------Customer Active Movies---------------------------");
	    	LOGGER.debug("Movies: {}",movieList);
	    	for(Movie m:movieList)
	    	{
	    		System.out.println(m);
	    	}
	    	LOGGER.info("End");
	    }
	 
	 private static void testModifyMovie() {
	    	LOGGER.info("Start");
	    	
	    	Movie newMovie =new Movie(2,"Spider Man","$1,518,812,988",true,DateUtil.convertToDate("29/08/2019"),"Fictional",true);
	    	movieService.modifyMovie(newMovie);
	    	
	    	LOGGER.info("-----------------Movie Updated----------------------------");
	    	LOGGER.debug("Update Success : updated Movie : {}",newMovie);
	    	System.out.println(newMovie);
	    	LOGGER.info("End");
	    }
	 
	 private static void testGetMovie() {
		 
		 LOGGER.info("Start");
	    	
		 Movie movie = movieService.getMovie(5);
		 
		 LOGGER.info("-----------------Movie with id 5----------------------------");
		 LOGGER.debug("Movie : {}",movie);
		 System.out.println(movie);
		 LOGGER.info("End");
		 
	 }
	 
	 private static void testSaveAllMovies() {
		 
		 LOGGER.info("Start");
		 
		 Movie movie;
		 List<Movie> saveMovieList = new ArrayList<>();

		 movie = new Movie(6, "Frozen", "$2,787,965,087", true, DateUtil.convertToDate("02/09/2017"), "Fiction",true);
		 saveMovieList.add(movie);
		
		 movie = new Movie(7, "Captain Marvel", "$1,518,812,988", true, DateUtil.convertToDate("12/04/2018"), "Fiction",false);
		 saveMovieList.add(movie);
			
		 movieService.save(saveMovieList);
		 
		 LOGGER.info("-----------------Movies Saved----------------------------");
		 
		 LOGGER.info("End");
		 
		 
	 }

	
}

