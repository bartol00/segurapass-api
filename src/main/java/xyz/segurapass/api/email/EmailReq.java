package xyz.segurapass.api.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailReq {
    private String to;
    private String subject;
    private String text;
    private String html;
}
