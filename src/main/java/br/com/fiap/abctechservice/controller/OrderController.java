package br.com.fiap.abctechservice.controller;

import br.com.fiap.abctechservice.application.OrderApplication;
import br.com.fiap.abctechservice.application.dto.AssistDto;
import br.com.fiap.abctechservice.application.dto.OrderDto;
import br.com.fiap.abctechservice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderApplication orderApplication;


    public OrderController(@Autowired OrderApplication orderApplication) {
        this.orderApplication = orderApplication;
    }

    @PostMapping()
    public ResponseEntity createOrder(
            @Valid
            @RequestBody
            OrderDto orderDto
    ){
        orderApplication.createOrder(orderDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{id}")
    public ResponseEntity<List<OrderDto>> getOrders(@PathVariable String id) {
        List<OrderDto> list = this.orderApplication.getOrders(Long.parseLong(id));
        return ResponseEntity.ok(list);
    }
}
