package digitalinnovation.example.diospringtelegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter @Setter
public class ResponseMessage {
    @JsonProperty("update_id")
    private Long updateId;
    private From from;
    private Chat chat;
    private Timestamp date;
    private String text;
}
