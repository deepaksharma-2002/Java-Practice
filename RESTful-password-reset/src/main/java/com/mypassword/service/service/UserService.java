package com.mypassword.service.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mypassword.service.dao.repository.UserDao;
import com.mypassword.service.entity.PasswordHistory;
import com.mypassword.service.entity.Users;
import com.mypassword.service.request.ResetPasswordRequest;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public String resetPassword(String newPassword, String email, int id) {

        Users user = userDao.findByEmail(email);
        if (user == null)
            return "User not found!";

        // Fetch last 3 passwords using userId (NOT email)
        List<PasswordHistory> passwordHistory = userDao.getLastThreePassword(email);

        // Check if new password matches the old ones
        for (PasswordHistory p : passwordHistory) {
            if (p.getOldPassword().equals(newPassword)) {
                return "New password cannot be same as last three passwords!";
            }
        }

        // Save old password in history
        PasswordHistory history = new PasswordHistory();
        history.setEmail(email);
        history.setUserId(id);
        history.setOldPassword(user.getPassword());
        userDao.saveoldPass(history);

        // Update new password
        user.setPassword(newPassword);
        userDao.updatepassword(user);

        return "Password reset successfully!";
    }


    public String saveUser(Users user) {
        userDao.saveUserDetails(user);
        return "User details saved successfully!";
    }
}
