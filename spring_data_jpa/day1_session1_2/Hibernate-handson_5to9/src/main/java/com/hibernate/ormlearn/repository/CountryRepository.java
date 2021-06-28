package com.hibernate.ormlearn.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.ormlearn.model.*;

 import java.util.*;
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

   
}