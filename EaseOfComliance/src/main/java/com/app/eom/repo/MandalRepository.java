package com.app.eom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.eom.entity.Mandal;



@Repository
public interface MandalRepository extends JpaRepository<Mandal, Integer> {

}
