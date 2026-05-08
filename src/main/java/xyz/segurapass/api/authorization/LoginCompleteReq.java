package xyz.segurapass.api.authorization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginCompleteReq {
    private String email;
    private UUID deviceId;
    private String M1;
}
