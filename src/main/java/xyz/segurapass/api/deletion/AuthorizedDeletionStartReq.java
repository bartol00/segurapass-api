package xyz.segurapass.api.deletion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorizedDeletionStartReq {
    private UUID deviceId;
    private String A;
}
