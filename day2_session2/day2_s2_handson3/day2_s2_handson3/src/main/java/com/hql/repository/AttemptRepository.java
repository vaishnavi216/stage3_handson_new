package com.hql.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hql.model.Attempt;

public interface AttemptRepository extends JpaRepository<Attempt, String>{
	
	@Query(value = "select a from Attempt a left join a.user u where u.id=:userId and a.id=:attemptId")
	Attempt getAttempt(@Param("userId")int userId, @Param("attemptId")int attemptId);	
}