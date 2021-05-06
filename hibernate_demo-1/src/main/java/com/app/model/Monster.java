package com.app.model;

import javax.persistence.*;

@Entity //
@Table
public class Monster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY creates integer or long id, I think...
    private int id;
    @Column(name = "monster_name", length = 20, unique = true, nullable = false)
    private String name;
    @Column(name = "max_hp")
    //need to add constraint > 0!
    
    private int maxHP;
    @Column(name = "elemental_type", length = 20) //unique=false and nullible=true are default
    private String elementType;
    @Column(name = "damage")
    private int dmg;

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

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    //constructors
    public Monster(){

    }
    public Monster(String name, int maxhp, String elementType, int damage){
        this.setName(name);
        this.setMaxHP(maxhp);
        this.setElementType(elementType);
        this.setDmg(damage);

    }


    @Override
    public String toString() {
        return "Monster{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maxHP=" + maxHP +
                ", elementType='" + elementType + '\'' +
                ", dmg=" + dmg +
                '}';
    }
}
