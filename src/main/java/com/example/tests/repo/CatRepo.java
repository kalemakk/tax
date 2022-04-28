package com.example.tests.repo;

import com.example.tests.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepo extends JpaRepository<Cat, Long> {

}
