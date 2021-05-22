package com.app.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Worshipper {
@Id
    @GeneratedValue
    private int id;
    private String Name;
    private int age;
//    private int devotionLevel;
    //...that should apply to the relationship ...
@ManyToMany
    public List<Deity> deities = new ArrayList<>();
}

// https://www.baeldung.com/hibernate-many-to-many
// working