package xyz.segurapass.api.credentials;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CredentialsReq {
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
    @JsonProperty("nonce")
    private String nonce;
    @JsonProperty("operation")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private CredentialsOperation operation;
}
