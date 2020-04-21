package insta.demo;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
public class Follow {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //중간 테이블 생성됨
    //fromUser가 toUser를 following
    //toUser를 fromUser가 follower
    //
    @ManyToOne
    @JoinColumn(name = "fromUserId")
    @JsonIgnoreProperties({"images"})
    private User fromUser;

    @ManyToOne
    @JoinColumn(name = "toUserId")
    @JsonIgnoreProperties({"images"})
    private User toUser;

    @Transient
    private boolean matpal;

    @CreationTimestamp//자동 현재시간 세팅
    private Timestamp createDate;
    @CreationTimestamp
    private Timestamp updateDate;
}