package com.acl.rempill_app.model;


import javax.persistence.*;

@Entity
@Table(name = "data")
public class DataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "age", nullable = false)
    private int age;
    @Column(name = "weight", nullable = false)
    private double weight;
    @Column(name = "height", nullable = false)
    private double height;
    @Column(name = "glucoselevel", nullable = true)
    private double glucoselevel;
    @Column(name = "bloodpressure", nullable = true)
    private String bloodpressure;


    public DataEntity() {
    }

    public DataEntity(Long id, int age, double weight, double height, double glucoselevel, String bloodpressure) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.glucoselevel = glucoselevel;
        this.bloodpressure = bloodpressure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getGlucoselevel() {
        return glucoselevel;
    }

    public void setGlucoselevel(double glucoselevel) {
        this.glucoselevel = glucoselevel;
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }
}
