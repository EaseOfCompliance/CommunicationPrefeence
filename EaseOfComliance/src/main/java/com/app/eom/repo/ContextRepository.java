package com.app.eom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.eom.entity.context;



@Repository
public interface ContextRepository extends JpaRepository<context, Integer> {

}
