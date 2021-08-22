package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ContactEntity;

public interface ContactInterface {
	
	boolean saveContact(ContactEntity contact);
	List<ContactEntity> getAllContacts();
	ContactEntity getContactById(Integer cid);
	boolean deleteContactById(Integer cid);
}
