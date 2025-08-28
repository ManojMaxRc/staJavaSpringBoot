package com.userApp.service;

import com.userApp.exceptions.TooLongPasswordException;
import com.userApp.exceptions.TooShortPasswordException;
import com.userApp.exceptions.UserNameAlreadyExistsException;

public class ValidationServiceImpl implements ValidationService {

	public ValidationServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validateUserName(String userName) throws UserNameAlreadyExistsException {
		String[] userNames = {"Manoj", "Roshan", "Jagan", "Jim"};
		
		for (String user : userNames) {
			
				if(user.equals(userName)) {
					throw new UserNameAlreadyExistsException("Username already exists");
				}else {
					System.out.println("Username created successfully");
				}
			
			
		}
		return false;
	}

	@Override
	public boolean validatePassword(String password) throws TooShortPasswordException, TooLongPasswordException {
		// TODO Auto-generated method stub
		return false;
	}

}
