package xyz.segurapass.api.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginCompleteResp {
    @JsonProperty("M2")
    private String M2;
    @JsonProperty("vaultKey")
    private String vaultKey;
    @JsonProperty("ivVaultKey")
    private String ivVaultKey;
    @JsonProperty("saltKey")
    private String saltKey;
    @JsonProperty("saltHkdf")
    private String saltHkdf;
    @JsonProperty("privateSigningKey")
    private String privateSigningKey;
    @JsonProperty("publicSigningKey")
    private String publicSigningKey;
    @JsonProperty("ivPrivateSigningKey")
    private String ivPrivateSigningKey;
    @JsonProperty("accessToken")
    private String accessToken;
    @JsonProperty("refreshToken")
    private String refreshToken;
    @JsonProperty("refreshTokenExpiryTime")
    private Instant refreshTokenExpiryTime;
}
