package mermody.springframework.recipeproject.services;

import mermody.springframework.recipeproject.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
