package org.samuelraymundo.sapataria.model.dto;

import java.io.Serializable;
import java.util.Objects;

public class SizeDto implements Serializable {

   private Long id;


    private String size;

    private Integer stockQuantity;

    private Integer minimumQuantity;

    private Integer maximumQuantity;

    private ProductDto product;

    public SizeDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Integer getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setMinimumQuantity(Integer minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public Integer getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(Integer maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public ProductDto getProduct() {
        return product;
    }

    public void setProduct(ProductDto product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SizeDto sizeDto = (SizeDto) o;
        return Objects.equals(id, sizeDto.id) && Objects.equals(size, sizeDto.size) && Objects.equals(stockQuantity, sizeDto.stockQuantity) && Objects.equals(minimumQuantity, sizeDto.minimumQuantity) && Objects.equals(maximumQuantity, sizeDto.maximumQuantity) && Objects.equals(product, sizeDto.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, size, stockQuantity, minimumQuantity, maximumQuantity, product);
    }
}
