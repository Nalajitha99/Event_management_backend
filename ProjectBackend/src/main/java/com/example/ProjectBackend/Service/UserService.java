package com.example.ProjectBackend.Service;

import com.example.ProjectBackend.Entity.User;
import com.example.ProjectBackend.Repository.UserRepo;
import com.example.ProjectBackend.dto.userDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addUser(userDTO userDTO) {

        User user = new User (
                userDTO.getUserId(),
                userDTO.getFirstName(),
                userDTO.getLastName(),
                userDTO.getNIC(),
                userDTO.getEmail(),
                userDTO.getAddress(),
                userDTO.getContactNo(),
                this.passwordEncoder.encode(userDTO.getPassword()),
                userDTO.getGender()
        );

        userRepo.save(user);
        return user.getFirstName();
    }
}
