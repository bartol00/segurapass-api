package xyz.segurapass.api.credentials;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CredentialsResp {
    private UUID credentialsId;
    private String website;
    private String username;
    private String password;
    private String ivWebsite;
    private String ivUsername;
    private String ivPassword;
    private Instant lastUpdated;
}
