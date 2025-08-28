package com.userApp.service;

import com.userApp.exceptions.TooLongPasswordException;
import com.userApp.exceptions.TooShortPasswordException;
import com.userApp.exceptions.UserNameAlreadyExistsException;

public interface ValidationService {

	boolean validateUserName(String userName) throws UserNameAlreadyExistsException;
	boolean validatePassword(String password) throws TooShortPasswordException, TooLongPasswordException;
}
