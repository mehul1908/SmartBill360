package com.smartbill360.modules.auth.service;

import com.smartbill360.modules.user.dto.LoginModel;
import com.smartbill360.modules.user.entity.User;
import com.smartbill360.modules.user.exception.UserNotFoundException;

import jakarta.mail.MessagingException;
import jakarta.validation.Valid;

public interface AuthService {

	void updatePassword(String encode);

	void forgetPassword() throws MessagingException;

	User loginUser(@Valid LoginModel model) throws UserNotFoundException;

}
