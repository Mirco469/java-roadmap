package net.ielpo.roadmap.dto;

import java.io.Serializable;

/**
 * @author Alberto Ielpo
 */
public class ErrorResponseDto implements Serializable {
    private String message;

    public ErrorResponseDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
