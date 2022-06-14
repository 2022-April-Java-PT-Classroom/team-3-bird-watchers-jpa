package org.wecancodeit.birdwatcher.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Country {

    private Long id;
    private String Tanzania;
    private String Morocco;

    public Country(){;
    }

    public Country(Long id, String tanzania, String Morocco) {
        this.id = id;
        this.Tanzania = tanzania;
        this.Morocco = Morocco;
    }

    public Long getId() {
        return id;
    }

    public String getTanzania() {
        return Tanzania;
    }

    public String getMorocco() {
        return Morocco;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", Tanzania='" + Tanzania + '\'' +
                ", Morocco='" + Morocco + '\'' +
                '}';
    }
}
