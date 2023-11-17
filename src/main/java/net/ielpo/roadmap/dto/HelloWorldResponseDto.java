package net.ielpo.roadmap.dto;

/**
 * @author Alberto Ielpo
 */
public class HelloWorldResponseDto extends BaseResponseOkDto {

    private String value;

    public HelloWorldResponseDto(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
