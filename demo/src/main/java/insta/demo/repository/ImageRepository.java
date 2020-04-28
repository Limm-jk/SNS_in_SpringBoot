package insta.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import insta.demo.model.Image;

public interface ImageRepository extends JpaRepository<Image, Integer> {
    
}