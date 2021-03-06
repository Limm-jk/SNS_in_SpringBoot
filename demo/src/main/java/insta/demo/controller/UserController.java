package insta.demo.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import insta.demo.model.User;
import insta.demo.repository.UserRepository;


@Controller
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Autowired
    private UserRepository mUserRepository;

    @GetMapping("/auth/login")
    public String authLogin(){
        return "auth/login";
    }
    @GetMapping("/auth/join")
    public String authJoin(){
        return "auth/join";
    }

    @PostMapping("/auth/joinProc")
    public String authJoinProc(User user){
        String rawPassword = user.getPassword();
        String encPassword = encoder.encode(user.getPassword());
        user.setPassword(encPassword);
        log.info("rawPassword: "+rawPassword);
        log.info("encPassword: "+encPassword);
        
        mUserRepository.save(user);

        return "redirect:/auth/login";
    }

    @GetMapping("/user/{id}")
    public @ResponseBody User user(@PathVariable int id) {

        Optional<User> ouser = mUserRepository.findById(id);
        User user = ouser.get();
        return user;
    }
    
}