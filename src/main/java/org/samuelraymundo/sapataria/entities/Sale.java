package org.samuelraymundo.sapataria.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

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
    private Date date;

    @Column(nullable = false)
    private Double total;

    @Column(nullable = false, length = 3)
    private String taxCupon;

    public Sale() {
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
}
