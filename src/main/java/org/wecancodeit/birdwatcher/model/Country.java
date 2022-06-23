package org.wecancodeit.birdwatcher.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String imageUrl;
    private String description;
    private String sites;


    public Country(){;
    }

    public Country(String name, String imageUrl, String description, String sites) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
        this.sites = sites;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getSites() {
        return sites;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", sites='" + sites + '\'' +
                '}';
    }
}
