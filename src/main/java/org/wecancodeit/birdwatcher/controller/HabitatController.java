package org.wecancodeit.birdwatcher.controller;

import org.springframework.stereotype.Controller;
import org.wecancodeit.birdwatcher.repo.HabitatRepository;

import javax.annotation.Resource;

@Controller
public class HabitatController {

    @Resource
    HabitatRepository habitatRepo;
}
