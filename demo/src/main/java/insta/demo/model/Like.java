package insta.demo.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnoreProperties({"password","name","website","bio","email","phone","gender","createDate","updateDate"})
    private User user; // id,username,profileImage

    @ManyToOne
    @JoinColumn(name = "imageId")
    @JsonIgnoreProperties({"user","likes"})
    private Image image;//기본 imageid

    @CreationTimestamp//자동 현재시간 세팅
    private Timestamp createDate;

    @CreationTimestamp
    private Timestamp updateDate;
}