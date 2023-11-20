package net.ielpo.roadmap.dto;

public class HelloWorldRequestDto extends BaseResponseOkDto {

    // Da mettere sempre, non si sa mai
    public HelloWorldRequestDto() {
    }

    // @JsonProperty("body") => JsonProperty può essere usato per cambiare il nome
    // del campo nel payload ricevuto. Crea un automatico il getter e setter
    // Eventualmente dichiarare direttamente public
    private String[] payload;

    public String[] getPayload() {
        return payload;
    }

    public void setPayload(String[] payload) {
        this.payload = payload;
    }

}
