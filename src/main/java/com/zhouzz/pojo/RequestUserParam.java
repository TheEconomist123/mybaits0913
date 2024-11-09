package com.zhouzz.pojo;

/**
 * @author zzz
 * @version 1.0
 * @date 2024-11-05 17:43
 * @desc
 */
public class RequestUserParam {
    private String username;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "RequestUserParam{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
