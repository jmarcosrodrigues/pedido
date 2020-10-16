package com.br.myfood.pedido.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.myfood.pedido.dto.OrderDto;
import com.br.myfood.pedido.entity.Order;
import com.br.myfood.pedido.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	@PostMapping("/insert")
	public ResponseEntity insertOrder(@RequestBody OrderDto orderDto) {
		
		
		Order order = new Order(null, orderDto.getIdCliente(),  orderDto.getIdRestourante(), orderDto.getIdMenu());
		
		return ResponseEntity.ok(orderService.insertOrder(order));
	}

}
