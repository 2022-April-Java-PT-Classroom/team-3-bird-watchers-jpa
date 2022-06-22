package org.wecancodeit.birdwatcher.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LookBook {
    @Id@GeneratedValue

    private Long id;
    private String birdName;
    private String birdType;
    private String birdRarity;
    private String habitat;
    private String region;
    private String continent;
    private String birdImageUrl;

    public LookBook(String birdName, String birdType, String birdRarity, String habitat, String region, String continent, String birdImageUrl) {
        this.birdName = birdName;
        this.birdType = birdType;
        this.birdRarity = birdRarity;
        this.habitat = habitat;
        this.region = region;
        this.continent = continent;
        this.birdImageUrl = birdImageUrl;
    }

    public Long getId() {
        return id;
    }
    public String getBirdName() {
        return birdName;
    }

    public String getBirdType() {
        return birdType;
    }

    public String getBirdRarity() {
        return birdRarity;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getRegion() {
        return region;
    }

    public String getContinent() {
        return continent;
    }

    public String getBirdImageUrl() {
        return birdImageUrl;
    }

    @Override
    public String toString() {
        return "LookBook{" +
                "id=" + id +
                ", birdName='" + birdName + '\'' +
                ", birdType='" + birdType + '\'' +
                ", birdRarity='" + birdRarity + '\'' +
                ", habitat='" + habitat + '\'' +
                ", region='" + region + '\'' +
                ", continent='" + continent + '\'' +
                ", birdImageUrl='" + birdImageUrl + '\'' +
                '}';
    }
}


