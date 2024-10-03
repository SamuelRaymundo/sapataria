package org.samuelraymundo.sapataria.model.dto;


import org.samuelraymundo.sapataria.model.enums.PaymentMethodEnum;

import java.io.Serializable;
import java.util.Objects;

public class PaymentMethodDto implements Serializable {

    private Long id;

    private PaymentMethodEnum paymentMethod;

    public PaymentMethodDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PaymentMethodEnum getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentMethodDto that = (PaymentMethodDto) o;
        return Objects.equals(id, that.id) && paymentMethod == that.paymentMethod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, paymentMethod);
    }
}
