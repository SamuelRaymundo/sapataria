package org.samuelraymundo.sapataria.model.dto;

import java.io.Serializable;
import java.util.Objects;

public class ProductDto implements Serializable {

    private Long id;

    private String description;

    private String brand;

    private String model;

    private CategoryDto category;

    private ProductPurchaseDto productPurchase;

    public ProductDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public ProductPurchaseDto getProductPurchase() {
        return productPurchase;
    }

    public void setProductPurchase(ProductPurchaseDto productPurchase) {
        this.productPurchase = productPurchase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto that = (ProductDto) o;
        return Objects.equals(id, that.id) && Objects.equals(description, that.description) && Objects.equals(brand, that.brand) && Objects.equals(model, that.model) && Objects.equals(category, that.category) && Objects.equals(productPurchase, that.productPurchase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, brand, model, category, productPurchase);
    }
}
