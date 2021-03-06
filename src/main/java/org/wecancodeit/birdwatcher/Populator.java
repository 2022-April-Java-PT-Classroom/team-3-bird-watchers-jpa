package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.model.About;

import org.wecancodeit.birdwatcher.model.Bird;
import org.wecancodeit.birdwatcher.model.Continent;
import org.wecancodeit.birdwatcher.model.Country;


import org.wecancodeit.birdwatcher.repo.AboutRepository;
import org.wecancodeit.birdwatcher.repo.BirdRepository;
import org.wecancodeit.birdwatcher.repo.ContinentRepository;
import org.wecancodeit.birdwatcher.repo.CountryRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private AboutRepository aboutRepo;
    @Resource
    private ContinentRepository continentStorage;
    @Resource
    private CountryRepository countryStorage;
    @Resource
    private BirdRepository birdStorage;


    @Override
    public void run(String... args) throws Exception {
        Continent continent = new Continent("Africa", "continent rich in various types of beautiful birds");
        continentStorage.save(continent);
        Country Tanzania = new Country("Tanzania", "/images/map-of-tanzania.png",
                "Tanzania is home to some of Africa's most famous national parks" +
                        " and natural attractions, including majestic Mount Kilimanjaro.",
                "Tanzania has a lot of attractive places like Katavi National Park.");
        countryStorage.save(Tanzania);
        Country Morocco = new Country("Morocco", "/images/map-of-morocco.png",
                "Morocco is home to the world's largest desert known as the Sahara desert!",
                "Morocco is home for various sites like the coastal wetlands of Oualidia and " +
                        "the Souss-Massa National Park.");
        countryStorage.save(Morocco);

        About farida = new About("Farida", "NDiaye", "I have an Associate degree and 2 years+ of experience in Business" +
                " Management. I am passionate about traveling and discovering. I love learning new skills and taking on professional challenges." +
                " I'm currently learning web development at We Can Code IT", "../images/farida.png");

        About zibad = new About("Zibad", "Maldaye", "My name is Zibad and I am full stack Java developer." +
                " I am passionate for soccer and fitness.", "../images/zibad.jpg");

        About adrian = new About("Adrian", "Colter", "I graduated Kent State University in 2018 with a Bachelor of Arts in" +
                " Communication Studies with an Applied Communication concentration Current full stack web development" +
                " student at We Can Code IT.", "../images/adrian.JPG");

        About cm = new About("Chuda", "Rimal", "Front/Back End Web Developer based in Columbus, Ohio.", "../images/chuda.jpg");

        About serena = new About("Serena", "Howard", "Full-Stack Developer based in Columbus, Ohio", "../images/serena.jpg");

        About jimmy = new About("Jimmy", "Negron", "I am software developer started my journey to become a software developer with we can code it in april-2022. I am excited to see where this career takes me .", "../images/jimmy.jpg");

        aboutRepo.save(farida);
        aboutRepo.save(zibad);
        aboutRepo.save(adrian);
        aboutRepo.save(cm);
        aboutRepo.save(serena);
        aboutRepo.save(jimmy);


        Bird ostrich = new Bird("Ostrich", "Tall, long-legged", "/images/ostrich.jpg");
        Bird flamingos = new Bird("Flamingos", "Pink, large bird", "/images/flamingos.jpg");
        Bird cuckoos = new Bird("Cuckoos", "Small, brown bird", "/images/cuckoos.jpg");

        birdStorage.save(ostrich);
        birdStorage.save(flamingos);
        birdStorage.save(cuckoos);

    }
}