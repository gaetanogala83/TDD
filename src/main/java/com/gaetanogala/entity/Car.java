package com.gaetanogala.entity;

import javax.persistence.*;

@Entity
@Table(name="cars")
public class Car {

    @Id
    @SequenceGenerator(name="carSeq", sequenceName="car_id_seq", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.AUTO, generator="carSeq")
    private String type;
    private String name;

    public String getType() {
        return type;
    }

    public String getName(){

        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }
}
