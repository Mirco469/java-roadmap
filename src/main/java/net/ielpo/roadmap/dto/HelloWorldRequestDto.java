package net.ielpo.roadmap.dto;

public class HelloWorldRequestDto extends BaseResponseOkDto {
    // @JsonProperty("body") => JsonProperty può essere usato per cambiare il nome
    // del campo nel payload ricevuto. Crea un automatico il getter e setter
    private String[] payload;

    public String[] getPayload() {
        return payload;
    }

    public void setPayload(String[] payload) {
        this.payload = payload;
    }

}
