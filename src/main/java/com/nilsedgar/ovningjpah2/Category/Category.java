package com.nilsedgar.ovningjpah2.Category;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.nilsedgar.ovningjpah2.Product.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @JsonIgnore
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    @Id
    @GeneratedValue
    Long id;

    String name;
}
