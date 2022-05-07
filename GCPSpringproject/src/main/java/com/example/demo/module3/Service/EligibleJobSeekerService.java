package com.example.demo.module3.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.module3.Model.EligibleJobseeker;
import com.example.demo.module3.Repository.EligibleJobSeekerRepo;
@Service
public class EligibleJobSeekerService {
	@Autowired
	EligibleJobSeekerRepo eligiblejobseekerRepo;
	
	
	public EligibleJobseeker addeligibleJobSeeker(EligibleJobseeker eligiblejobseekerobj) {
		return eligiblejobseekerRepo.save(eligiblejobseekerobj);
		
	}
	public List<EligibleJobseeker> getAllEligibleJobSeeker(){
		return (List<EligibleJobseeker>)eligiblejobseekerRepo.findAll();
	}

}
