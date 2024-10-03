package org.samuelraymundo.sapataria.model.dto;

import jakarta.persistence.*;
import org.samuelraymundo.sapataria.model.entities.ProductPurchase;
import java.io.Serializable;
import java.util.Date;

public class PurchaseDto implements Serializable {

    private Long id;

    private Double total;

    private Date date;

    private ProductPurchase productPurchase;

    private SupplierDto supplier;

    private EmployeeDto employee;

}
