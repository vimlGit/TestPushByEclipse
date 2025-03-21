package com.vk.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PersonJPA")
@Getter
@Setter
@RequiredArgsConstructor
public class Person {

	@Id
	@SequenceGenerator(name="gen1" , sequenceName ="oneTOone_PersonSeq1",initialValue =100,allocationSize =1)
	@GeneratedValue(generator="gen1" , strategy =GenerationType.SEQUENCE)
	private Integer pid;
	
	@Column(length=30)
	@NonNull
	private String pname;
	@NonNull
	private LocalDate dob;
	@Column(length=30)
	@NonNull
	private String addrs;
	
	
	@OneToOne(targetEntity =DriverLicense.class,cascade = CascadeType.ALL)
	@JoinColumn(name="License_No", referencedColumnName ="dlId",unique =true)
	private DriverLicense dLicense;
	
	
	public Person() {
		System.out.println("Person:: 0-param-Constructor");
	}


	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", dob=" + dob + ", addrs=" + addrs + "]";
	}	
	
	
}

















