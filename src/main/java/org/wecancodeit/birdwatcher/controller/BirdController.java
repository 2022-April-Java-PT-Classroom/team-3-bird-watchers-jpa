package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.BirdRepository;

import javax.annotation.Resource;

@Controller
public class BirdController {

    @Resource
    private BirdRepository birdRepo;


    @RequestMapping("/bird")
    public String displayBird(){

        return "bird";
    }
}
