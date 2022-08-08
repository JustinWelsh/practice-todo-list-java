package com.practice.todolist.models;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
//    Table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String description;

    @OneToOne
    private Priority priority;

//    Constructors
    public Task() {
    }


//    Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
