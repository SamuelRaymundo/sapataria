package org.samuelraymundo.sapataria.model.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class SaleDto implements Serializable {
    private Long id;

    private String local;

    private Date date;

    private Double total;

    private String taxCupon;

    private ClientDto client;

    private EmployeeDto employee;

    public SaleDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getTaxCupon() {
        return taxCupon;
    }

    public void setTaxCupon(String taxCupon) {
        this.taxCupon = taxCupon;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
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
        SaleDto saleDto = (SaleDto) o;
        return Objects.equals(id, saleDto.id) && Objects.equals(local, saleDto.local) && Objects.equals(date, saleDto.date) && Objects.equals(total, saleDto.total) && Objects.equals(taxCupon, saleDto.taxCupon) && Objects.equals(client, saleDto.client) && Objects.equals(employee, saleDto.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, local, date, total, taxCupon, client, employee);
    }
}
