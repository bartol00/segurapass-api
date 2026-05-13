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
    @JsonProperty("saltKey")
    private String saltKey;
    @JsonProperty("accessToken")
    private String accessToken;
    @JsonProperty("refreshToken")
    private String refreshToken;
    @JsonProperty("refreshTokenExpiryTime")
    private Instant refreshTokenExpiryTime;
}
