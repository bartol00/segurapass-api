package xyz.segurapass.api.deletion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizedDeletionStartReq {
    @JsonProperty("deviceId")
    private UUID deviceId;
    @JsonProperty("A")
    private String A;
}
