package com.br.myfood.pedido.message;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.br.myfood.pedido.dto.ClienteOrderDto;
import com.br.myfood.pedido.entity.ClienteOrder;
import com.br.myfood.pedido.repository.ClienteOrderRepository;

@Component
public class ClientReceiveMessage {
	
	private final ClienteOrderRepository clienteOrderRepository;
	
	public ClientReceiveMessage(ClienteOrderRepository clienteOrderRepository) {
		this.clienteOrderRepository = clienteOrderRepository;
	}


	@RabbitListener(queues = {"${cadastro.client.rabbitmq.queu}"})
	public void receiveMessage(@Payload ClienteOrderDto clientOrderDto) {
		
		clienteOrderRepository.save(new ClienteOrder(null, clientOrderDto.getIdCliente()));
		
	}

}
