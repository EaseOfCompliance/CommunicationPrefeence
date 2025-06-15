package com.app.eom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.eom.entity.District;



@Repository
public interface DistrictRepository extends JpaRepository<District, Integer> {

}
