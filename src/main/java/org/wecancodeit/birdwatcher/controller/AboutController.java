package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.repo.AboutRepository;

import javax.annotation.Resource;

@Controller
@RequestMapping("/about")
public class AboutController {

    @Resource
    private AboutRepository aboutRepo;
}