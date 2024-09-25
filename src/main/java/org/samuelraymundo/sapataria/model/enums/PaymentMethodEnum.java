package org.samuelraymundo.sapataria.model.enums;

public enum PaymentMethodEnum {
    CREDIT(1),
    DEBIT(2),
    CASH(3),
    PIX(4);
    
    private Integer code;
    
    private PaymentMethodEnum(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static PaymentMethodEnum getPaymentMethodEnum(int code) {
        for (PaymentMethodEnum paymentMethodEnum : PaymentMethodEnum.values()) {
            if (paymentMethodEnum.getCode() == code) {
                return paymentMethodEnum;
            }
        }
        throw new IllegalArgumentException("There is no payment method with code " + code);
    }
}
