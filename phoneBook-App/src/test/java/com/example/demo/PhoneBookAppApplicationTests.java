package com.example.demo;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.ContactEntity;
import com.example.demo.service.ContactService;

@SpringBootTest
class PhoneBookAppApplicationTests {

	@Autowired
	ContactService contactService;
	
	@Test
	void contextLoads() {
	}

//	@Test
//	void insertData() {
//		
//		ContactEntity contactEntity = new ContactEntity();
//		contactEntity.setContactName("test");
//		contactEntity.setContactEmail("test1@gmail.com");
//		contactEntity.setActiveSw('a');
//		contactEntity.setContactNumber(123456789l);
//		contactEntity.setCreatedDate(LocalDate.now());
//		contactEntity.setUpdatedDate(LocalDate.now());
//		
//		contactService.saveContact(contactEntity);
//		
//		equals(contactService.getAllContacts());
//	}
	
}
