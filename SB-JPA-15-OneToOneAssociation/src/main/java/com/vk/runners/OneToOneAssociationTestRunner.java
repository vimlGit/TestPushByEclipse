package com.vk.runners;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vk.entity.DriverLicense;
import com.vk.entity.Person;
import com.vk.service.IOneToOneOperationMgmtService;


@Component
public class OneToOneAssociationTestRunner implements CommandLineRunner {

	@Autowired
	private IOneToOneOperationMgmtService service;
	@Override
	public void run(String... args) throws Exception {
		
		/*try {
			Person person = new Person("khushi", LocalDate.of(2001,04,07), "deoria");
			DriverLicense dl = new DriverLicense("scooty", "RTO deoria", LocalDate.of(2022,05, 13));
			person.setDLicense(dl);
			String res = service.registerPersonWithDL(person);
			System.out.println(res);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			DriverLicense dl = new DriverLicense("GoodsCarrier","Grugram",LocalDate.of(2013,12,11));
			Person person = new Person("riya", LocalDate.of(2004,03,12),"siwan");
			//set person to DL
			dl.setPerson(person);
			person.setDLicense(dl);// Important: Synchronize the relationship on the owning side
			String res = service.saveDLwithPerson(dl);
			System.out.println(res);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			List<Person> list = service.fetchPersonWithDLdata();
			System.out.println("========================================================");
			list.forEach(per -> {
				System.out.println("Parent::" + per);
				System.out.println("Child::" + per.getDLicense().toString());
				System.out.println("----------------------");
			});
			System.out.println("========================================================");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				String result = service.deleteDLRecords();
				System.out.println(result);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		
	}

}
