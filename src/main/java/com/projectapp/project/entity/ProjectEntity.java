package com.projectapp.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class ProjectEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "testid")
    private Integer testid;

    @Column(name = "name")
    private String name;

    @Column(name = "agefrom")
    private Integer agefrom;

    @Column(name = "ageto")
    private Integer ageto;

    @Column(name = "gender")
    private String gender;

    @Column(name = "minresult")
    private Float minresult;

    @Column(name = "maxresult")
    private Float maxresult;

    @Column(name = "unit")
    private String unit;

    public ProjectEntity() {
    }

    public ProjectEntity(Integer id, Integer testid, String name, Integer agefrom, Integer ageto, String gender,
            Float minresult, Float maxresult, String unit) {
        this.id = id;
        this.testid = testid;
        this.name = name;
        this.agefrom = agefrom;
        this.ageto = ageto;
        this.gender = gender;
        this.minresult = minresult;
        this.maxresult = maxresult;
        this.unit = unit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTestid() {
        return testid;
    }

    public void setTestId(Integer testid) {
        this.testid = testid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAgefrom() {
        return agefrom;
    }

    public void setAgefrom(Integer agefrom) {
        this.agefrom = agefrom;
    }

    public Integer getAgeto() {
        return ageto;
    }

    public void setAgeto(Integer ageto) {
        this.ageto = ageto;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Float getMinresults() {
        return minresult;
    }

    public void setMinresults(Float minresults) {
        this.minresult = minresults;
    }

    public Float getMaxresults() {
        return maxresult;
    }

    public void setMaxresults(Float maxresults) {
        this.maxresult = maxresults;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
