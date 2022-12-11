package com.app.alex.contactlist.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.alex.contactlist.entity.Contactlist;
import com.app.alex.contactlist.serviceI.ServiceInterface;

@RestController
@RequestMapping(value="/v1/api/contactlist")
public class Restcontroller {

	@Autowired
	private ServiceInterface ser;
	
	@RequestMapping(value="/saved",method = RequestMethod.POST)
	public String saveContact(@RequestBody Contactlist contactlist) {
		return ser.saveContact(contactlist);
	}
	
	@RequestMapping(value="/getAll",method = RequestMethod.GET)
	public List<Contactlist> getAllContacts(){
		return ser.getAllContacts();
	}
	@RequestMapping(value="/get{contactId}",method = RequestMethod.GET)
	public Contactlist getContactById(@PathVariable Integer contactId){
		return ser.getContactById(contactId);
	}
	
	@RequestMapping (value="/update",method = RequestMethod.PUT)
	public String updateContact(@RequestBody Contactlist contactlist) {
		return ser.updateContact(contactlist);
	}
		
	@RequestMapping(value="/deleteContactById",method = RequestMethod.DELETE)
	public String deleteContactById(@PathVariable Integer contactId) {
		return ser.deleteContactById(contactId);
		
	}
	
}
