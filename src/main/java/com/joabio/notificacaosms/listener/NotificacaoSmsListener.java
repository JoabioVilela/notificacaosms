package com.joabio.notificacaosms.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.joabio.notificacaosms.config.ConfiguracaoRabbitMQ;
import com.joabio.notificacaosms.constante.MensagemConstante;
import com.joabio.notificacaosms.domain.Client;

@Component
public class NotificacaoSmsListener {

     @RabbitListener(queues = ConfiguracaoRabbitMQ.QUEUE_NAME)
    public void notificacaoSms(Client client) {
        
        String mensagem = String.format(MensagemConstante.TICKET_REGISTRADO, client.getName());
        
        System.out.println(mensagem + "\nMensagem enviada para Telefone: " + client.getTelefone() + "\n----------------------------------------------------------------------");
        
    }

}