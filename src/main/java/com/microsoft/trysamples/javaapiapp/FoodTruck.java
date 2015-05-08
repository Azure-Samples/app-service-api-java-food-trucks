package com.microsoft.trysamples.javaapiapp;

/**
 * Representation of the hello world.
 */
public class FoodTruck {
	private final Integer id;
    private final String name;
	private final String city;
	private final Integer likes;
	private final boolean savory;
	private final boolean sweet;
	private final boolean vegeterian;
	private final boolean bookable;
	
    public FoodTruck(Integer id, String name, String city, Integer likes, boolean savory, boolean sweet, boolean vegeterian, boolean bookable) 
	{
		this.id = id;
		this.name = name;
		this.city = city;
		this.likes = likes;
		this.savory = savory;
		this.sweet = sweet;
		this.vegeterian = vegeterian;
		this.bookable = bookable;
    }

    public String getName() {
        return name;
    }
	
	public Integer getId() {
		return id;
	}
	
	public String getCity() {
		return city;
	}
	
	public Integer getLikes() {
		return likes;
	}
	
	public boolean getSavory() {
		return savory;
	}
	
	public boolean getSweet() {
		return sweet;
	}
	
	public boolean getVegeterian() {
		return vegeterian;
	}
	
	public boolean getBookable() {
		return bookable;
	}
}
