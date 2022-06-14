package org.wecancodeit.birdwatcher.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Habitat {
    @Id
    @GeneratedValue
    private Long id;
    private String HabitatType;
    private String Location;

    public Habitat(){
    }

    public Habitat(Long id, String habitatType, String location) {
        this.id = id;
        HabitatType = habitatType;
        Location = location;
    }

    public Long getId() {
        return id;
    }

    public String getHabitatType() {
        return HabitatType;
    }

    public String getLocation() {
        return Location;
    }

    @Override
    public String toString() {
        return "Habitat{" +
                "id=" + id +
                ", HabitatType='" + HabitatType + '\'' +
                ", Location='" + Location + '\'' +
                '}';
    }
}
