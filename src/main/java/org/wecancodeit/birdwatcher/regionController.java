package org.wecancodeit.birdwatcher;


import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class regionController {

    @Resource
    regionRepository regionRepo;
}
