package ttinh._1.baitap.repository;

import ttinh._1.baitap.entity.Category;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	List<Category> findByUsers_Id(Long userId);
}
