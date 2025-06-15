package com.app.eom.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class context implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6429374043009646673L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int contextid;
	private String contextname;
	public int getContextid() {
		return contextid;
	}
	public void setContextid(int contextid) {
		this.contextid = contextid;
	}
	public String getContextname() {
		return contextname;
	}
	public void setContextname(String contextname) {
		this.contextname = contextname;
	}
	
		
	
}
