package com.learntodrive.model;

public class Driver {

	private String name;
	private License license;
	private Car cars[];//containership :aggregation--> bcoz of many-->>Driver has Car(S)

	public License getLicense() {
		return license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
