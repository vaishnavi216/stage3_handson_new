package com.hql.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.model.Question;

public interface QuestionRepository extends JpaRepository<Question, String>{

}