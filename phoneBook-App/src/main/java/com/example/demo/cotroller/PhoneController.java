package com.example.demo.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ContactEntity;
import com.example.demo.service.ContactInterface;
import com.example.demo.service.ContactService;

@RestController
public class PhoneController {
	
	@Autowired
	ContactService contactService;
	
	@PostMapping("/insert")
	public boolean insertContact(@RequestBody ContactEntity contactEntity)
	{
		contactService.saveContact(contactEntity);
		return true;
	}
	
	@GetMapping("/contacts")
	public List<ContactEntity> getContacts() {
		return contactService.getAllContacts();
	}
	
	@PostMapping("/{cid}")
	public ContactEntity getById(@PathVariable Integer cid) {
		return contactService.getContactById(cid);
	}
	
	@PostMapping("/contacts/{cid}")
	public boolean deleteById(@PathVariable Integer cid) {
		return contactService.deleteContactById(cid);
	}

	

}

