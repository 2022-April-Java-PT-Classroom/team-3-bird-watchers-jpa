
package org.wecancodeit.birdwatcher.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Objects;

@Entity
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String bio;
    private String imgUrl;


    public About(){

    }

    public About(String firstName, String lastName, String bio, String imgUrl){
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.imgUrl = imgUrl;
    }

    public Long getId(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getBio(){
        return bio;
    }

    public String getImgUrl(){
        return imgUrl;
    }


    @Override
    public String toString() {
        return "About{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bio='" + bio + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        About about = (About) o;
        return id.equals(about.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
