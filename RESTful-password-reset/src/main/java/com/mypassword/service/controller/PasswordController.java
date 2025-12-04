package com.mypassword.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mypassword.service.entity.Users;
import com.mypassword.service.request.ResetPasswordRequest;
import com.mypassword.service.service.UserService;

@RestController
public class PasswordController {

    @Autowired
    private UserService userService;

    @PostMapping("/adduser")
    public ResponseEntity<String> userInfo(@RequestBody Users user) {
        String response = userService.saveUser(user);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/reset")
    public ResponseEntity<String> resetPassword(@RequestBody ResetPasswordRequest req) {

        String response = userService.resetPassword(
                req.getNewPassword(),
                req.getEmail(),
                req.getId()
        );

        return ResponseEntity.ok(response);
    }
}
