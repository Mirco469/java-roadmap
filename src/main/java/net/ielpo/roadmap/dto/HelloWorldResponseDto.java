package net.ielpo.roadmap.dto;

import java.io.Serializable;

/**
 * @author Alberto Ielpo
 */
public class HelloWorldResponseDto implements Serializable {

    private String value;

    public HelloWorldResponseDto(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
