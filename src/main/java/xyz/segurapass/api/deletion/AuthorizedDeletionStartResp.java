package xyz.segurapass.api.deletion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizedDeletionStartResp {
    private String B;
    private String saltAuth;
}
