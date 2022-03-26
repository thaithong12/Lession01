package com.company;

public class Student {
    private int id;
    private String name;
    private String className;
    private Double dht;


    public Student(int id, String name, String className, Double dht) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.dht = dht;
    }

    public Student() {

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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Double getDht() {
        return dht;
    }

    public void setDht(Double dht) {
        this.dht = dht;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", dht=" + dht +
                '}';
    }
}
