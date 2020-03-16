package digitalinnovation.example.diospringtelegram.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetUpdates {
    @JsonProperty("update_id")
    private Long updateId;
    private Message message;
}
