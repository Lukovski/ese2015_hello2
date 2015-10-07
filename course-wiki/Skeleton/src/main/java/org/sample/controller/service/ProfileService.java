package org.sample.controller.service;

import org.sample.controller.exceptions.InvalidUserException;
import org.sample.controller.pojos.SignupForm;
import org.sample.model.User;

public interface ProfileService {

    public User getUser(Long id) throws InvalidUserException;

}
