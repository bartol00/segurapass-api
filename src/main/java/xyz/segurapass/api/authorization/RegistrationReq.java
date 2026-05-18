package xyz.segurapass.api.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationReq {
    @JsonProperty("email")
    private String email;
    @JsonProperty("saltAuth")
    private String saltAuth;
    @JsonProperty("verifier")
    private String verifier;
    @JsonProperty("vaultKey")
    private String vaultKey;
    @JsonProperty("ivVaultKey")
    private String ivVaultKey;
    @JsonProperty("saltKey")
    private String saltKey;
    @JsonProperty("deviceId")
    private UUID deviceId;
}
