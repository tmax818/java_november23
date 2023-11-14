package com.heidichen.apitest.models;

public class People {
	private String name;
	private String height;
	private String mass;

	private String[] films;
	private String[] species;
	private String[] vehicles;
	private String[] starships;

	
	public People() {}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}


	public String getMass() {
		return mass;
	}


	public void setMass(String mass) {
		this.mass = mass;
	}


	public String[] getFilms() {
		return films;
	}


	public void setFilms(String[] films) {
		this.films = films;
	}


	public String[] getSpecies() {
		return species;
	}


	public void setSpecies(String[] species) {
		this.species = species;
	}


	public String[] getVehicles() {
		return vehicles;
	}


	public void setVehicles(String[] vehicles) {
		this.vehicles = vehicles;
	}


	public String[] getStarships() {
		return starships;
	}


	public void setStarships(String[] starships) {
		this.starships = starships;
	}


	
}
