package xyz.segurapass.api.mfa;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TotpReq {
    @JsonProperty("mfaType")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private MfaType mfaType;
    @JsonProperty("nonce")
    private String nonce;
}
