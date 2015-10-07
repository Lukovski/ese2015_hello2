package org.sample.controller;

import java.util.Map;


import org.sample.controller.service.ProfileService;
import org.sample.controller.service.SampleService;
import org.sample.controller.service.TeamService;
import org.sample.model.User;
import org.sample.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {
	
	

    @Autowired
    SampleService sampleService;
    
    @Autowired
    ProfileService profileService;
    
    @Autowired
    TeamService teamService;
    
    @Autowired
    UserDao userDao;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public ModelAndView index(@RequestParam(value = "userId", required = true) Long userId){
    	ModelAndView model = new ModelAndView("profile");
    	model.addObject("User", userDao.findOne(userId));
    	return model;
    }



}


