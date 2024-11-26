package ttinh._1.baitap.repository;

import ttinh._1.baitap.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}