package com.hiru.salon.payment.payload.response;

import lombok.Data;

@Data
public class PaymentLinkResponse {
    private String paymentLinkURL;
    private String paymentLinkId;
}
