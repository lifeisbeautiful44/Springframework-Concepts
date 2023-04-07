package com.srijansil.spring.springcore.reftypes;

public class Scores {

	private double IIT;
	private double WebTechnology;
	private double Calclus;
	private double Networking;

	public double getIIT() {
		return IIT;
	}

	public void setIIT(double iIT) {
		IIT = iIT;
	}

	public double getWebTechnology() {
		return WebTechnology;
	}

	public void setWebTechnology(double webTechnology) {
		WebTechnology = webTechnology;
	}

	public double getCalclus() {
		return Calclus;
	}

	public void setCalclus(double calclus) {
		Calclus = calclus;
	}

	public double getNetworking() {
		return Networking;
	}

	public void setNetworking(double networking) {
		Networking = networking;
	}

	@Override
	public String toString() {
		return "Scores [IIT=" + IIT + ", WebTechnology=" + WebTechnology + ", Calclus=" + Calclus + ", Networking="
				+ Networking + "]";
	}

}
