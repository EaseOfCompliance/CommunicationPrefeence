package com.app.eom.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.app.eom.entity.Request;


@Repository
public interface RequestRepository extends JpaRepository<Request, Integer> {
	
	// List<Request> findAllByPhoneNumber(String phoneNumber);
	
	// Get all requests by phone number
    List<Request> findAllByPhoneNumber(String phoneNumber);

    // Custom query: find by phone number OR ID
    @Query("SELECT r FROM Request r WHERE r.phoneNumber = :phoneNumber OR r.ID = :ID")
    List<Request> findByPhoneNumberOrID(@Param("phoneNumber") String phoneNumber, @Param("ID") int ID);

	

	
}


