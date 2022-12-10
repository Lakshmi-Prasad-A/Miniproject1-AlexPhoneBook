package com.app.alex.contactlist.daoI;

import java.util.List;
import java.util.Optional;

import com.app.alex.contactlist.entity.Contactlist;

public interface DaoInterface {

	public String saveContact(Contactlist contactlist);
	
	public List<Contactlist> getAllContacts();
	
	public Optional<Contactlist>getContactById(Integer contactId);
	
	public String updateContact (Contactlist contactlist);
	
	public List<Contactlist> deleteContactById(Integer contactId);	

	
}
