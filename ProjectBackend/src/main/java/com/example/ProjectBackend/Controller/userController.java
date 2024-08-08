package com.example.ProjectBackend.Controller;



import com.example.ProjectBackend.Service.UserService;
import com.example.ProjectBackend.dto.userDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/user")
public class userController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody userDTO userDTO){
        String Id = userService.addUser(userDTO);
        return Id;
    }
}
