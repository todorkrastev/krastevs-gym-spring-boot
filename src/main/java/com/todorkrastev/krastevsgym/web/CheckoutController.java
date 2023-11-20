package com.todorkrastev.krastevsgym.web;

import com.todorkrastev.krastevsgym.model.dto.PurchaseDto;
import com.todorkrastev.krastevsgym.model.dto.PurchaseResponseDto;
import com.todorkrastev.krastevsgym.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponseDto placeOrder(@RequestBody PurchaseDto purchase) {
        PurchaseResponseDto purchaseResponse = this.checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}
