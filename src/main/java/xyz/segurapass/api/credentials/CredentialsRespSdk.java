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
    private byte[] website;
    @JsonProperty("username")
    private byte[] username;
    @JsonProperty("password")
    private byte[] password;
    @JsonProperty("ivWebsite")
    private byte[] ivWebsite;
    @JsonProperty("ivUsername")
    private byte[] ivUsername;
    @JsonProperty("ivPassword")
    private byte[] ivPassword;
    @JsonProperty("createdAt")
    private Instant createdAt;
    @JsonProperty("lastUpdated")
    private Instant lastUpdated;
    @JsonProperty("passwordVisible")
    private boolean passwordVisible = false;
}
