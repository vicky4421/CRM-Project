package com.vismijatech.main.service;

import com.vismijatech.main.entity.Orders;
import com.vismijatech.main.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService{
    @Autowired
    private OrdersRepository ordersRepository;
    @Override
    public void storeUserOrders(Orders orders) {
        ordersRepository.save(orders);
    }
}
