package com.pmtu.edu.school.model;

import java.io.Serializable;

/**
 * Created by pmtu on 11/3/2017.
 */
public class employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private int department;
    private String email;
    private  String birthday;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
