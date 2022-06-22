package org.wecancodeit.birdwatcher;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.birdwatcher.model.About;
import org.wecancodeit.birdwatcher.repo.AboutRepository;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private AboutRepository aboutRepo;

    Map<Long, About> about = new HashMap<>();

    @Override
    public void run(String... args) throws Exception {
//        About farida = new About("Farida", "NDiaye", "Hello, I'm Farida NDiaye. " +
//                "I have an Associate degree and 2 years+ of experience in Business Management," +
//                " Biology, Chemistry, and Geology. I am passionate about traveling and discovering." +
//                " I love trying/learning new skills and taking on professional challenges." +
//                " My curiosity to understand how all these machines/applications work led me to take" +
//                " a closer look at the tech industry. So, I'm currently registered at Columbus" +
//                " State Community College in the Software Developer program and in a Bootcamp at We Can Code IT" +
//                " to learn Front-end and Back-end development.", "../images/farida.png");

        About zibad = new About("Zibad", "Maldaye", "My name is Zibad and I am full stack Java developer." +
                " I am passionate for soccer and fitness.", "../images/zibad.jpg");

        About adrian = new About("Adrian", "Colter", "I graduated Kent State University in 2018 with a Bachelor of Arts in" +
                " Communication Studies with an Applied Communication concentrationCurrent full stack web development" +
                " student at We Can Code IT.","../images/adrian.JPG");
        About cm = new About("Chuda", "Rimal", "", "../images/chuda.jpg");
        About serena = new About("Serena", "Howard", "bio","../images/serena.jpg");
        About jimmy = new About("Jimmy", "Negron", "bio", "../images/jimmy.jpg");

//        aboutRepo.save(farida);
        aboutRepo.save(zibad);
        aboutRepo.save(adrian);
        aboutRepo.save(cm);
        aboutRepo.save(serena);
        aboutRepo.save(jimmy);

    }

    }
