package insta.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import insta.demo.model.Follow;

public interface FollowRepository extends JpaRepository<Follow, Integer> {
    void deleteByFromUserIdAndToUserId(int fromUserId, int toUserId);
}