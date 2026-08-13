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
    private String M2 = null;
    @JsonProperty("vaultKey")
    private String vaultKey = null;
    @JsonProperty("ivVaultKey")
    private String ivVaultKey = null;
    @JsonProperty("saltKey")
    private String saltKey = null;
    @JsonProperty("saltHkdf")
    private String saltHkdf = null;
    @JsonProperty("privateSigningKey")
    private String privateSigningKey = null;
    @JsonProperty("publicSigningKey")
    private String publicSigningKey = null;
    @JsonProperty("ivPrivateSigningKey")
    private String ivPrivateSigningKey = null;
    @JsonProperty("accessToken")
    private String accessToken = null;
    @JsonProperty("refreshToken")
    private String refreshToken = null;
    @JsonProperty("refreshTokenExpiryTime")
    private Instant refreshTokenExpiryTime = null;
    @JsonProperty("totpCode")
    private String totpCode = null;

    public LoginCompleteResp(
            String m2,
            String vaultKey,
            String ivVaultKey,
            String saltKey,
            String saltHkdf,
            String privateSigningKey,
            String publicSigningKey,
            String ivPrivateSigningKey,
            String accessToken,
            String refreshToken,
            Instant refreshTokenExpiryTime
    ) {
        M2 = m2;
        this.vaultKey = vaultKey;
        this.ivVaultKey = ivVaultKey;
        this.saltKey = saltKey;
        this.saltHkdf = saltHkdf;
        this.privateSigningKey = privateSigningKey;
        this.publicSigningKey = publicSigningKey;
        this.ivPrivateSigningKey = ivPrivateSigningKey;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.refreshTokenExpiryTime = refreshTokenExpiryTime;
    }

    public LoginCompleteResp(String m2, String totpCode) {
        M2 = m2;
        this.totpCode = totpCode;
    }
}
