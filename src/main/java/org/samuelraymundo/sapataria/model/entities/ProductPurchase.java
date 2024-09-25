package org.samuelraymundo.sapataria.model.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_product_purchase")
public class ProductPurchase implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Double price;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "purchase_id", referencedColumnName = "id")
    private Purchase purchase;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id",referencedColumnName = "id")
    private Product product;

    public ProductPurchase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
