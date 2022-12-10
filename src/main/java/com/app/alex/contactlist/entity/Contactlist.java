package com.app.alex.contactlist.entity;



import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor


public class Contactlist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long contactNum;
	
}
