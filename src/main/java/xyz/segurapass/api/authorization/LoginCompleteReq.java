package xyz.segurapass.api.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginCompleteReq {
    @JsonProperty("email")
    private String email;
    @JsonProperty("deviceId")
    private UUID deviceId;
    @JsonProperty("M1")
    private String M1;
}
