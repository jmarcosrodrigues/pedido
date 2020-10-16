package com.br.myfood.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.myfood.pedido.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
