package com.hiru.salon.payment.service;

import com.hiru.salon.payment.domain.PaymentMethod;
import com.hiru.salon.payment.modal.PaymentOrder;
import com.hiru.salon.payment.payload.dto.BookingDTO;
import com.hiru.salon.payment.payload.dto.UserDTO;
import com.hiru.salon.payment.payload.response.PaymentLinkResponse;
import com.stripe.exception.StripeException;

public interface PaymentService  {
    PaymentLinkResponse createdOrder(
            UserDTO user,
            BookingDTO booking,
            PaymentMethod paymentMethod) throws StripeException;

    PaymentOrder getPaymentOrderById(Long id) throws Exception;

    PaymentOrder getPaymentOrderByPaymentId(String paymentId);

    String createStripePaymentLink(
            UserDTO user,
            Double amount,
            Long orderId
    ) throws StripeException;
}
