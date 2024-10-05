package org.samuelraymundo.sapataria.model.dto;

import jakarta.persistence.*;
import org.samuelraymundo.sapataria.model.entities.PaymentMethod;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class InstallmentDto implements Serializable {

    private Long id;

    private Integer installmentQuantity;

    private Double installmentPrice;

    private Date installmentDueDate;

    private Date installmentPaymentDate;

    private Double installmentAmount;

    private PaymentMethod paymentMethod;

    private SaleDto sale;

    private PurchaseDto purchase;

    public InstallmentDto() {
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

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public SaleDto getSale() {
        return sale;
    }

    public void setSale(SaleDto sale) {
        this.sale = sale;
    }

    public PurchaseDto getPurchase() {
        return purchase;
    }

    public void setPurchase(PurchaseDto purchase) {
        this.purchase = purchase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstallmentDto that = (InstallmentDto) o;
        return Objects.equals(id, that.id) && Objects.equals(installmentQuantity, that.installmentQuantity) && Objects.equals(installmentPrice, that.installmentPrice) && Objects.equals(installmentDueDate, that.installmentDueDate) && Objects.equals(installmentPaymentDate, that.installmentPaymentDate) && Objects.equals(installmentAmount, that.installmentAmount) && Objects.equals(paymentMethod, that.paymentMethod) && Objects.equals(sale, that.sale) && Objects.equals(purchase, that.purchase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, installmentQuantity, installmentPrice, installmentDueDate, installmentPaymentDate, installmentAmount, paymentMethod, sale, purchase);
    }
}
