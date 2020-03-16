package digitalinnovation.example.diospringtelegram.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter @Setter
public class Message {
    private String id;
    private From from;
    private Chat chat;
    private Timestamp date;
    private String text;
}
