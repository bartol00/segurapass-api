package xyz.segurapass.api.password;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordChangeCompleteReq {
    @JsonProperty("deviceId")
    private UUID deviceId;
    @JsonProperty("M1")
    private String M1;
    @JsonProperty("newSaltAuth")
    private byte[] newSaltAuth;
    @JsonProperty("newVerifier")
    private String newVerifier;
    @JsonProperty("newVaultKey")
    private byte[] newVaultKey;
    @JsonProperty("newIvVaultKey")
    private byte[] newIvVaultKey;
    @JsonProperty("newSaltKey")
    private byte[] newSaltKey;
    @JsonProperty("newSaltHkdf")
    private byte[] newSaltHkdf;
    @JsonProperty("newPrivateSigningKey")
    private byte[] newPrivateSigningKey;
    @JsonProperty("newIvPrivateSigningKey")
    private byte[] newIvPrivateSigningKey;
}
