package com.sls.intern.millionaire.generatedentities;
// Generated Oct 4, 2018 3:02:26 PM by Hibernate Tools 5.1.8.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Wrongans2 generated by hbm2java
 */
@Entity
@Table(name = "wrongans2", catalog = "dbQuestion2")
public class Wrongans2 implements java.io.Serializable {

	@Id
	@Column(name = "wa2ID")
	private Integer wa2id;
	
	@Column(name = "wa2Content")
	private String wa2content;

	public Wrongans2() {
	}

	public Wrongans2(String wa2content) {
		this.wa2content = wa2content;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "wa2ID", unique = true, nullable = false)
	public Integer getWa2id() {
		return this.wa2id;
	}

	public void setWa2id(Integer wa2id) {
		this.wa2id = wa2id;
	}

	@Column(name = "wa2Content", length = 50)
	public String getWa2content() {
		return this.wa2content;
	}

	public void setWa2content(String wa2content) {
		this.wa2content = wa2content;
	}

}
