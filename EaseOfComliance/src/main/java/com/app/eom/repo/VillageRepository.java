package com.app.eom.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.eom.entity.Village;



@Repository
public interface VillageRepository extends JpaRepository<Village, Integer> {

}
