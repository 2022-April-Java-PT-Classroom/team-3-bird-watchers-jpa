package org.wecancodeit.birdwatcher.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
