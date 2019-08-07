package com.evantou.ecommerce.repos;

import com.evantou.ecommerce.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    @Query("SELECT DISTINCT p.brand FROM Product p")
    List<String> findDistinctBrands();

    @Query("SELECT DISTINCT p.category FROM Product p")
    List<String> findDistinctCategories();
    List<Product> findByBrand(String brand);
    List<Product> findByCategory(String cat);
    List<Product> findByBrandAndCategory(String brand, String cat);
}
