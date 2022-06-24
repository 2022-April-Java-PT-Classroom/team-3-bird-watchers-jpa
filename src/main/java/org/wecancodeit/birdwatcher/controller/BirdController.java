package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.birdwatcher.repo.BirdRepository;

import javax.annotation.Resource;

@Controller
public class BirdController {

    @Resource
    private BirdRepository birdRepo;


    @RequestMapping("/bird")
    public String displayBirds(@RequestParam(value = "id") Long id, Model model) {
        model.addAttribute("bird", birdRepo.findById(id).get());
        return "bird.html";
    }
}