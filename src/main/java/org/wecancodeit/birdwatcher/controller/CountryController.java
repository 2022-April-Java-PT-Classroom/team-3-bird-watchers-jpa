package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.CountryRepository;


import javax.annotation.Resource;

@Controller
public class CountryController {

    @RequestMapping("templates/country.html")
    public String displayContinentPointingCountry(){

        return "country";
    }
}