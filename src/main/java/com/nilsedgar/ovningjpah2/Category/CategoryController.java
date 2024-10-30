package com.nilsedgar.ovningjpah2.Category;

import com.nilsedgar.ovningjpah2.Product.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAll() {
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> getById(@RequestParam Long id) {
        return categoryService.findById(id);
    }

    @GetMapping("/products/{id}")
    public List<Product> getProductsByCategoryId(@PathVariable Long id) {
        return categoryService.findProductsByCategoryId(id);
    }

}
