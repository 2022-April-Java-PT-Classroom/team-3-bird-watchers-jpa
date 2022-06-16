package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.wecancodeit.birdwatcher.repo.CountryRepository;


import javax.annotation.Resource;

@Controller
public class CountryController {

    @Resource
    CountryRepository countryRepo;
}