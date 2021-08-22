package com.example.demo.repositry;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.ContactEntity;

public interface ContactRepositry extends CrudRepository<ContactEntity, Integer>
{
}
