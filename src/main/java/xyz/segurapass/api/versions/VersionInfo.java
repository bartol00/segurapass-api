package xyz.segurapass.api.versions;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VersionInfo {
    @JsonProperty("versionNumber")
    private String versionNumber;
    @JsonProperty("versionDescription")
    private String versionDescription;
    @JsonProperty("downloadUrl")
    private String downloadUrl;
    @JsonProperty("versionDate")
    private LocalDate versionDate;
}
