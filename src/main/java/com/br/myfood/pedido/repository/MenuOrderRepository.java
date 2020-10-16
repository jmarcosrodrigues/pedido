package com.br.myfood.pedido.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.myfood.pedido.entity.MenuOrder;

public interface MenuOrderRepository extends JpaRepository<MenuOrder, Long> {

}
