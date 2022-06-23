package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.ContinentRepository;
import org.wecancodeit.birdwatcher.repo.CountryRepository;

import javax.annotation.Resource;

@Controller
public class ContinentController {

    @Resource
    private ContinentRepository continentRepo;
    @Resource
    private CountryRepository countryRepo;

    @RequestMapping("templates/continent.html")

    public String displayContinent(Model model){
        model.addAttribute("continents", continentRepo.findAll());
        model.addAttribute("countries", countryRepo.findAll());



        return "continents";
    }

}