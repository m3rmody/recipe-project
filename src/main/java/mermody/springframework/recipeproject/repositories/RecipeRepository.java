package mermody.springframework.recipeproject.repositories;

import mermody.springframework.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
