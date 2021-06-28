package com.jpa.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.jpa.demo.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>  {

}