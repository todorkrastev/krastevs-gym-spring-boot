package com.todorkrastev.krastevsgym.service.impl;

import com.todorkrastev.krastevsgym.model.dto.PurchaseDto;
import com.todorkrastev.krastevsgym.model.dto.PurchaseResponseDto;
import com.todorkrastev.krastevsgym.model.entity.Customer;
import com.todorkrastev.krastevsgym.model.entity.Order;
import com.todorkrastev.krastevsgym.model.entity.OrderItem;
import com.todorkrastev.krastevsgym.repository.CustomerRepository;
import com.todorkrastev.krastevsgym.service.CheckoutService;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private CustomerRepository customerRepository;

    public CheckoutServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public PurchaseResponseDto placeOrder(PurchaseDto purchase) {
        Order order = purchase.getOrder();

        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        Set<OrderItem> orderItems = purchase.getOrderItems();
        orderItems.forEach(order::add);

        order.setBillingAddress(purchase.getBillingAddress());
        order.setShippingAddress(purchase.getShippingAddress());

        Customer customer = purchase.getCustomer();
        customer.add(order);

        this.customerRepository.save(customer);

        return new PurchaseResponseDto(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
