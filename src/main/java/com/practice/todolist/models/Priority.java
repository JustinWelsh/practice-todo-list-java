package com.practice.todolist.models;

import javax.persistence.*;

@Entity
@Table(name="priorities")
public class Priority {
//Table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String type;

//    Constructors
    public Priority() {
    }


//    Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
