package org.samuelraymundo.sapataria.model.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_sale")
public class Sale implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String local;

    @Column(nullable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date date;

    @Column(nullable = false)

    private Double total;

    @Column(nullable = false, length = 3)
    private String taxCupon;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToMany(mappedBy = "sale")
    @JsonIgnore
    private Set<SaleProd> saleProd = new HashSet<>();

    @OneToMany(mappedBy = "sale")
    @JsonIgnore
    private Set<Installment> installments = new HashSet<>();

    public Sale() {
    }


    public Sale(Long id, String local, Date date, Double total, String taxCupon, Client client, Employee employee, Set<SaleProd> saleProd, Set<Installment> installments) {
        this.id = id;
        this.local = local;
        this.date = date;
        this.total = total;
        this.taxCupon = taxCupon;
        this.client = client;
        this.employee = employee;
        this.saleProd = saleProd;
        this.installments = installments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getlocal() {
        return local;
    }

    public void setlocal(String local) {
        local = local;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Set<SaleProd> getSaleProd() {
        return saleProd;
    }

    public Set<Installment> getInstallments() {
        return installments;
    }


}
