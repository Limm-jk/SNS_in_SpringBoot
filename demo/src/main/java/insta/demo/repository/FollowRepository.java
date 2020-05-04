package insta.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import insta.demo.model.Follow;

public interface FollowRepository extends JpaRepository<Follow, Integer> {
    // 언팔  
    void deleteByFromUserIdAndToUserId(int fromUserId, int toUserId);
}