package com.covalense.hibernateapp.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Data
@Table(name = "training_info")
public class TrainingInfoBean {

	@Id
	@Column(name = "COURSE_ID")
	private int course_id;
	@Column(name = "COURSE_NM")
	private String course_nm;
	@Column(name = "DURATION")
	private int duration;
	@Column(name = "COURSE_TYPE")
	private String course_type;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_training", 
	joinColumns = { @JoinColumn(name = "COURSE_ID") },
	inverseJoinColumns = {@JoinColumn(name = "ID") })
	List<EmployeeInfoBean> infoBeans;

}
