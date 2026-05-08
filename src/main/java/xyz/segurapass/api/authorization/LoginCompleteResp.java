package xyz.segurapass.api.authorization;

import lombok.Data;

import java.time.Instant;

@Data
public class LoginCompleteResp {
    private String M2;
    private String saltKey;
    private String accessToken;
    private String refreshToken;
    private Instant refreshTokenExpiryTime;
}
