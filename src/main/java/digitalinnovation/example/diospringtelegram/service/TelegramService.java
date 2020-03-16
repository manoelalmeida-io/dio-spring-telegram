package digitalinnovation.example.diospringtelegram.service;

import digitalinnovation.example.diospringtelegram.client.FeingClient;
import digitalinnovation.example.diospringtelegram.client.JavaHttpClient;
import digitalinnovation.example.diospringtelegram.client.RestTemplateClient;
import digitalinnovation.example.diospringtelegram.dto.MessageSend;
import digitalinnovation.example.diospringtelegram.dto.ResultBotTelegram;
import digitalinnovation.example.diospringtelegram.dto.ResultBotTelegramList;
import org.springframework.stereotype.Service;

@Service
public class TelegramService {
    private RestTemplateClient restTemplateClient;
    private FeingClient feingClient;
    private JavaHttpClient javaHttpClient;

    public TelegramService(RestTemplateClient restTemplateClient, FeingClient feingClient, JavaHttpClient javaHttpClient) {
        this.restTemplateClient = restTemplateClient;
        this.feingClient = feingClient;
        this.javaHttpClient = javaHttpClient;
    }

    public void enviarMensagem(MessageSend mensagem) {
        ResultBotTelegram resultBotTelegramResponseEntity = javaHttpClient.enviarMensagem(mensagem);
        restTemplateClient.enviarMensagem(mensagem);
        ResultBotTelegram resultBotTelegram = feingClient.enviarMensagem1(mensagem);
    }

    public ResultBotTelegramList buscarAtualizacao() {
        ResultBotTelegramList resultBotTelegramList = javaHttpClient.buscarAtualizacao();
        ResultBotTelegramList resultBotTelegramList1 = restTemplateClient.buscarAtualizacao();

        feingClient.buscaratualizacao();
        return resultBotTelegramList;
    }
}
