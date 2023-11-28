package net.ielpo.roadmap.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import net.ielpo.roadmap.annotation.LogAround;

/**
 * @author Alberto Ielpo
 */
@Service
public class HelloWorldService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @LogAround
    public void executeSomething() {
        logger.info("execute something");
    }
}
