package digitalinnovation.example.diospringtelegram.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ResultBotTelegramList {
    private Boolean ok;
    private List<GetUpdates> result;
}
