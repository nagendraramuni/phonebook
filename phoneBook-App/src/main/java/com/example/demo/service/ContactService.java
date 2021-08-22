package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ContactEntity;
import com.example.demo.repositry.ContactRepositry;


@Service
//@Component
public class ContactService implements ContactInterface {

	@Autowired
	ContactRepositry contactRepositry;
	
	@Override
	public boolean saveContact(ContactEntity contact) {
		// TODO Auto-generated method stub
		contactRepositry.save(contact);
		return true;
	}

	@Override
	public List<ContactEntity> getAllContacts() {
		// TODO Auto-generated method stub
		List<ContactEntity> contacts = new ArrayList<ContactEntity>();
		contactRepositry.findAll().forEach(contact -> contacts.add(contact));
		return contacts;
	}

	@Override
	public ContactEntity getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return contactRepositry.findById(cid).get();
	}

	@Override
	public boolean deleteContactById(Integer cid) {
		// TODO Auto-generated method stub
		contactRepositry.deleteById(cid);
		return true;
	}

}
