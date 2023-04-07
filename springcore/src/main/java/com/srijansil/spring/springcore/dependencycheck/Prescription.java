package com.srijansil.spring.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	private int id;
	private String name;
	private List<String> medicine;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getMedicine() {
		return medicine;
	}

	public void setMedicine(List<String> medicine) {
		this.medicine = medicine;
	}

	@Override
	public String toString() {
		return "Prescription [id=" + id + ", name=" + name + ", medicine=" + medicine + "]";
	}

}
