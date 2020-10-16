package com.br.myfood.pedido.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.br.myfood.pedido.dto.MenuOrderDto;

@Component
public class MenuReceiveMessage {
	
	@RabbitListener(queues = {"${cadastro.menu.rabbitmq.queu}"})
	public void receiveMessage(@Payload MenuOrderDto menuOrderDto) {
		
		System.out.println(menuOrderDto);
		
	}

}
