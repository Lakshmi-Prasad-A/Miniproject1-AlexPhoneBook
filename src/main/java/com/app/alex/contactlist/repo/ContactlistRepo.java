package com.app.alex.contactlist.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.alex.contactlist.entity.Contactlist;

public interface ContactlistRepo extends JpaRepository<Contactlist, Integer> {

	String saveContact(Contactlist contactlist);

	Contactlist deleteContactById(Integer contactId);

}
