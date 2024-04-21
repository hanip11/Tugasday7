package com.example.restaurantreview.data.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Restaurant{

	@SerializedName("customerReviews")
	private List<CustomerReviewsItem> customerReviews;

	@SerializedName("name")
	private String name;

	@SerializedName("rating")
	private Object rating;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private String id;

	@SerializedName("pictureId")
	private String picture;

	public List<CustomerReviewsItem> getCustomerReviews(){
		return customerReviews;
	}

	public String getName(){
		return name;
	}

	public Object getRating(){
		return rating;
	}

	public String getDescription(){
		return description;
	}

	public String getId(){
		return id;
	}

	public String getPictureId(){
		return picture;
	}
}