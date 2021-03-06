package com.mapping.esource.fhirmapping.beans;

import org.thymeleaf.util.StringUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


/*
 * Patient Search Information
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PatientSearchDTO {

	private String id;
	private String startDate;
	private String endDate;
	
	
	public PatientSearchDTO(){
		
	}

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getStartDate() {
		return startDate;
	}



	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}



	public String getEndDate() {
		return endDate;
	}



	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}



	@Override
	public String toString(){
		return StringUtils.concat(id, startDate, endDate);
	}

}