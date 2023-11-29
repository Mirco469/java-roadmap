package net.ielpo.roadmap.dto;

import java.util.Map;

import org.springframework.http.HttpStatusCode;

/**
 * @author Alberto Ielpo
 */
public class BodyStatusDto {
    private Map<String, Object> body;
    private HttpStatusCode status;

    public BodyStatusDto(Map<String, Object> body, HttpStatusCode status) {
        this.body = body;
        this.status = status;
    }

    public Map<String, Object> getBody() {
        return body;
    }

    public HttpStatusCode getStatus() {
        return status;
    }

}
