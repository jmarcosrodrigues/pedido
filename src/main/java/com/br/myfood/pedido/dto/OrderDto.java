package com.br.myfood.pedido.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
	
	private Long idCliente;
	private Long idRestourante;
	private Long idMenu;
	
}
