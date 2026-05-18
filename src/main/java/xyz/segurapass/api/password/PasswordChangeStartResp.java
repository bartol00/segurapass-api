package xyz.segurapass.api.password;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasswordChangeStartResp {
    @JsonProperty("B")
    private String B;
    @JsonProperty("saltAuth")
    private String saltAuth;
}
