package com.nilsedgar.ovningjpah2.Product;

import com.nilsedgar.ovningjpah2.Category.Category;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    Long id;

    @ManyToOne
    Category category;

    String name;

    double price;

    @JoinColumn(referencedColumnName = "id")
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    private ProductDescription description;

}
