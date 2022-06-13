package org.wecancodeit.birdwatcher;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Continent {
    private String name;
    @Id
    @GeneratedValue
    private Long id;

    public Continent(){

    }

    public Continent(String name) {
        this.name = name;
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
