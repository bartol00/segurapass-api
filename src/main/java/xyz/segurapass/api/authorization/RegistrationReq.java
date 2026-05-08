package xyz.segurapass.api.authorization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationReq {
    private String email;
    private String saltAuth;
    private String verifier;
    private String saltKey;
    private UUID deviceId;
}
