package org.wecancodeit.birdwatcher.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.AboutRepository;
import org.wecancodeit.birdwatcher.repo.RegionRepository;

import javax.annotation.Resource;

@Controller
public class RegionController {

    @Resource
    RegionRepository regionRepo;

    @RequestMapping("templates/region.html")
    public String displayRegion(Model model){
        model.addAttribute("region", regionRepo.findAll());
        return "region";
    }
}
