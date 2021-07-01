package com.demo.repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	
	public List<Movie> findByActiveTrueAndDateOfLaunchBefore(Date date);

}