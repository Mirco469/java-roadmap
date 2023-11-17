package net.ielpo.roadmap.dto;

/**
 * @author Alberto Ielpo
 */
public class HelloWorldResponseDto extends BaseResponseOkDto {

    private String value;

    public HelloWorldResponseDto() {
    };

    public HelloWorldResponseDto(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("HelloWorldResponseDto [value=%s]", this.value);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HelloWorldResponseDto other = (HelloWorldResponseDto) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

}
