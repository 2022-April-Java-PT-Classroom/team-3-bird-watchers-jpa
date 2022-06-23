package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.CountryRepository;

import javax.annotation.Resource;

@Controller
public class BlogController {
    @Resource
    CountryRepository blogRepo;

    @RequestMapping("/templates/blog.html")
    public String displayBlog(Model model){
        model.addAttribute("blog", blogRepo.findAll());
        return "blog";
    }


}
