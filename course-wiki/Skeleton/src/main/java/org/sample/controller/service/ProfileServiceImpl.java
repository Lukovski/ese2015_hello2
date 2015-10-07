package org.sample.controller.service;

import org.sample.model.User;
import org.sample.model.dao.AddressDao;
import org.sample.model.dao.TeamDao;
import org.sample.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired    
    UserDao userDao;
    
    @Autowired
    AddressDao addDao;
    
    @Autowired	  
    TeamDao teamDao;
    
    public ProfileServiceImpl() {
    }
    
    public User getUser(Long id) {
    	return userDao.findOne(id);
    }
    
    
    
}