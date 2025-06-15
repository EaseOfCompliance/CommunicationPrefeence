package com.app.eom.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Village implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6797829525550926166L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vilid;
	private String vilname;
	public int getVilid() {
		return vilid;
	}
	public void setVilid(int vilid) {
		this.vilid = vilid;
	}
	public String getVilname() {
		return vilname;
	}
	public void setVilname(String vilname) {
		this.vilname = vilname;
	}
		
}
