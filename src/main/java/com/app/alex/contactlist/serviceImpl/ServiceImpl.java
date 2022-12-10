package com.app.alex.contactlist.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.alex.contactlist.daoI.DaoInterface;
import com.app.alex.contactlist.entity.Contactlist;
import com.app.alex.contactlist.serviceI.ServiceInterface;

public class ServiceImpl implements ServiceInterface {
	
	@Autowired
	private DaoInterface dao;

	@Override
	public String saveContact(Contactlist contactlist) {
		return dao.saveContact(contactlist);
	}

	@Override
	public List<Contactlist> getAllContacts() {
		return dao.getAllContacts();
	}

	@Override
	public Optional<Contactlist> getContactById(Integer contactId) {
		return dao.getContactById(contactId);
	}

	@Override
	public String updateContact(Contactlist contactlist) {
		return dao.updateContact(contactlist);
	}

	@Override
	public List<Contactlist> deleteContactById(Integer contactId) {
		return dao.deleteContactById(contactId);	
		}
	}

