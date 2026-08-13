package xyz.segurapass.api.mfa;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TotpResp {
    @JsonProperty("totpUrl")
    private String totpUrl;
}
