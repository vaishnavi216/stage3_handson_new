package com.demo.service;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Movie;
import com.demo.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<Movie> getMovieListAdmin() {
		return movieRepository.findAll();
	}

	public List<Movie> getMovieListCustomer() {
		return movieRepository.findByActiveTrueAndDateOfLaunchBefore(new Date());
	}

	public void modifyMovie(Movie movie) {
		movieRepository.save(movie);
	}

	public Movie getMovie(long Id) {
		return movieRepository.findById(Id).get();
	}

	public void save(List<Movie> moviesList) {
		movieRepository.saveAll(moviesList);
	}

}