package com.ecom.serviceipl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecom.pojo.Product;
import com.ecom.pojo.Rating;
import com.ecom.productrepository.RatingRepositary;
import com.ecom.service.RatingService;

@Component
public class RatingServiceImp implements RatingService {
	
	
	@Autowired
	RatingRepositary rateRepos;

	@Override
	public Rating addRatingDetails(Rating rate) {
		
		return rateRepos.save(rate);
	}
	
	
	

}
