package br.com.henriqueluz.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.henriqueluz.enumeration.Gender;

@Entity
public class Dog {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String color;
	
	@Column
	private LocalDate birthday;
	
	@Column
	private Double weight;
	
	@Column
	private Double size;
	
	@JoinColumn(name = "breed_id")
	@ManyToOne
	private Breed breed;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@JoinColumn(name = "kennel_id")
	@ManyToOne
	private Kennel kennel;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
