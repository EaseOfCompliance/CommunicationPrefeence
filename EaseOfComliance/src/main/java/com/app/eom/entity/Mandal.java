package com.app.eom.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mandal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1970505381202244273L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mdid;
	private String mdname;
	public int getMdid() {
		return mdid;
	}
	public void setMdid(int mdid) {
		this.mdid = mdid;
	}
	public String getMdname() {
		return mdname;
	}
	public void setMdname(String mdname) {
		this.mdname = mdname;
	}
	
	
}
