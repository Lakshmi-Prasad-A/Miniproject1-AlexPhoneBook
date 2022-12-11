package com.app.alex.contactlist.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.app.alex.contactlist.entity.Contactlist;


public interface ContactlistRepo extends JpaRepository<Contactlist, Integer> {


}
