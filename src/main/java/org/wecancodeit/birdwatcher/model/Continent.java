package org.wecancodeit.birdwatcher.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Continent {
    private String name;
    private String description;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Continent(){

    }

    public Continent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
