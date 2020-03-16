package digitalinnovation.example.diospringtelegram.client;

import digitalinnovation.example.diospringtelegram.dto.MessageSend;
import digitalinnovation.example.diospringtelegram.dto.ResultBotTelegram;
import digitalinnovation.example.diospringtelegram.dto.ResultBotTelegramList;
import feign.Headers;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@FeignClient(url = "${telegram.api}${telegram.token}", name = "telegram")
public interface FeingClient {

    @GetMapping("/getUpdates")
    ResponseEntity<ResultBotTelegramList> buscaratualizacao();

    @Headers("MEU_HEADER: {meu_header}")
    @GetMapping("/getUpdates")
    ResponseEntity<ResultBotTelegramList> buscarAtualizacao1(@Param("meu_header") String header);

    @PostMapping("/sendMessage")
    ResponseEntity<ResultBotTelegram> enviarMensagem(@RequestBody MessageSend msg);

    @PostMapping("/sendMessage")
    @ResponseBody
    ResultBotTelegram enviarMensagem1(@RequestBody MessageSend msg);

    @PostMapping(value = "/sendMessage")
    ResultBotTelegram enviarMensagem3(@RequestBody MessageSend msg, @RequestHeader("MEU_HEADER") String header);

    @RequestMapping(method = RequestMethod.POST, value = "/sendMessage")
    ResultBotTelegram enviarMensagem5(@RequestBody MessageSend msg);

    @GetMapping("/getUpdates/{meuTeste}")
    ResultBotTelegram examplePathVariable(@PathVariable("meuTeste") String meuTeste);

    //Exemplo de request param
    //www.minhaUrl.com.br/getUpdates?nome=nomeInformado
    @GetMapping("/getUpdates")
    ResultBotTelegram exampleRequestParam(@RequestParam("nome") String nome);
}
