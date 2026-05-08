package xyz.segurapass.api.authorization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginCompleteResp {
    private String M2;
    private String saltKey;
    private String accessToken;
    private String refreshToken;
    private Instant refreshTokenExpiryTime;
}
