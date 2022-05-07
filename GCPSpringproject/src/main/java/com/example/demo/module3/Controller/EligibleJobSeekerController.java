package com.example.demo.module3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.demo.module3.Model.EligibleJobseeker;
import com.example.demo.module3.Service.EligibleJobSeekerService;


@RestController
@RequestMapping("/EligibleJobseeker")
public class EligibleJobSeekerController {
     @Autowired     
	EligibleJobSeekerService eligiblejobseekerservice;
     @PostMapping("/addEligibleJobSeeker")
     public ResponseEntity<String>addEligibleJobseekerDetails(@RequestBody EligibleJobseeker eligiblejobseeker){
    	 EligibleJobseeker ejsResponse=eligiblejobseekerservice.addeligibleJobSeeker(eligiblejobseeker);
    	 return new ResponseEntity<String>(ejsResponse.getJobSeekerId()+"Eligible candidates screen:",HttpStatus.OK);
     }
	@GetMapping("/getAllEligibleJobSeeker")
	public ResponseEntity<List<EligibleJobseeker>>fetchAllEligibleJobSeeker(){
		List<EligibleJobseeker> ejsObj=eligiblejobseekerservice. getAllEligibleJobSeeker();
		return new ResponseEntity<List<EligibleJobseeker>>(ejsObj,HttpStatus.OK);
		
	}
}
