package com.todorkrastev.krastevsgym.model.dto;

import com.todorkrastev.krastevsgym.model.entity.Address;
import com.todorkrastev.krastevsgym.model.entity.Customer;
import com.todorkrastev.krastevsgym.model.entity.Order;
import com.todorkrastev.krastevsgym.model.entity.OrderItem;

import java.util.Set;

public class PurchaseDto {
    private Customer customer;
    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;

    public PurchaseDto() {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
