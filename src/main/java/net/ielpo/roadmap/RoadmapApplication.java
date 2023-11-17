package net.ielpo.roadmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Alberto Ielpo
 * @apiNote Roadmap java project - MVC spring boot
 */
@SpringBootApplication
public class RoadmapApplication {

    public static void main(String[] args) throws Exception {
        Thread.sleep(4000);
        SpringApplication.run(RoadmapApplication.class, args);
    }

}
