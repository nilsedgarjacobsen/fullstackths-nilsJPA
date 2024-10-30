package com.nilsedgar.ovningjpah2.Product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ProductDescription {

    @Id
    @GeneratedValue
    private long id;

    private String description;

    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
