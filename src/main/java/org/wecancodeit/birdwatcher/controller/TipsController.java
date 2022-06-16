package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.CountryRepository;

import javax.annotation.Resource;

@Controller
public class TipsController {
    @Resource
    CountryRepository tipsRepo;

    @RequestMapping("/templates/tips.html")
    public String displayBlog(Model model){
        model.addAttribute("about", tipsRepo.findAll());
        return "tips";
    }


}
