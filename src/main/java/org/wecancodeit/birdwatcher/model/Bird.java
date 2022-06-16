package org.wecancodeit.birdwatcher.model;

import javax.annotation.Resource;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bird {
    public String name;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String description;
    public String type;

    public Bird() {

    }

    public Bird(String name, String description, String type) {
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
