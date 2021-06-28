package com.hql.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hql.model.User;

public interface UserRepository extends JpaRepository<User, String>{

}
