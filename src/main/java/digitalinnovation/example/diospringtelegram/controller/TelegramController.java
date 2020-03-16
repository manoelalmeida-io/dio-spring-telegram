package digitalinnovation.example.diospringtelegram.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import digitalinnovation.example.diospringtelegram.dto.MessageSend;
import digitalinnovation.example.diospringtelegram.dto.ResultBotTelegram;
import digitalinnovation.example.diospringtelegram.dto.ResultBotTelegramList;
import digitalinnovation.example.diospringtelegram.service.TelegramService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/telegram")
public class TelegramController {
    private TelegramService telegram;
    private ObjectMapper objectMapper;

    public TelegramController(TelegramService telegram, ObjectMapper objectMapper) {
        this.telegram = telegram;
        this.objectMapper = objectMapper;
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody MessageSend messageRequest) {
        System.out.println("Entrou no post");
        telegram.enviarMensagem(messageRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<ResultBotTelegramList> buscarSoldados() {
        ResultBotTelegramList getUpdateResultBotTelegram = telegram.buscarAtualizacao();
        return ResponseEntity.ok(getUpdateResultBotTelegram);
    }
}
