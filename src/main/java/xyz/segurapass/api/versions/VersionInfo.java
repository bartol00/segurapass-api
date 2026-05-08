package xyz.segurapass.api.versions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VersionInfo {
    private String versionNumber, versionDescription, downloadUrl;
    private LocalDate versionDate;
}
