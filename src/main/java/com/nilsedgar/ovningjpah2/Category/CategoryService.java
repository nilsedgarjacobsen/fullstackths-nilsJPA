package com.nilsedgar.ovningjpah2.Category;

import com.nilsedgar.ovningjpah2.Product.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    public List<Product> findProductsByCategoryId(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get().getProducts();
    }

}
