package insta.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ImageController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @GetMapping({"/","/image/feed"})
    public String imageFeed(@AuthenticationPrincipal MyUserDetail userDetail) {
        
        log.info("UserName : "+userDetail.getUsername());
        
        return "image/feed";
    }
    
}