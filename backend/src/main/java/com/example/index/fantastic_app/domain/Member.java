package com.example.index.fantastic_app.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Admin")
public class Member {
    @Id
    private String id;
    private String password;

    public Member(String id, String password) {
        this.id = id;
        this.password = password;
    }

    protected Member() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
