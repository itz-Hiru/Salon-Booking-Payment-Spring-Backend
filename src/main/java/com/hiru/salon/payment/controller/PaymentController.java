package com.hiru.salon.payment.controller;

import com.hiru.salon.payment.domain.PaymentMethod;
import com.hiru.salon.payment.modal.PaymentOrder;
import com.hiru.salon.payment.payload.dto.BookingDTO;
import com.hiru.salon.payment.payload.dto.UserDTO;
import com.hiru.salon.payment.payload.response.PaymentLinkResponse;
import com.hiru.salon.payment.service.PaymentService;
import com.stripe.exception.StripeException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping("/create")
    public ResponseEntity<PaymentLinkResponse> createPaymentLink(
                @RequestBody BookingDTO booking,
                @RequestParam PaymentMethod paymentMethod
            ) throws StripeException {

        UserDTO user = new UserDTO();
        user.setFullName("Hirumitha");
        user.setEmail("hirumithakuladewanew@gmail.com");
        user.setId(1L);

        PaymentLinkResponse response = paymentService.createdOrder(user, booking, paymentMethod);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/{paymentOrderId}")
    public ResponseEntity<PaymentOrder> getPaymentOrderById(
            @PathVariable Long paymentOrderId
    ) throws Exception {
        PaymentOrder response = paymentService.getPaymentOrderById(paymentOrderId);
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/proceed")
    public ResponseEntity<Boolean> proceedPaymentOrder(
            @RequestParam String paymentId,
            @RequestParam String paymentLinkId
    ) {
        PaymentOrder paymentOrder = paymentService.getPaymentOrderByPaymentId(paymentLinkId);
        Boolean response = paymentService.proceedPayment(paymentOrder, paymentId, paymentLinkId);
        return ResponseEntity.ok(response);
    }
}
