package com.dominik.springboottodoapplication.models;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todo_item")
public class TodoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    @NotBlank(message = "Description is required")
    private String description;

    @Getter
    @Setter
    private Double cost;

    @Getter
    @Setter
    private Instant createdDate;

    public TodoItem() {}

    public TodoItem(String description, double cost) {
        this.description = description;
        this.cost = cost;

        this.createdDate = Instant.now();
    }
    
    @Override
    public String toString() {
        return String.format("TodoItem{description='%s', cost=.2%f,createdDate='%s',}",
        description, cost, createdDate);
    }
}
