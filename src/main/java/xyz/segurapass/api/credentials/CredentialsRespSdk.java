package xyz.segurapass.api.credentials;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
public class CredentialsRespSdk {
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
    @JsonProperty("passwordVisible")
    private boolean passwordVisible = false;
}
