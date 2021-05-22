package com.app.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Deity {
@Id
    private String trueName;
    //do a list of titles
    private String mainTemple;

}
