package com.vk.service;

import java.util.List;

import com.vk.entity.DriverLicense;
import com.vk.entity.Person;

public interface IOneToOneOperationMgmtService {

	public String registerPersonWithDL(Person person);
	
	public String saveDLwithPerson(DriverLicense dl);
	
	public String deleteDLRecords();
	
	public List<Person> fetchPersonWithDLdata();
}
