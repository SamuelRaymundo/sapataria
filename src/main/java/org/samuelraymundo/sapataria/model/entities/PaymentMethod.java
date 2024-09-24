package org.samuelraymundo.sapataria.model.entities;

import jakarta.persistence.*;
import org.samuelraymundo.sapataria.model.enums.PaymentMethodEnum;

import java.io.Serializable;

@Entity
@Table(name = "tb_payment_method")
public class PaymentMethod implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private PaymentMethodEnum paymentMethod;

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
}
