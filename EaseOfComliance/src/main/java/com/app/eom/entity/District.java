package com.app.eom.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class District implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4009762125618147324L;
	//private static final long serialVersionUID = 2130451642111807809L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int distid;
	private String distname;
	public int getDistid() {
		return distid;
	}
	public void setDistid(int distid) {
		this.distid = distid;
	}
	public String getDistname() {
		return distname;
	}
	public void setDistname(String distname) {
		this.distname = distname;
	}

		
	
}
