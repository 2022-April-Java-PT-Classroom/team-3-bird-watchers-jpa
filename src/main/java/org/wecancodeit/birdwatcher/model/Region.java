package org.wecancodeit.birdwatcher.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Region {

    @Id@GeneratedValue

    private Long id;
    private String regionName;
    private String country;
    private String regionDescription;

    public Region(){

    }

    public Region(String regionName, String country, String regionDescription) {
        this.regionName = regionName;
        this.country = country;
        this.regionDescription = regionDescription;
    }


    public Long getId() {
        return id;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCountry() {
        return country;
    }

    public String getRegionDescription() {
        return regionDescription;
    }



    @Override
    public String toString() {
        return "Region{" +
                "id=" + id +
                ", regionName='" + regionName + '\'' +
                ", country='" + country + '\'' +
                ", regionDescription='" + regionDescription + '\'' +
                '}';
    }
}
