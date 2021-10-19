package com.j6.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "capquyen", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "taikhoanUsername", "vaitroIdvaitro" }) })
public class capquyen implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idcapquyen;
	
	@ManyToOne
	@JoinColumn(name = "taikhoanUsername")
	private taikhoan account;
	@ManyToOne
	@JoinColumn(name = "vaitroIdvaitro")
	private vaitro role;
}
