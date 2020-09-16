package mermody.springframework.recipeproject.repositories;

import mermody.springframework.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
