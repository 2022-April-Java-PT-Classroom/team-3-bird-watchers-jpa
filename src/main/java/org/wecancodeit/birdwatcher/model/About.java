package org.wecancodeit.birdwatcher.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String memberBio;
    private String memberImageUrl;

    public About(){

    }

    public About(String firstName, String lastName, String memberBio, String memberImageUrl){
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberBio = memberBio;
        this.memberImageUrl = memberImageUrl;
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

    public String getMemberBio(){
        return memberBio;
    }

    public String getMemberImageUrl(){
        return memberImageUrl;
    }

    @Override
    public String toString() {
        return "About{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", memberBio='" + memberBio + '\'' +
                ", memberImageUrl='" + memberImageUrl + '\'' +
                '}';
    }
    
}
