package com.sls.intern.millionaire.generatedentities;
// Generated Oct 4, 2018 3:02:26 PM by Hibernate Tools 5.1.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Wrongans3 generated by hbm2java
 */
@Entity
@Table(name = "wrongans3", catalog = "dbQuestion2")
public class Wrongans3 implements java.io.Serializable {

	@Id
	@Column(name = "wa3ID")
	private Integer wa3id;
	
	@Column(name = "wa3Content")
	private String wa3content;

	public Wrongans3() {
	}

	public Wrongans3(String wa3content) {
		this.wa3content = wa3content;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "wa3ID", unique = true, nullable = false)
	public Integer getWa3id() {
		return this.wa3id;
	}

	public void setWa3id(Integer wa3id) {
		this.wa3id = wa3id;
	}

	@Column(name = "wa3Content", length = 50)
	public String getWa3content() {
		return this.wa3content;
	}

	public void setWa3content(String wa3content) {
		this.wa3content = wa3content;
	}

}