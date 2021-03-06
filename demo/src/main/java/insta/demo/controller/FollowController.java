package insta.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import insta.demo.model.Follow;
import insta.demo.model.User;
import insta.demo.repository.FollowRepository;
import insta.demo.repository.UserRepository;
import insta.demo.service.MyUserDetail;

@Controller
public class FollowController {

    @Autowired
    private UserRepository mUserRepository;

    @Autowired
    private FollowRepository mFollowRepository;

    @PostMapping("/follow/{id}")
    public @ResponseBody Follow follow(
        @AuthenticationPrincipal MyUserDetail userDetail, 
        @PathVariable int id
    ) {
        User fromUser = userDetail.getUser();
        Optional<User> oToUser = mUserRepository.findById(id);
        User toUser = oToUser.get();

        Follow follow = new Follow();
        follow.setFromUser(fromUser);
        follow.setToUser(toUser);

        mFollowRepository.save(follow);
        
        return follow;
    }
}