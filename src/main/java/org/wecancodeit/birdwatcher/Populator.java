package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.wecancodeit.birdwatcher.model.Continent;
import org.wecancodeit.birdwatcher.repo.*;

import javax.annotation.Resource;

@Resource
public class Populator implements CommandLineRunner {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private CountryRepository countryRepo;
    @Resource
    private HabitatRepository habitatRepo;
    @Resource
    private RegionRepository regionRepo;
    @Resource
    private BirdRepository birdRepo;
    @Resource
    private AboutRepository aboutRepo;

    @Override
    public void run(String... args) throws Exception {

        Continent africa = new Continent("Africa","Tourism is an important economic sector for many countries in Africa. " +
                "There are many countries that benefit heavily from tourism like Uganda, Algeria, Egypt, South Africa, Kenya, Morocco," +
                " Tunisia, Ghana and Tanzania");
        continentRepo.save(africa);




    }
}
