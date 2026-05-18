package xyz.segurapass.api.password;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordChangeStartReq {
    @JsonProperty("deviceId")
    private UUID deviceId;
    @JsonProperty("A")
    private String A;
}
