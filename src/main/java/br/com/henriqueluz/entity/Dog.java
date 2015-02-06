package br.com.henriqueluz.entity;

import java.time.LocalDate;

import br.com.henriqueluz.enumeration.Gender;

public class Dog extends BasicEntity {

	private String name;
	
	private String color;
	
	private LocalDate birthday;
	
	private Double weight;
	
	private Double size;
	
	private Breed breed;
	
	private Gender gender;
	
	private Kennel kennel;
	
	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Kennel getKennel() {
		return kennel;
	}

	public void setKennel(Kennel kennel) {
		this.kennel = kennel;
	}
	
}
