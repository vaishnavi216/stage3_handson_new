package com.hql.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.hql.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>  {

}