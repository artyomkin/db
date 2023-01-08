package com.example.kurs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Body {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer max_hit_points;
    private Integer cost;

    public Body() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMax_hit_points() {
        return max_hit_points;
    }

    public void setMax_hit_points(Integer max_hit_points) {
        this.max_hit_points = max_hit_points;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}