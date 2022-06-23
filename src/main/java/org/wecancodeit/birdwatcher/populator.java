package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.model.Continent;
import org.wecancodeit.birdwatcher.model.Country;
import org.wecancodeit.birdwatcher.repo.AboutRepository;
import org.wecancodeit.birdwatcher.repo.BirdRepository;
import org.wecancodeit.birdwatcher.repo.ContinentRepository;
import org.wecancodeit.birdwatcher.repo.CountryRepository;

import javax.annotation.Resource;

@Component
public class populator implements CommandLineRunner {

    @Resource
    private ContinentRepository continentStorage;
    @Resource
    private CountryRepository countryStorage;
    @Resource
    private AboutRepository aboutStorage;
    @Resource
    private BirdRepository birdStorage;

    @Override
    public void run(String... args) throws Exception {
        Continent continent = new Continent("Africa", "continent rich in various types of beautiful birds");
        continentStorage.save(continent);
        Country Tanzania = new Country("Tanzania", "/images/map-of-tanzania.png",
                "Tanzania is home to some of Africa's most famous national parks" +
                        " and natural attractions, including majestic Mount Kilimanjaro. It has a lot of attractive sites " +
                        "that host many types of beautiful birds",
                "Tanzania has a lot of attractive places like Katavi National Park.");
        countryStorage.save(Tanzania);
        Country Morocco = new Country("Morocco", "/images/map-of-morocco.png",
                "Morocco is home to the world's largest desert known as the Sahara desert! " +
                        "The country has many sites that are rich " +
                        "in many unique types of birds.",
                "Morocco is home for various sites like the coastal wetlands of Oualidia and " +
                        "the Souss-Massa National Park.");
        countryStorage.save(Morocco);


    }
}
