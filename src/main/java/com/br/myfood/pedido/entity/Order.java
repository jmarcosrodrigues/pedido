package com.br.myfood.pedido.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.br.myfood.pedido.dto.OrderDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_ordem")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private Long idCliente;
	private Long idRestourante;
	private Long idMenu;
	
	public static Order create(OrderDto orderDto) {
		
		Order order = new Order();
		order.setIdCliente(orderDto.getIdCliente());
		order.setIdMenu(orderDto.getIdMenu());
		order.setIdRestourante(orderDto.getIdRestourante());
		
		return order;
	}
	

}
