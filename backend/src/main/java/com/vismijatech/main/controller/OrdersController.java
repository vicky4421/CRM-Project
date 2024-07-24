package com.vismijatech.main.controller;

import com.vismijatech.main.entity.Orders;
import com.vismijatech.main.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;

    @PostMapping("/storeOrderDetails")
    public ResponseEntity<String> storeOrderDetails(@RequestBody Orders orders){
        ordersService.storeUserOrders(orders);
        return ResponseEntity.ok("Order stored successfully!");
    }
}
