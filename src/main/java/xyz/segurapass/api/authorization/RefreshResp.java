package xyz.segurapass.api.authorization;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RefreshResp {
    @JsonProperty("accessToken")
    private String accessToken;
}
