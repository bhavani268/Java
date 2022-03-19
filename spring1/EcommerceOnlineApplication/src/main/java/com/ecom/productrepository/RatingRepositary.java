package com.ecom.productrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.pojo.Rating;

public interface RatingRepositary extends JpaRepository<Rating,Long> {

}
