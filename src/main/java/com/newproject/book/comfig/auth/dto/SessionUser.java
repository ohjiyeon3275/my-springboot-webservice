package com.newproject.book.comfig.auth.dto;

import com.newproject.book.web.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;


    public SessionUser(User user){
        this.name = user.getName();
        this.name = user.getEmail();
        this.name = user.getPicture();
    }

}
