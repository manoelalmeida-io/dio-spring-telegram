package digitalinnovation.example.diospringtelegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MessageSend {
    @JsonProperty("chat_id")
    private String chatId;
    private String text;
}
