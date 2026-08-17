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
    private byte[] saltAuth;
    @JsonProperty("verifier")
    private String verifier;
    @JsonProperty("vaultKey")
    private byte[] vaultKey;
    @JsonProperty("ivVaultKey")
    private byte[] ivVaultKey;
    @JsonProperty("saltKey")
    private byte[] saltKey;
    @JsonProperty("saltHkdf")
    private byte[] saltHkdf;
    @JsonProperty("privateSigningKey")
    private byte[] privateSigningKey;
    @JsonProperty("publicSigningKey")
    private byte[] publicSigningKey;
    @JsonProperty("ivPrivateSigningKey")
    private byte[] ivPrivateSigningKey;
    @JsonProperty("deviceId")
    private UUID deviceId;
}
