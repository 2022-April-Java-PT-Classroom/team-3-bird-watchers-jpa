package org.wecancodeit.birdwatcher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContinentController {

    @RequestMapping("/continent")

    public String displayContinent(){


        return "continent";
    }
}