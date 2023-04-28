package com.rating.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
	
	@Id
	private int ratingid;
	private int userid;
	private int hotelid;
	private double rating;
	private  String feedback;
	
		
	

	

}
