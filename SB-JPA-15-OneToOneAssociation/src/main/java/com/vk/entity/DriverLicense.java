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
@Table(name="DriverLicense")
@Setter
@Getter
@RequiredArgsConstructor
public class DriverLicense {

	@Id
	@SequenceGenerator(name="gen2" , sequenceName ="oneTOone_DLSeq1",initialValue =555,allocationSize =1)
	@GeneratedValue(generator="gen2" , strategy =GenerationType.SEQUENCE)
	private Integer dlId;
	
	@Column(length=30)
	@NonNull
	private String dlType;
	
	@Column(length=30)
	@NonNull
	private String rtoName;
	
	@NonNull
	private LocalDate issuedDate;
	
	 @OneToOne(targetEntity = Person.class,cascade = CascadeType.ALL,mappedBy ="dLicense")
	private Person person;
	
	public DriverLicense() {
		System.out.println("DriverLicense:: 0-param-Constructor");
	}

	@Override
	public String toString() {
		return "DriverLicense [dlId=" + dlId + ", dlType=" + dlType + ", rtoName=" + rtoName + ", issuedDate="
				+ issuedDate + "]";
	}
	
    
	
}
