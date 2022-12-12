package com.app.alex.contactlist.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.alex.contactlist.entity.Contactlist;
import com.app.alex.contactlist.serviceI.ServiceInterface;

@RestController
@CrossOrigin(value = "http://localhost:3000")
@RequestMapping(value="/v1/api/contactlist")
public class Restcontroller {

	@Autowired
	private ServiceInterface ser;
	
	@PostMapping("/contact")
	public String saveContact(@RequestBody Contactlist contactlist) {
		return ser.saveContact(contactlist);
	}
	
	@GetMapping("/contacts")
	public List<Contactlist> getAllContacts(){
		return ser.getAllContacts();
	}
	@GetMapping("/contact/{contactId")
	public Contactlist getContactById(@PathVariable Integer contactId){
		return ser.getContactById(contactId);
	}
	
	@PutMapping ("/contact")
	public String updateContact(@RequestBody Contactlist contactlist) {
		return ser.updateContact(contactlist);
	}
		
	@DeleteMapping("/contact/{contactId")
	public String deleteContactById(@PathVariable Integer contactId) {
		return ser.deleteContactById(contactId);
		
	}
	
}
