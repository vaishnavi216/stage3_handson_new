package com.hql.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hql.model.Department;


@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}