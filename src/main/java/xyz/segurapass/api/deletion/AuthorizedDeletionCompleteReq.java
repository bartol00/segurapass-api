package xyz.segurapass.api.deletion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizedDeletionCompleteReq {
    private UUID deviceId;
    private String M1;
}
