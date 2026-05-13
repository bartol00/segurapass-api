package xyz.segurapass.api.credentials;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CredentialsResp {
    @JsonProperty("credentialsId")
    private UUID credentialsId;
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
    @JsonProperty("lastUpdated")
    private Instant lastUpdated;
}
