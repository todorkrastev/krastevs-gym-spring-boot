package com.todorkrastev.krastevsgym.service;

import com.todorkrastev.krastevsgym.model.dto.PurchaseDto;
import com.todorkrastev.krastevsgym.model.dto.PurchaseResponseDto;

public interface CheckoutService {

    PurchaseResponseDto placeOrder(PurchaseDto purchase);
}
