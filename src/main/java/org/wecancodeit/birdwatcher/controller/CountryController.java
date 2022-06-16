package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.CountryRepository;


import javax.annotation.Resource;

@Controller
public class CountryController {

    @Resource
    CountryRepository countryRepo;

    @RequestMapping("/templates/continent.html")
    public String displayCountry(Model model){
        model.addAttribute("about", countryRepo.findAll());
        return "continent";
    }
}
