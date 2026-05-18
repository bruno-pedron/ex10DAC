package com.exemplo.consumidor;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MensagemConsumer {

    @RabbitListener(queues = RabbitConfig.NOME_FILA)
    public void consumirMensagem(String mensagem) {
        System.out.println("Mensagem recebida: " + mensagem);
    }
}
