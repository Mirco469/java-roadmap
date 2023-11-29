package net.ielpo.roadmap.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ielpo.roadmap.dto.RateDto;
import net.ielpo.roadmap.provider.RateServiceProvider;

/**
 * @author Alberto Ielpo
 */
@Service
public class RateService {

    @Autowired
    private RateServiceProvider rateServiceProvider;

    public RateDto getRate() throws IOException, InterruptedException {
        return this.rateServiceProvider.getRate();
    }

}
