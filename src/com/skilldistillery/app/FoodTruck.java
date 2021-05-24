package com.skilldistillery.app;

public class FoodTruck {
	private int uniqueId;
	private String name;
	private String foodType;
	private int numericRating;
	public FoodTruck() { }
	public FoodTruck(String name, String foodType, int numericRating, int uId) {
		super();
		this.name = name;
		this.foodType = foodType;
		this.numericRating = numericRating;
		this.uniqueId = uId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public int getNumericRating() {
		return numericRating;
	}
	public void setNumericRating(int numericRating) {
		this.numericRating = numericRating;
	}
	public int getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}

	@Override
	public String toString() {
		return "ID "+ uniqueId + " Food Truck Name: " + name + ", Food Type: " + foodType + ", Rating: " + numericRating + " out of 5.";
	}
	
}
