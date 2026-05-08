package xyz.segurapass.api.authorization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefreshReq {
    private String email;
    private UUID deviceId;
    private String refreshToken;
}
