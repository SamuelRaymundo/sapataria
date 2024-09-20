package org.samuelraymundo.sapataria.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_payment_method")
public class PaymentMethod implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String paymentMethod;

    public PaymentMethod() {
    }

    public Long getId() {return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
