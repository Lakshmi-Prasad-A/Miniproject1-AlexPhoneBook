package com.app.alex.contactlist.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.alex.contactlist.entity.Contactlist;
import com.app.alex.contactlist.repo.ContactlistRepo;
import com.app.alex.contactlist.serviceI.ServiceInterface;

@Service
public class ServiceImpl implements ServiceInterface {
	
	@Autowired
	private ContactlistRepo repo;

	@Override
	public String saveContact(Contactlist contactlist) {
		contactlist = repo.save(contactlist);
		
		if(contactlist.getContactId()!=null) {
			return "Contact Saved";
		}else {
			return "Contact failed to saved";
		}
	}

	@Override
	public List<Contactlist> getAllContacts() {
		return repo.findAll();
	}

	@Override
	public Contactlist getContactById(Integer contactId) {
		Optional<Contactlist> findById = repo.findById(contactId);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		
		return null;
	}

	@Override
	public String updateContact(Contactlist contactlist) {
		
	if(repo.existsById(contactlist.getContactId())) {
		repo.save(contactlist);
		return "Update Success";
	}else {
		return "No Record Found";
	}
}

	@Override
	public String deleteContactById(Integer contactId) {
		
		if(repo.existsById(contactId)) {
			repo.deleteById(contactId);
			return "Record Deleted";
		}else {
		return "No Record Found";
	}

	}
}

