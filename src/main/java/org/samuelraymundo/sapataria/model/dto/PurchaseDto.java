package org.samuelraymundo.sapataria.model.dto;

import jakarta.persistence.*;
import org.samuelraymundo.sapataria.model.entities.ProductPurchase;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class PurchaseDto implements Serializable {

    private Long id;

    private Double total;

    private Date date;

    private ProductPurchase productPurchase;

    private SupplierDto supplier;

    private EmployeeDto employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ProductPurchase getProductPurchase() {
        return productPurchase;
    }

    public void setProductPurchase(ProductPurchase productPurchase) {
        this.productPurchase = productPurchase;
    }

    public SupplierDto getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierDto supplier) {
        this.supplier = supplier;
    }

    public EmployeeDto getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDto employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseDto that = (PurchaseDto) o;
        return Objects.equals(id, that.id) && Objects.equals(total, that.total) && Objects.equals(date, that.date) && Objects.equals(productPurchase, that.productPurchase) && Objects.equals(supplier, that.supplier) && Objects.equals(employee, that.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, total, date, productPurchase, supplier, employee);
    }
}
