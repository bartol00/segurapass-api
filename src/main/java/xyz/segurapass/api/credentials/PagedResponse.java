package xyz.segurapass.api.credentials;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PagedResponse<T> {
    @JsonProperty("content")
    private List<T> content;
    @JsonProperty("page")
    private int page;
    @JsonProperty("size")
    private int size;
    @JsonProperty("totalPages")
    private int totalPages;
    @JsonProperty("totalElements")
    private long totalElements;
}
