package xyz.segurapass.api.credentials;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CredentialsReq {
    @JsonProperty("website")
    private String website;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("ivWebsite")
    private String ivWebsite;
    @JsonProperty("ivUsername")
    private String ivUsername;
    @JsonProperty("ivPassword")
    private String ivPassword;
}
