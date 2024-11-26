package ttinh._1.baitap.graphql.resolvers;

import ttinh._1.baitap.entity.Category;
import ttinh._1.baitap.repository.CategoryRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryResolver {

    private final CategoryRepository categoryRepository;

    public CategoryResolver(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @QueryMapping
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @QueryMapping
    public List<Category> getCategoriesByUserId(Long userId) {
        return categoryRepository.findByUsers_Id(userId);
    }
}