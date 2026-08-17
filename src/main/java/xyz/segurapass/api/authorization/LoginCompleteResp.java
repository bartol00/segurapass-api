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
    private byte[] vaultKey = null;
    @JsonProperty("ivVaultKey")
    private byte[] ivVaultKey = null;
    @JsonProperty("saltKey")
    private byte[] saltKey = null;
    @JsonProperty("saltHkdf")
    private byte[] saltHkdf = null;
    @JsonProperty("privateSigningKey")
    private byte[] privateSigningKey = null;
    @JsonProperty("publicSigningKey")
    private byte[] publicSigningKey = null;
    @JsonProperty("ivPrivateSigningKey")
    private byte[] ivPrivateSigningKey = null;
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
            byte[] vaultKey,
            byte[] ivVaultKey,
            byte[] saltKey,
            byte[] saltHkdf,
            byte[] privateSigningKey,
            byte[] publicSigningKey,
            byte[] ivPrivateSigningKey,
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
