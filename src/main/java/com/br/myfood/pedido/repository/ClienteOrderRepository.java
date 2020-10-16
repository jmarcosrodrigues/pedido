package com.br.myfood.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.myfood.pedido.entity.ClienteOrder;

public interface ClienteOrderRepository extends JpaRepository<ClienteOrder, Long> {

}
