package com.exemplo.produtor;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    public static final String NOME_FILA = "fila.texto";

    @Bean
    public Queue filaTexto() {
        return new Queue(NOME_FILA, true);
    }
}
