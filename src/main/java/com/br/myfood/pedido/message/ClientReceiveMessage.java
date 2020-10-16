package com.br.myfood.pedido.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.br.myfood.pedido.dto.ClienteOrderDto;

@Component
public class ClientReceiveMessage {
	
	@RabbitListener(queues = {"${cadastro.client.rabbitmq.queu}"})
	public void receiveMessage(@Payload ClienteOrderDto clientOrderDto) {
		
		System.out.println(clientOrderDto);
		
	}

}
