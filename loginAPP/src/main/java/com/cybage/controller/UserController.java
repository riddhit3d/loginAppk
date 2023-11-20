package com.cybage.controller;


import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.dto.LoginDto;
import com.cybage.dto.UserDto;
import com.cybage.repo.UserRepository;
import com.cybage.response.LoginResponse;
import com.cybage.response.SignUpResponse;
import com.cybage.service.UserService;

import jakarta.validation.Valid;
@CrossOrigin(origins = "http://localhost:3005")
@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/save")
    public ResponseEntity<SignUpResponse> saveUser(@RequestBody @Valid UserDto userDto)  {

        SignUpResponse signUpResponse = userService.addUser(userDto);
          if (signUpResponse.getStatus()==false){
              return new ResponseEntity<SignUpResponse>(signUpResponse,HttpStatus.BAD_REQUEST);
          }else{
              return new ResponseEntity<SignUpResponse>(signUpResponse,HttpStatus.CREATED);
          }


    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> loginUser(@RequestBody LoginDto loginDto)
    {
        LoginResponse loginResponse = userService.loginUser(loginDto);
        if(loginResponse.getMessage()=="Login Success"){
            return new ResponseEntity<LoginResponse>(loginResponse, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<LoginResponse>(loginResponse, HttpStatus.BAD_REQUEST);
        }}
        @PostMapping("/checkemail")
        public ResponseEntity<Map<String, Boolean>> checkEmailExists(@RequestBody Map<String, String> request) {
            String email = request.get("email");

            if (userService.isEmailExists(email)) {
                return ResponseEntity.ok(Collections.singletonMap("this email exists", true));
            }
            else
            {
                return ResponseEntity.ok(Collections.singletonMap("this email doesnot exists", false));
            }
        }

    }
