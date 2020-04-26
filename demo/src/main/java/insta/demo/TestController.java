package insta.demo;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController{

    @GetMapping("/test/home")
    public String testHome(){
        return "home";
    }
    @GetMapping("/test/user")
	public @ResponseBody User getUser() {
		User user = new User();
		user.setId(1);
		user.setUsername("cos");
		user.setName("홍길동");
		user.setEmail("cos@nate.com");
		user.setProfileImage("my.jpg");
		
		Image img1 = new Image();
		img1.setId(1);
		img1.setCaption("음식 사진");
		img1.setLocation("food.jpg");
		img1.setLocation("부산 서면");
		img1.setUser(user);
		
		Image img2 = new Image();
		img2.setId(2);
		img2.setCaption("장난감 사진");
		img2.setLocation("game.jpg");
		img2.setLocation("서울 강남");
		img2.setUser(user);
		
		List<Image> images = new ArrayList<>();
		images.add(img1);
		images.add(img2);
		user.setImages(images);
		
		return user;
	}
	
	@GetMapping("/test/image")
	public @ResponseBody Image getImage() {
		User user = new User();
		user.setId(1);
		user.setUsername("cos");
		user.setName("홍길동");
		user.setEmail("cos@nate.com");
		user.setProfileImage("my.jpg");
		
		Image img1 = new Image();
		img1.setId(1);
		img1.setCaption("음식 사진");
		img1.setLocation("food.jpg");
		img1.setLocation("부산 서면");
		img1.setUser(user);
		
		return img1;
	}
	
	@GetMapping("/test/images")
	public @ResponseBody List<Image> getImages(){
		User user = new User();
		user.setId(1);
		user.setUsername("cos");
		user.setName("홍길동");
		user.setEmail("cos@nate.com");
		user.setProfileImage("my.jpg");
		
		Image img1 = new Image();
		img1.setId(1);
		img1.setCaption("음식 사진");
		img1.setLocation("food.jpg");
		img1.setLocation("부산 서면");
		img1.setUser(user);
		
		Image img2 = new Image();
		img2.setId(2);
		img2.setCaption("장난감 사진");
		img2.setLocation("game.jpg");
		img2.setLocation("서울 강남");
		img2.setUser(user);
		
		List<Image> images = new ArrayList<>();
		images.add(img1);
		images.add(img2);
		user.setImages(images);
		
		return images;
	}
	
	@GetMapping("/test/like")
	public @ResponseBody Like getLike() {
		User user = new User();
		user.setId(1);
		user.setUsername("cos");
		user.setName("홍길동");
		user.setEmail("cos@nate.com");
		user.setProfileImage("my.jpg");
		
		Image img1 = new Image();
		img1.setId(1);
		img1.setCaption("음식 사진");
		img1.setLocation("food.jpg");
		img1.setLocation("부산 서면");
		img1.setUser(user);
		
		Like like = new Like();
		like.setId(1);
		like.setUser(user);
		like.setImage(img1); 
		
		return like;
	}
	@GetMapping("/test/follows")
	public @ResponseBody List<Follow> getFollows() {
		User user1 = new User();
		user1.setId(1);
		user1.setUsername("cos");
		user1.setName("홍길동");
		user1.setEmail("cos@nate.com");
		user1.setProfileImage("my.jpg");	
		
		User user2 = new User();
		user2.setId(2);
		user2.setUsername("ssar");
		user2.setName("최예나");
		user2.setEmail("duckduck@nate.com");
		user2.setProfileImage("Yena.jpg");

		User user3 = new User();
		user3.setId(3);
		user3.setUsername("joq");
		user3.setName("조");
		user3.setEmail("joq@naver.com");
		user3.setProfileImage("jo.jpg");

		Follow follow1 = new Follow();
		follow1.setId(1);
		follow1.setFromUser(user1);
		follow1.setToUser(user2);

		Follow follow2 = new Follow();
		follow2.setId(2);
		follow2.setFromUser(user1);
		follow2.setToUser(user3);

		Follow follow3 = new Follow();
		follow3.setId(3);
		follow3.setFromUser(user2);
		follow3.setToUser(user1);

		List<Follow> follows = new ArrayList<>();
		follows.add(follow1);
		follows.add(follow2);
		follows.add(follow3);

		return follows;
	}

	@GetMapping("/auth/login")
	public String testLogin(){
		return "auth/login";
	}

	@GetMapping("/auth/join")
	public String testJoin(){
		return "auth/join";
	}

	@GetMapping("/test/profile")
	public String testProfile(){
		return "user/profile";
	}
	@GetMapping("/test/profile_edit")
	public String testProfile_edit(){
		return "user/profile_edit";
	}
	@GetMapping("/test/feed")
	public String testFeed(){
		return "image/feed";
	}
	@GetMapping("/test/upload")
	public String testUpload(){
		return "image/image_upload";
	}
}