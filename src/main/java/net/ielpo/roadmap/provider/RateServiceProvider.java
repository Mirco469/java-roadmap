package net.ielpo.roadmap.provider;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.ielpo.roadmap.dto.RateDto;

/**
 * @author Alberto Ielpo
 */
@Service
public class RateServiceProvider {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private HttpRequest request;

    @Autowired
    private HttpClient httpClient;

    @Autowired
    private ObjectMapper objectMapper;

    public RateServiceProvider() throws URISyntaxException {
        this.request = HttpRequest.newBuilder()
                .uri(new URI("http://ielpo.net:3000/rate"))
                .timeout(Duration.ofSeconds(5)).GET().build();
    }

    public RateDto getRate() throws IOException, InterruptedException {
        logger.info("calling getRate...");

        HttpResponse<byte[]> res = httpClient.send(this.request, HttpResponse.BodyHandlers.ofByteArray());
        int statusCode = res.statusCode();
        logger.info("status code {}", statusCode);

        if (statusCode < 200 || statusCode > 299) {
            throw new HttpServerErrorException(HttpStatusCode.valueOf(500), "Something went wrong calling getRate");
        }

        return objectMapper.readValue(res.body(), RateDto.class);

    }

}
