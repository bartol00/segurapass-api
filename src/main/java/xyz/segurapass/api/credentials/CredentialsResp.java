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
    private byte[] websiteBytes;
    @JsonProperty("username")
    private byte[] usernameBytes;
    @JsonProperty("password")
    private byte[] passwordBytes;
    @JsonProperty("ivWebsite")
    private byte[] ivWebsiteBytes;
    @JsonProperty("ivUsername")
    private byte[] ivUsernameBytes;
    @JsonProperty("ivPassword")
    private byte[] ivPasswordBytes;
    @JsonProperty("createdAt")
    private Instant createdAt;
    @JsonProperty("lastUpdated")
    private Instant lastUpdated;
}
