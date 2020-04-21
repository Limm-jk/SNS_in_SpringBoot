/**
 * @author [Limm-jk]
 * @email [201602057@cs-cnu.org]
 * @create date 2020-04-20 21:35:00
 * @modify date 2020-04-20 21:35:00
 * @desc [insta_ImageData]
 */
package insta.demo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String location;//사진 위치
    private String caption;//사진 설명
    private String fileName;//사진이름
    private String filePath;//사진경로
    private String postImage;

    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnoreProperties({"password","image"})//보안
    private User user; // 소유자

    // tag list
    @OneToMany(mappedBy = "image")
    @JsonManagedReference
    private List<Tag> tags = new ArrayList<>();
    // like list
    @OneToMany(mappedBy = "image")
    private List<Like> likes = new ArrayList<>();

    @Transient//디비에 제외(영향X)
    private int likecount;


    @CreationTimestamp//자동 현재시간 세팅
    private Timestamp createDate;

    @CreationTimestamp
    private Timestamp updateDate;

}