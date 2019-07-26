package com.covalense.hibernateapp.hql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "newemp_info")
public class EmployeeNewInfo {
	@Id
	@Column
	private int eid;
	@Column(name="nam")
	private String name;
	@Column
	private String email;
}
