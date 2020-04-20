package insta.demo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;//시퀀스
    private String username;//아이티
    private String password;//비번
    private String name;//이름
    private String website;//홈페이지
    private String bio;//자기소개
    private String email;
    private String phone;
    private String gender;

    //1. findById()때만 동작
    //2. findByUserInfo() 제외 
    @OneToMany(mappedBy = "user")
    private List<Image> images = new ArrayList<>();

    @CreationTimestamp//자동 현재시간 세팅
    private Timestamp createDate;

    @CreationTimestamp
    private Timestamp updateDate;
}