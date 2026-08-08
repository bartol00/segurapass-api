package xyz.segurapass.api.mfa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TotpVerifyResp {
    private String recoveryCode;
}
