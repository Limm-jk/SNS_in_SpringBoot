package insta.demo;

import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.hibernate.annotations.CreationTimestamp;

public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnoreProperties({"password"})//보안
    private User user; // 소유자

    @ManyToOne
    @JoinColumn(name = "imageId")
    private Image image;

    @CreationTimestamp//자동 현재시간 세팅
    private Timestamp createDate;

    @CreationTimestamp
    private Timestamp updateDate;
}