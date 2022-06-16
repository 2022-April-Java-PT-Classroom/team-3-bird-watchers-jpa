package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.AboutRepository;

import javax.annotation.Resource;

@Controller
public class AboutController {

    @Resource
    private AboutRepository aboutRepo;

    @RequestMapping("/templates/about.html")
    public String displayAbout(Model model){
        model.addAttribute("about", aboutRepo.findAll());
        return "about";
    }

    @RequestMapping("/templates/index.html")
    public String displayHome(Model model){
        model.addAttribute("about", aboutRepo.findAll());
        return "index";
    }
}