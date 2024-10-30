package com.nilsedgar.ovningjpah2.Supplier;

import com.nilsedgar.ovningjpah2.Product.Product;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Supplier {

    @Id
            @GeneratedValue
    Long id;

    String name;

    @ManyToMany
    @JoinTable(
            name = "products_suppliers",
            joinColumns = @JoinColumn(name = "supplier_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    List<Product> products;

}
