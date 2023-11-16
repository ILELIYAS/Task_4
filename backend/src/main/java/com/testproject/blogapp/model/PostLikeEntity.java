package com.testproject.blogapp.model;

import com.testproject.blogapp.utils.Constants;
import jakarta.persistence.*;

@Entity
//@Table(name = "post_like", schema = Constants.SCHEMA_NAME)
public class PostLikeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
//    @Column(name = "id")
    private Integer id;
    @ManyToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userByUserId;
    @ManyToOne
//    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private PostEntity postByPostId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostLikeEntity that = (PostLikeEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public UserEntity getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(UserEntity userByUserId) {
        this.userByUserId = userByUserId;
    }

    public PostEntity getPostByPostId() {
        return postByPostId;
    }

    public void setPostByPostId(PostEntity postByPostId) {
        this.postByPostId = postByPostId;
    }
}
