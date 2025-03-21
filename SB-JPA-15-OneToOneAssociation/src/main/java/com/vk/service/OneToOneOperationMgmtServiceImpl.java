package com.vk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vk.entity.DriverLicense;
import com.vk.entity.Person;
import com.vk.repository.IDriverLicenseRepository;
import com.vk.repository.IPersonRepository;

@Service
public class OneToOneOperationMgmtServiceImpl implements IOneToOneOperationMgmtService {
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IDriverLicenseRepository dlRepo;
	
	@Override
	public String registerPersonWithDL(Person person) {

		 Person save = personRepo.save(person);
		 
		return "Person saved By ID value : "+save.getPid()+"\n"+" DriverLicense saved By ID value :"+save.getDLicense().getDlId();
	}

	@Override
	public String deleteDLRecords() {
		List<Person> list = personRepo.findAll();
		/*list.forEach(dl->{
			dl.setPerson(null);
		});*/
		
	//	List<DriverLicense> saveAll = dlRepo.saveAll(list);//Fohreign key become null		
		//dlRepo.deleteAll(saveAll);
		personRepo.deleteAll(list);
		
		
		//return "deleted all DL which DLNo are ::"+saveAll.stream().map(dl->dl.getDlId()).toList();
		return "deleted all DL which DLNo are ::"+list.stream().map(dl->dl.getPid()).toList();
	}

	@Override
	public List<Person> fetchPersonWithDLdata() { 
		return personRepo.findAll();
	}

	@Override
	public String saveDLwithPerson(DriverLicense dl) {
        Integer dlId = dlRepo.save(dl).getDlId();
		return "DriverLicense saved with Ids Value ::"+dlId;
	}

}
















