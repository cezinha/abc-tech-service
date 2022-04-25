package br.com.fiap.abctechservice.application;

import br.com.fiap.abctechservice.application.dto.OrderDto;
import br.com.fiap.abctechservice.model.Order;

import java.util.List;

public interface OrderApplication {

    void createOrder(OrderDto orderDto);
    public List<OrderDto> getOrders(Long operatorId);
}
