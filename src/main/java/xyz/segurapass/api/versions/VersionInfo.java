package xyz.segurapass.api.versions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VersionInfo {
    @JsonProperty("appVersion")
    private String appVersion;
    @JsonProperty("protocolVersion")
    private String protocolVersion;
    @JsonProperty("emailClientActive")
    private boolean emailClientActive;
}
