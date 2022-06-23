package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.birdwatcher.repo.CountryRepository;


import javax.annotation.Resource;

@Controller
public class CountryController {
    @Resource
    CountryRepository countryRepo;

    @RequestMapping("templates/country")
    public String displayContinentPointingCountry(@RequestParam(value ="id") Long id, Model model){
        model.addAttribute("country", countryRepo.findById(id).get());

        return "country.html";
    }
}