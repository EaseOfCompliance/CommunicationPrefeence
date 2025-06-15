package com.app.eom.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.eom.entity.District;
import com.app.eom.entity.Mandal;
import com.app.eom.entity.Request;
import com.app.eom.entity.Village;
import com.app.eom.entity.context;
import com.app.eom.repo.ContextRepository;
import com.app.eom.repo.DistrictRepository;
import com.app.eom.repo.MandalRepository;
import com.app.eom.repo.ProductRepository;
import com.app.eom.repo.RequestRepository;
import com.app.eom.repo.VillageRepository;

@RestController
public class PrimaryDataController {
	


	@Autowired
	ProductRepository repository;
	
	@Autowired
	DistrictRepository districtrepository;
	
	
	@Autowired
	MandalRepository mandalrepository;
	
	@Autowired
	VillageRepository villagerepository;
	
	@Autowired
	ContextRepository contextrepository;
	
	@Autowired
	RequestRepository requestrepository;
	
	
	private static final Logger LOGGER= LoggerFactory.getLogger(PrimaryDataController.class);
	
	
	@SuppressWarnings("unchecked")
	@CrossOrigin(origins = "http://localhost:3000")
	  @RequestMapping(value="/districts1/",method=RequestMethod.GET) 
	  public String getDistricts1() {
	  
	  LOGGER.info("finding district by id :");
	  
	  //return districtrepository.findAll();
	  
	  return "I am aAnil Kumar";
	  
	  }
	 
	
	
	
	
	/*
	 * @RequestMapping(value="/districts/",method=RequestMethod.GET) public
	 * List<District> getDistricts() {
	 * 
	 * LOGGER.info("finding district by id :"); return districtrepository.findAll();
	 * 
	 * }
	 */
	
	@SuppressWarnings("unchecked")
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/districts/",method=RequestMethod.GET)
	public ResponseEntity<List<District>> getDistricts() {
		
		LOGGER.info("finding district by id :");
		//return districtrepository.findAll();
		 return new ResponseEntity<>(districtrepository.findAll(), HttpStatus.OK);
		
	}
	
	
	
	
	@RequestMapping(value="/mandals/",method=RequestMethod.GET)
	public List<Mandal> getMandals() {
		
		LOGGER.info("finding mandal by id :");
		return mandalrepository.findAll();
		
	}
	@RequestMapping(value="/villages/",method=RequestMethod.GET)
	public List<Village> getVillages() {
		
		LOGGER.info("finding Village by id :");
		return villagerepository.findAll();
		
	}
	
	
	
	  @RequestMapping(value="/submitrequest/",method=RequestMethod.POST,consumes = "multipart/form-data") 
	  public Request submitRequest(@RequestPart("request") Request request,
	            @RequestPart(value = "image", required = false) MultipartFile imageFile) { 
		  // Optional: Save or process the imageFile
		  if (imageFile != null && !imageFile.isEmpty()) {
		        try {
		            byte[] imageBytes = imageFile.getBytes();
		            request.setImage(imageBytes);
		            System.out.println("Image received and attached.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		  
		   return requestrepository.save(request);
	 
	  }
	 
	
	
	/*
	 * @RequestMapping(value="/submitrequest/",method=RequestMethod.POST) public
	 * Request submitRequest(@RequestBody Request request) { return
	 * requestrepository.save(request);
	 * 
	 * }
	 */
	
	
	/*
	 * @RequestMapping(value="/getrequest/{id}",method=RequestMethod.GET) public
	 * List<Request> getRequest(@PathVariable("id") String id) {
	 * 
	 * LOGGER.info("finding Village by id :"); //int sid=Integer.parseInt(id);
	 * return requestrepository.findAllByPhoneNumber(id);
	 * 
	 * 
	 * }
	 */
	


	@GetMapping("/getrequest")
	    public ResponseEntity<List<Request>> getByPhoneNumberOrId(
	            @RequestParam(required = false) String phoneNumber,
	            @RequestParam(required = false) Integer ID) {

	        if (phoneNumber == null && ID == null) {
	            return ResponseEntity.badRequest().build();
	        }

	        List<Request> result = requestrepository.findByPhoneNumberOrID(phoneNumber, ID != null ? ID : -1);
	        return ResponseEntity.ok(result);
	    }
	
	
	
	@RequestMapping(value="/contexts/",method=RequestMethod.POST)
	public context createContext(@RequestBody context product) {
		return contextrepository.save(product);
	
	}
	
	
	@RequestMapping(value="/contexts/",method=RequestMethod.PUT)
	public context updateContext(@RequestBody context product) {
		return contextrepository.save(product);
	}
	
	
	@RequestMapping(value="/contexts/{id}",method=RequestMethod.DELETE)
	//@CacheEvict("product-cache")
	public void deleteContext(@PathVariable("id")int id) {
		contextrepository.deleteById(id);
	}
	
	
	
	


}
