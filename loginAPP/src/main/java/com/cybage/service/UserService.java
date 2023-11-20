package com.cybage.service;

import com.cybage.dto.UserDto;
import com.cybage.response.LoginResponse;
import com.cybage.response.SignUpResponse;
import com.cybage.dto.LoginDto;


public interface UserService {
   SignUpResponse addUser(UserDto userDto);

   LoginResponse loginUser(LoginDto loginDto);

boolean isEmailExists(String email);


}
