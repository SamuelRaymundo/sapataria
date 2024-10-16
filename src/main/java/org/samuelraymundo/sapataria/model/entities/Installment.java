package org.samuelraymundo.sapataria.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_installment")
public class Installment implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer installmentQuantity;

    @Column(nullable = false)
    private Double installmentPrice;

    @Column(nullable = false)
    private Date installmentDueDate;

    @Column
    private Date installmentPaymentDate;

    @Column
    private Double installmentAmount;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "payment_method_id")
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "sale_id")
    private Sale sale;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "purchase_id")
    private Purchase purchase;


    public Installment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInstallmentQuantity() {
        return installmentQuantity;
    }

    public void setInstallmentQuantity(Integer installmentQuantity) {
        this.installmentQuantity = installmentQuantity;
    }

    public Double getInstallmentPrice() {
        return installmentPrice;
    }

    public void setInstallmentPrice(Double installmentPrice) {
        this.installmentPrice = installmentPrice;
    }

    public Date getInstallmentDueDate() {
        return installmentDueDate;
    }

    public void setInstallmentDueDate(Date installmentDueDate) {
        this.installmentDueDate = installmentDueDate;
    }

    public Date getInstallmentPaymentDate() {
        return installmentPaymentDate;
    }

    public void setInstallmentPaymentDate(Date installmentPaymentDate) {
        this.installmentPaymentDate = installmentPaymentDate;
    }

    public Double getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(Double installmentAmount) {
        this.installmentAmount = installmentAmount;
    }
}
