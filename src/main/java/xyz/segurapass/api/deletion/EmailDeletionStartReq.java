package xyz.segurapass.api.deletion;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailDeletionStartReq {
    @JsonProperty("email")
    private String email;
}
