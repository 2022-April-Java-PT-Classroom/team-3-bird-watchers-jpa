package org.wecancodeit.birdwatcher.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.RegionRepository;

import javax.annotation.Resource;

@Controller
public class RegionController {

    @Resource
    RegionRepository regionRepo;
    @RequestMapping("/regions")
    public String displayRegions(){


        return "regions";
    }
}
