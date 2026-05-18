package com.exemplo.produtor;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {

    private final RabbitTemplate rabbitTemplate;

    public MensagemController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping
    public ResponseEntity<String> enviarMensagem(@RequestBody String mensagem) {
        rabbitTemplate.convertAndSend(RabbitConfig.NOME_FILA, mensagem);
        return ResponseEntity.ok("Mensagem enviada para a fila: " + mensagem);
    }
}
